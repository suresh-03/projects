function remove(){
    document.getElementById("msg").remove();
}

function show(){
    var sideBar = document.createElement('div');
    var close = document.createElement("span");
    close.innerText = "close";
    close.style.cursor = "pointer";
    close.style.position = "relative";
    close.style.left = "60px";
    close.onclick = closeBar(sideBar);
    close.style.marginTop = "90px";
    sideBar.appendChild(close);
    sideBar.id = "s-bar";
    sideBar.style.width = "200px";
    sideBar.style.height = "900px";
    sideBar.style.position = "absolute";
    sideBar.style.zIndex = "4";
    sideBar.style.top = "0px";
    document.getElementById("body").style.overflow = "hidden";
    window.scroll({
        top: 0, 
        left: 0, 
        behavior: 'smooth'
      });
    sideBar.style.backgroundColor = "#efefef";
    document.getElementById("side-bar").appendChild(sideBar);
}


function closeBar(ele){
    ele.remove();
}
