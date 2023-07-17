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
    document.getElementById("side-bar").appendChild(sideBar);
}

function closeBar(){
    document.getElementById('s-bar').remove();
    document.getElementById('body').style.overflow = "auto";
    open = false;
}


