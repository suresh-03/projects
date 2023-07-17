function remove(){
    document.getElementById("msg").remove();
}

open = false;

function decide(){
    if(open){
        closeBar();
        open = false;
    }
    else{
        show();
        open = true;
    }
}

function show(){
    var sideBar = document.createElement('div');
    sideBar.id = "s-bar";
    var list = document.createElement("ul");
    list.style.listStyle = "none";
    list.style.position = "relative";
    list.style.top = "20px";
    var linkList = ["/","/viewBooks","/viewMembers","/issueBook","/issueReturn","viewIssuedBooks"];
    var linkName = ["home","book stock details","member details","issue book to member","issue return","issued book details"];
    for(var i = 0; i < linkName.length; i++){
        var li = document.createElement("li");
        var link = document.createElement("a");
        var hr = document.createElement("hr");

        hr.width = "100%";
        hr.style.position = "relative";

        link.href = linkList[i];
        link.innerText = linkName[i];
        link.style.color = "black";
        link.style.fontSize = "xx-small";
        link.style.textDecoration = "none";
        link.style.fontFamily = "Arial, Helvetica, sans-serif";
        link.style.transition = "0.25s";
        link.classList.add("side-bar-link");

        li.appendChild(link);
        li.appendChild(hr);

        li.style.paddingBottom = "25px";

        list.appendChild(li);
    }
    sideBar.style.width = "230px";
    sideBar.style.height = "900px";
    sideBar.style.position = "absolute";
    sideBar.style.zIndex = "4";
    sideBar.style.top = "65px";
    sideBar.style.borderTopRightRadius = "10px";
    document.getElementById("body").style.overflow = "hidden";
    window.scroll({
        top: 0, 
        left: 0, 
        behavior: 'smooth'
      });
    sideBar.style.backgroundColor = "#efefef";
    sideBar.appendChild(list);
    document.getElementById("side-bar").appendChild(sideBar);
}

function closeBar(){
    document.getElementById('s-bar').remove();
    document.getElementById('body').style.overflow = "auto";
    open = false;
}


