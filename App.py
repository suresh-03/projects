from flask import Flask,render_template,url_for,session,request,redirect
import sqlite3
app = Flask(__name__)
app.secret_key = "ahgakjg89"
@app.route('/')
def home():
    if 'user' in session:
        return render_template('home.html')
    return redirect(url_for('login'))

@app.route("/login",methods=['POST','GET'])
def login():
    msg = ""
    if request.method == 'POST':
        if request.form['username'] == 'Admin' and request.form['password'] == 'Admin':
            librarian = request.form['username']
            session['user'] = librarian
            return redirect(url_for('home'))
        else:
            msg = "username or password is incorrect!"
            return render_template("login.html",msg=msg)
    return render_template("login.html")

@app.route("/bookDetails")
def bookDetails():
    return redirect(url_for('viewBooks'))

@app.route("/addBookDetails")
def addBookDetails():
    return render_template('addBookDetails.html')

@app.route("/bookData",methods=['GET','POST'])
def bookData():
    if request.method == 'POST':
        bookId = request.form['bookId']
        bookName = request.form['bookName']
        bookQty = request.form['bookQty']
        with sqlite3.connect("library.db") as con:
            try:
                cur = con.cursor()
                cur.execute("INSERT INTO book_details(book_id,book_name,book_qty)VALUES(?,?,?)",(bookId,bookName,bookQty))
                con.commit()
            except:
                con.rollback()
            finally:
                return redirect(url_for("viewBooks"))


@app.route("/updateBook")
def updateBook():
    return render_template("updateBook.html")

@app.route("/deleteBook")
def deleteBook():
    return render_template("deleteBook.html")

@app.route("/updateBookData",methods=['GET','POST'])
def updateBookData():
    if request.method == "POST":
        bookId = request.form["bookId"]
        bookName = request.form['bookName']
        bookQty = request.form['bookQty']
        with sqlite3.connect("library.db") as con:
            try:
                cur = con.cursor()
                cur.execute("UPDATE book_details SET book_name = ?,book_qty = ? WHERE book_id = ?",(bookName,bookQty,bookId))
                con.commit()
            except:
                cur.rollback()
            finally:
                return redirect(url_for('viewBooks'))
  
            
@app.route("/deleteBookData",methods=['GET','POST'])
def deleteBookData():
    if request.method == "POST":
        bookId = request.form["bookId"]
        with sqlite3.connect("library.db") as con:
            try:
                cur = con.cursor()
                cur.execute("DELETE FROM book_details WHERE book_id = ?",(bookId))
                con.commit()
            except:
                con.rollback()
            finally:
                return redirect(url_for("viewBooks"))
            
@app.route("/viewBooks")  
def viewBooks():  
    con = sqlite3.connect("library.db")  
    con.row_factory = sqlite3.Row  
    cur = con.cursor()  
    cur.execute("SELECT * FROM book_details ORDER BY book_id")  
    rows = cur.fetchall()  
    return render_template("bookDetails.html",rows = rows)

@app.route("/memberDetails")
def memberDetails():
    return redirect(url_for("viewMembers"))

@app.route("/addMemberDetails")
def addMemberDetails():
    return render_template("addMemberDetails.html")

@app.route("/memberData",methods=["GET","POST"])
def memberData():
    if request.method == "POST":
        memberId = request.form['memberId']
        memberName = request.form['memberName']
        email = request.form['email']
        with sqlite3.connect("library.db") as con:
            try:
                cur = con.cursor()
                cur.execute("INSERT INTO member_details(member_id,member_name,email)VALUES(?,?,?)",(memberId,memberName,str(email)))
                con.commit()
            except:
                con.rollback()
            finally:
                return redirect(url_for("viewMembers"))
            
@app.route("/updateMember")
def updateMember():
    return render_template("updateMember.html")

@app.route("/updateMemberData",methods=['GET','POST'])
def updateMemberData():
    if request.method == "POST":
        memberId = request.form["memberId"]
        memberName = request.form['memberName']
        email = request.form['email']
        with sqlite3.connect("library.db") as con:
            try:
                cur = con.cursor()
                cur.execute("UPDATE member_details SET member_name = ?,email = ? WHERE member_id = ?",(memberName,email,memberId))
                con.commit()
            except:
                cur.rollback()

            finally:
                return redirect(url_for('viewMembers'))


