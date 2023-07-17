import sqlite3

con = sqlite3.connect("library.db")
con.execute("CREATE TABLE book_details(book_id INTEGERS PRIMARY KEY NOT NULL,book_name TEXT NOT NULL,book_qty INTEGER NOT NULL);")
con.execute("CREATE TABLE member_details(member_id INTEGERS PRIMARY KEY NOT NULL, member_name TEXT NOT NULL,email TEXT NOT NULL UNIQUE);")
con.execute("CREATE TABLE issue_details(book_id INTEGER NOT NULL,member_id INTEGER NOT NULL,due_date TEXT NOT NULL,book_qty INTEGER NOT NULL);")
con.close()