@app.route("/deleteMember")
def deleteMember():
    return render_template("deleteMember.html")

@app.route("/deleteMemberData",methods=['GET','POST'])
def deleteMemberData():
    if request.method == "POST":
        memberId = request.form["memberId"]
        with sqlite3.connect("library.db") as con:
            try:
                cur = con.cursor()
                cur.execute("DELETE FROM member_details WHERE member_id = ?",(memberId))
                con.commit()
            except:
                con.rollback()
            finally:
                return redirect(url_for("viewMembers"))
            
@app.route("/viewMembers")  
def viewMembers():  
    con = sqlite3.connect("library.db")  
    con.row_factory = sqlite3.Row  
    cur = con.cursor()  
    cur.execute("SELECT * FROM member_details ORDER BY member_id")  
    rows = cur.fetchall()  
    return render_template("memberDetails.html",rows = rows)

@app.route("/issueBook")
def issueBook():
    return render_template("issueBook.html")

@app.route("/issueBookMember",methods=['GET','POST'])
def issueBookMember():
    msg = ""
    if request.method == "POST":
        bookId = request.form["bookId"]
        memberId = request.form["memberId"]
        bookQty = request.form["bookQty"]
        dueDate = request.form["dueDate"]
        with sqlite3.connect("library.db") as con:
            cur = con.cursor()
            cur.execute("SELECT book_id FROM book_details WHERE book_id = ?",(bookId))
            try:
                if cur.fetchone()[0]:
                    cur.execute("SELECT book_qty FROM book_details WHERE book_id = ?",(bookId))
                    qty = cur.fetchone()[0]
                    if qty == 0:
                        msg = "Out of Stock!"
                    elif (qty-int(bookQty)) < 0:
                        msg = f"We Have Only {qty} Books!"
                    else:
                        cur.execute("SELECT member_id FROM member_details WHERE member_id = ?",(memberId))
                        if cur.fetchone()[0]:
                            msg = f"{bookQty} of {bookId} books issued to {memberId} Successfully!"
                            cur.execute("SELECT book_qty FROM book_details WHERE book_id = ?",(bookId))
                            qty = cur.fetchone()[0]
                            cur.execute("UPDATE book_details SET book_qty = ? WHERE book_id = ?",((qty-int(bookQty)),bookId))
                            cur.execute("INSERT INTO issue_details(book_id,member_id,due_date,book_qty)VALUES(?,?,?,?)",(bookId,memberId,dueDate,bookQty))
                        else:
                            msg = f"{memberId} is not a member of this library!"
            except:   
                msg = "Book id is not exist!"
                print(msg)
            con.commit()
    return redirect(url_for("viewIssued"))

@app.route("/getIssueDetails")
def getIssueDetails():
    con = sqlite3.connect("library.db")  
    con.row_factory = sqlite3.Row  
    cur = con.cursor()  
    # cur.execute("SELECT book_details.book_id,book_details.book_name,issue_details.member_id,member_details.member_name,member_details.email,issue_details.book_qty,issue_details.due_date FROM book_details INNER JOIN issue_details ON book_details.book_id = issue_details.book_id INNER JOIN member_details ON member_details.member_id = issue_details.member_id"

    cur.execute("SELECT issue_details.book_id,book_details.book_name,issue_details.member_id,member_details.member_name,member_details.email,issue_details.due_date,issue_details.book_qty from issue_details,book_details,member_details WHERE issue_details.book_id = book_details.book_id and issue_details.member_id = member_details.member_id")
    rows = cur.fetchall()

    return render_template("issueMoreInfo.html",rows = rows)

@app.route("/viewIssuedBooks")  
def viewIssued():  
    con = sqlite3.connect("library.db")  
    con.row_factory = sqlite3.Row  
    cur = con.cursor()  
    cur.execute("SELECT * FROM issue_details ORDER BY book_id")  
    rows = cur.fetchall()  
    return render_template("issuedDetails.html",rows = rows)

@app.route("/logout")
def logout():
    msg = ""
    session.pop("user",None)
    msg = "logged out successfully!"
    return render_template('login.html',msg=msg)
        
