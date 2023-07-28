let playerScore = 0;
let computerScore = 0;

let batOrBowl =
  '<div class="bat-bowl">Select Batting or Bowling</div><div class="bb-btn"><button id="ba" >BAT</button><button id="bo">BOWL</button></div>';

let oddOrEven =
  '<div class="odd-even">Select Odd or Even</div><div class="oe-btn"><button id="o" >odd</button><button id="e">even</button></div>';

let evenComBat =
  "<p>It's <strong id='eve'>EVEN</strong><br>" +
  "<br>Computer Won the Toss,Elected to <strong id='batt'>BAT</strong></p>";
let evenComBowl =
  "<p>It's <strong id='eve'>EVEN</strong> <br>" +
  "<br>Computer Won the Toss,Elected to ,<strong id='bow'>BOWL</strong></p>";
let oddComBat =
  "<p>It's <strong id='od'>ODD</strong> <br>" +
  "<br>Computer Won the Toss,Elected to <strong id='batt'>BAT</strong></p>";
let oddComBowl =
  "<p>It's <strong id='od'>ODD</strong> <br>" +
  "<br>Computer Won the Toss,Elected to <strong id='bow'>BOWL</strong></p>";

let playOdd =
  "<div id='pl'>It's <strong id='od'>ODD</strong><br><br>You Won the Toss, " +
  batOrBowl +
  "</div>";
let playEven =
  "<div id='pl'>It's <strong id='eve'>EVEN</strong><br><br>You Won the Toss, " +
  batOrBowl +
  "</div>";
let selBat =
  "<p>You selected <strong id='batt'>Batting</strong><br><br>Click the number!</p>";
let selBowl =
  "<p>You selected <strong id='bow'>Bowling</strong><br><br>Click the number!</p>";

let playerOut = false;
let computerOut = false;
let reset = "<button id='re'>Let's Go!</button>";

document.getElementById("w").onclick = () => {
  document.getElementById("title").style.backgroundColor = "#3d3d3d";
  document.getElementById("main").style.backgroundColor = "white";
  document.getElementById("m-b").style.backgroundColor = "#3d3d3d";
  document.getElementById("title").style.color = "white";
  document.getElementById("message").style.color = "#3d3d3d";
};

document.getElementById("d").onclick = () => {
  document.getElementById("main").style.backgroundColor = "#3d3d3d";
  document.getElementById("title").style.backgroundColor = "white";
  document.getElementById("m-b").style.backgroundColor = "white";
  document.getElementById("title").style.color = "black";
  document.getElementById("message").style.color = "white";
};

let res = () =>
  (document.getElementById("re").onclick = () => {
    location.reload();
  });

let disableClick = () => {
  document.getElementById("one").style.pointerEvents = "none";
  document.getElementById("two").style.pointerEvents = "none";
  document.getElementById("thr").style.pointerEvents = "none";
  document.getElementById("fou").style.pointerEvents = "none";
  document.getElementById("fiv").style.pointerEvents = "none";
  document.getElementById("six").style.pointerEvents = "none";
};

let PlayerBowl = () => {
  document.getElementById("one").onclick = () => {
    let computer = Math.floor(Math.random() * 12 + 1);
    if (computer == 1 || computer == 7) {
      document.getElementById("message").innerHTML =
        "You put 1,computer put 1,Computer Out!";
      computerOut = true;
      document.getElementById("p-num").innerText = "1";
      document.getElementById("c-num").innerText = "1";
      playerChase();
    } else if (computer == 2 || computer == 8) {
      document.getElementById("message").innerHTML =
        "You put 1, computer put 2";
      document.getElementById("p-num").innerText = "1";
      document.getElementById("c-num").innerText = "2";
      computerScore += 2;
      document.getElementById("c-s").innerText = computerScore;
    } else if (computer == 3 || computer == 9) {
      document.getElementById("message").innerHTML =
        "You put 1, computer put 3";
      document.getElementById("p-num").innerText = "1";
      document.getElementById("c-num").innerText = "3";
      computerScore += 3;
      document.getElementById("c-s").innerText = computerScore;
    } else if (computer == 4 || computer == 10) {
      document.getElementById("message").innerHTML =
        "You put 1, computer put 4";
      document.getElementById("p-num").innerText = "1";
      document.getElementById("c-num").innerText = "4";
      computerScore += 4;
      document.getElementById("c-s").innerText = computerScore;
    } else if (computer == 5 || computer == 11) {
      document.getElementById("message").innerHTML =
        "You put 1, computer put 5";
      document.getElementById("p-num").innerText = "1";
      document.getElementById("c-num").innerText = "5";
      computerScore += 5;
      document.getElementById("c-s").innerText = computerScore;
    } else {
      document.getElementById("message").innerHTML =
        "You put 1, computer put 6";
      document.getElementById("p-num").innerText = "1";
      document.getElementById("c-num").innerText = "6";
      computerScore += 6;
      document.getElementById("c-s").innerText = computerScore;
    }
    winCheckComputerChase();
  };
  //-----------------------------------------------------------------------------------------
  document.getElementById("two").onclick = () => {
    let computer = Math.floor(Math.random() * 12 + 1);

    if (computer == 1 || computer == 7) {
      document.getElementById("message").innerHTML = "You put 2,computer put 1";
      computerScore += 1;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "2";
      document.getElementById("c-num").innerText = "1";
    } else if (computer == 2 || computer == 8) {
      document.getElementById("message").innerHTML =
        "You put 2, computer put 2,Computer Out!";
      computerOut = true;
      document.getElementById("p-num").innerText = "2";
      document.getElementById("c-num").innerText = "2";
      playerChase();
    } else if (computer == 3 || computer == 9) {
      document.getElementById("message").innerHTML =
        "You put 2, computer put 3";
      computerScore += 3;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "2";
      document.getElementById("c-num").innerText = "3";
    } else if (computer == 4 || computer == 10) {
      document.getElementById("message").innerHTML =
        "You put 2, computer put 4";
      computerScore += 4;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "2";
      document.getElementById("c-num").innerText = "4";
    } else if (computer == 5 || computer == 11) {
      document.getElementById("message").innerHTML =
        "You put 2, computer put 5";
      computerScore += 5;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "2";
      document.getElementById("c-num").innerText = "5";
    } else {
      document.getElementById("message").innerHTML =
        "You put 2, computer put 6";
      computerScore += 6;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "2";
      document.getElementById("c-num").innerText = "6";
    }
    winCheckComputerChase();
  };
  //-----------------------------------------------------------------------------------------
  document.getElementById("thr").onclick = () => {
    let computer = Math.floor(Math.random() * 12 + 1);

    if (computer == 1 || computer == 7) {
      document.getElementById("message").innerHTML = "You put 3,computer put 1";
      computerScore += 1;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "3";
      document.getElementById("c-num").innerText = "1";
    } else if (computer == 2 || computer == 8) {
      document.getElementById("message").innerHTML =
        "You put 3, computer put 2";
      computerScore += 2;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "3";
      document.getElementById("c-num").innerText = "2";
    } else if (computer == 3 || computer == 9) {
      document.getElementById("message").innerHTML =
        "You put 3, computer put 3,Computer Out!";
      computerOut = true;
      document.getElementById("p-num").innerText = "3";
      document.getElementById("c-num").innerText = "3";
      playerChase();
    } else if (computer == 4 || computer == 10) {
      document.getElementById("message").innerHTML =
        "You put 3, computer put 4";
      computerScore += 4;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "3";
      document.getElementById("c-num").innerText = "4";
    } else if (computer == 5 || computer == 11) {
      document.getElementById("message").innerHTML =
        "You put 3, computer put 5";
      computerScore += 5;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "3";
      document.getElementById("c-num").innerText = "5";
    } else {
      document.getElementById("message").innerHTML =
        "You put 3, computer put 6";
      computerScore += 6;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "3";
      document.getElementById("c-num").innerText = "6";
    }
    winCheckComputerChase();
  };
  // ---------------------------------------------------------------------------------------
  document.getElementById("fou").onclick = () => {
    let computer = Math.floor(Math.random() * 12 + 1);

    if (computer == 1 || computer == 7) {
      document.getElementById("message").innerHTML = "You put 4,computer put 1";
      computerScore += 1;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "4";
      document.getElementById("c-num").innerText = "1";
    } else if (computer == 2 || computer == 8) {
      document.getElementById("message").innerHTML =
        "You put 4, computer put 2";
      computerScore += 2;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "4";
      document.getElementById("c-num").innerText = "2";
    } else if (computer == 3 || computer == 9) {
      document.getElementById("message").innerHTML =
        "You put 4, computer put 3";
      computerScore += 3;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "4";
      document.getElementById("c-num").innerText = "3";
    } else if (computer == 4 || computer == 10) {
      document.getElementById("message").innerHTML =
        "You put 4, computer put 4,Computer Out!";
      computerOut = true;
      document.getElementById("p-num").innerText = "4";
      document.getElementById("c-num").innerText = "4";
      playerChase();
    } else if (computer == 5 || computer == 11) {
      document.getElementById("message").innerHTML =
        "You put 4, computer put 5";
      computerScore += 5;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "4";
      document.getElementById("c-num").innerText = "5";
    } else {
      document.getElementById("message").innerHTML =
        "You put 4, computer put 6";
      computerScore += 6;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "4";
      document.getElementById("c-num").innerText = "6";
    }
    winCheckComputerChase();
  };
  //-----------------------------------------------------------------------------------------
  document.getElementById("fiv").onclick = () => {
    let computer = Math.floor(Math.random() * 12 + 1);

    if (computer == 1 || computer == 7) {
      document.getElementById("message").innerHTML = "You put 5,computer put 1";
      computerScore += 1;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "5";
      document.getElementById("c-num").innerText = "1";
    } else if (computer == 2 || computer == 8) {
      document.getElementById("message").innerHTML =
        "You put 5, computer put 2";
      computerScore += 2;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "5";
      document.getElementById("c-num").innerText = "2";
    } else if (computer == 3 || computer == 9) {
      document.getElementById("message").innerHTML =
        "You put 5, computer put 3";
      computerScore += 3;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "5";
      document.getElementById("c-num").innerText = "3";
    } else if (computer == 4 || computer == 10) {
      document.getElementById("message").innerHTML =
        "You put 5, computer put 4";
      computerScore += 4;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "5";
      document.getElementById("c-num").innerText = "4";
    } else if (computer == 5 || computer == 11) {
      document.getElementById("message").innerHTML =
        "You put 5, computer put 5,Computer Out!";
      computerOut = true;
      document.getElementById("p-num").innerText = "5";
      document.getElementById("c-num").innerText = "5";
      playerChase();
    } else {
      document.getElementById("message").innerHTML =
        "You put 5, computer put 6";
      computerScore += 6;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "5";
      document.getElementById("c-num").innerText = "6";
    }
    winCheckComputerChase();
  };
  //-----------------------------------------------------------------------------------------
  document.getElementById("six").onclick = () => {
    let computer = Math.floor(Math.random() * 12 + 1);

    if (computer == 1 || computer == 7) {
      document.getElementById("message").innerHTML = "You put 6,computer put 1";
      computerScore += 1;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "6";
      document.getElementById("c-num").innerText = "1";
    } else if (computer == 2 || computer == 8) {
      document.getElementById("message").innerHTML =
        "You put 6, computer put 2";
      computerScore += 2;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "6";
      document.getElementById("c-num").innerText = "2";
    } else if (computer == 3 || computer == 9) {
      document.getElementById("message").innerHTML =
        "You put 6, computer put 3";
      computerScore += 3;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "6";
      document.getElementById("c-num").innerText = "3";
    } else if (computer == 4 || computer == 10) {
      document.getElementById("message").innerHTML =
        "You put 6, computer put 4";
      computerScore += 4;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "6";
      document.getElementById("c-num").innerText = "4";
    } else if (computer == 5 || computer == 11) {
      document.getElementById("message").innerHTML =
        "You put 6, computer put 5";
      computerScore += 5;
      document.getElementById("c-s").innerText = computerScore;
      document.getElementById("p-num").innerText = "6";
      document.getElementById("c-num").innerText = "5";
    } else {
      document.getElementById("message").innerHTML =
        "You put 6, computer put 6, Computer Out!";
      computerOut = true;
      document.getElementById("p-num").innerText = "6";
      document.getElementById("c-num").innerText = "6";
      playerChase();
    }
    winCheckComputerChase();
  };
  //-----------------------------------------------------------------------------------------
};

let PlayerBat = () => {
  document.getElementById("one").onclick = () => {
    let computer = Math.floor(Math.random() * 12 + 1);
    if (computer == 1 || computer == 7) {
      document.getElementById("message").innerHTML =
        "You put 1,computer put 1,Player Out!";
      document.getElementById("c-num").innerText = "1";
      document.getElementById("p-num").innerText = "1";
      playerOut = true;
      computerChase();
    } else if (computer == 2 || computer == 8) {
      document.getElementById("message").innerHTML =
        "You put 1, computer put 2";
      playerScore += 1;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "1";
      document.getElementById("c-num").innerText = "2";
    } else if (computer == 3 || computer == 9) {
      document.getElementById("message").innerHTML =
        "You put 1, computer put 3";
      playerScore += 1;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "1";
      document.getElementById("c-num").innerText = "3";
    } else if (computer == 4 || computer == 10) {
      document.getElementById("message").innerHTML =
        "You put 1, computer put 4";
      playerScore += 1;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "1";
      document.getElementById("c-num").innerText = "4";
    } else if (computer == 5 || computer == 11) {
      document.getElementById("message").innerHTML =
        "You put 1, computer put 5";
      playerScore += 1;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "1";
      document.getElementById("c-num").innerText = "5";
    } else {
      document.getElementById("message").innerHTML =
        "You put 1, computer put 6";
      playerScore += 1;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "1";
      document.getElementById("c-num").innerText = "6";
    }
    winCheckPlayerChase();
  };
  //-----------------------------------------------------------------------------------------
  document.getElementById("two").onclick = () => {
    let computer = Math.floor(Math.random() * 12 + 1);

    if (computer == 1 || computer == 7) {
      document.getElementById("message").innerHTML = "You put 2,computer put 1";
      playerScore += 2;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "2";
      document.getElementById("c-num").innerText = "1";
    } else if (computer == 2 || computer == 8) {
      document.getElementById("message").innerHTML =
        "You put 2, computer put 2,Player Out!";
      document.getElementById("p-num").innerText = "2";
      document.getElementById("c-num").innerText = "2";
      playerOut = true;
      computerChase();
    } else if (computer == 3 || computer == 9) {
      document.getElementById("message").innerHTML =
        "You put 2, computer put 3";
      playerScore += 2;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "2";
      document.getElementById("c-num").innerText = "3";
    } else if (computer == 4 || computer == 10) {
      document.getElementById("message").innerHTML =
        "You put 2, computer put 4";
      playerScore += 2;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "2";
      document.getElementById("c-num").innerText = "4";
    } else if (computer == 5 || computer == 11) {
      document.getElementById("message").innerHTML =
        "You put 2, computer put 5";
      playerScore += 2;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "2";
      document.getElementById("c-num").innerText = "5";
    } else {
      document.getElementById("message").innerHTML =
        "You put 2, computer put 6";
      playerScore += 2;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "2";
      document.getElementById("c-num").innerText = "6";
    }
    winCheckPlayerChase();
  };
  //-----------------------------------------------------------------------------------------
  document.getElementById("thr").onclick = () => {
    let computer = Math.floor(Math.random() * 12 + 1);

    if (computer == 1 || computer == 7) {
      document.getElementById("message").innerHTML = "You put 3,computer put 1";
      playerScore += 3;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "3";
      document.getElementById("c-num").innerText = "1";
    } else if (computer == 2 || computer == 8) {
      document.getElementById("message").innerHTML =
        "You put 3, computer put 2";
      playerScore += 3;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "3";
      document.getElementById("c-num").innerText = "2";
    } else if (computer == 3 || computer == 9) {
      document.getElementById("message").innerHTML =
        "You put 3, computer put 3,Player Out!";
      document.getElementById("p-num").innerText = "3";
      document.getElementById("c-num").innerText = "3";
      playerOut = true;
      computerChase();
    } else if (computer == 4 || computer == 10) {
      document.getElementById("message").innerHTML =
        "You put 3, computer put 4";
      playerScore += 3;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "3";
      document.getElementById("c-num").innerText = "4";
    } else if (computer == 5 || computer == 11) {
      document.getElementById("message").innerHTML =
        "You put 3, computer put 5";
      playerScore += 3;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "3";
      document.getElementById("c-num").innerText = "5";
    } else {
      document.getElementById("message").innerHTML =
        "You put 3, computer put 6";
      playerScore += 3;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "3";
      document.getElementById("c-num").innerText = "6";
    }
    winCheckPlayerChase();
  };
  // ---------------------------------------------------------------------------------------
  document.getElementById("fou").onclick = () => {
    let computer = Math.floor(Math.random() * 12 + 1);

    if (computer == 1 || computer == 7) {
      document.getElementById("message").innerHTML = "You put 4,computer put 1";
      playerScore += 4;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "4";
      document.getElementById("c-num").innerText = "1";
    } else if (computer == 2 || computer == 8) {
      document.getElementById("message").innerHTML =
        "You put 4, computer put 2";
      playerScore += 4;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "4";
      document.getElementById("c-num").innerText = "2";
    } else if (computer == 3 || computer == 9) {
      document.getElementById("message").innerHTML =
        "You put 4, computer put 3";
      playerScore += 4;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "4";
      document.getElementById("c-num").innerText = "3";
    } else if (computer == 4 || computer == 10) {
      document.getElementById("message").innerHTML =
        "You put 4, computer put 4,Player Out!";
      document.getElementById("p-num").innerText = "4";
      document.getElementById("c-num").innerText = "4";
      playerOut = true;
      computerChase();
    } else if (computer == 5 || computer == 11) {
      document.getElementById("message").innerHTML =
        "You put 4, computer put 5";
      playerScore += 4;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "4";
      document.getElementById("c-num").innerText = "5";
    } else {
      document.getElementById("message").innerHTML =
        "You put 4, computer put 6";
      playerScore += 4;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "4";
      document.getElementById("c-num").innerText = "6";
    }
    winCheckPlayerChase();
  };
  //-----------------------------------------------------------------------------------------
  document.getElementById("fiv").onclick = () => {
    let computer = Math.floor(Math.random() * 12 + 1);

    if (computer == 1 || computer == 7) {
      document.getElementById("message").innerHTML = "You put 5,computer put 1";
      playerScore += 5;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "5";
      document.getElementById("c-num").innerText = "1";
    } else if (computer == 2 || computer == 8) {
      document.getElementById("message").innerHTML =
        "You put 5, computer put 2";
      playerScore += 5;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "5";
      document.getElementById("c-num").innerText = "2";
    } else if (computer == 3 || computer == 9) {
      document.getElementById("message").innerHTML =
        "You put 5, computer put 3";
      playerScore += 5;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "5";
      document.getElementById("c-num").innerText = "3";
    } else if (computer == 4 || computer == 10) {
      document.getElementById("message").innerHTML =
        "You put 5, computer put 4";
      playerScore += 5;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "5";
      document.getElementById("c-num").innerText = "4";
    } else if (computer == 5 || computer == 11) {
      document.getElementById("message").innerHTML =
        "You put 5, computer put 5,Player Out!";
      document.getElementById("p-num").innerText = "5";
      document.getElementById("c-num").innerText = "5";
      playerOut = true;
      computerChase();
    } else {
      document.getElementById("message").innerHTML =
        "You put 5, computer put 6";
      playerScore += 5;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "5";
      document.getElementById("c-num").innerText = "6";
    }
    winCheckPlayerChase();
  };
  //-----------------------------------------------------------------------------------------
  document.getElementById("six").onclick = () => {
    let computer = Math.floor(Math.random() * 12 + 1);

    if (computer == 1 || computer == 7) {
      document.getElementById("message").innerHTML = "You put 6,computer put 1";
      playerScore += 6;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "6";
      document.getElementById("c-num").innerText = "1";
    } else if (computer == 2 || computer == 8) {
      document.getElementById("message").innerHTML =
        "You put 6, computer put 2";
      playerScore += 6;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "6";
      document.getElementById("c-num").innerText = "2";
    } else if (computer == 3 || computer == 9) {
      document.getElementById("message").innerHTML =
        "You put 6, computer put 3";
      playerScore += 6;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "6";
      document.getElementById("c-num").innerText = "3";
    } else if (computer == 4 || computer == 10) {
      document.getElementById("message").innerHTML =
        "You put 6, computer put 4";
      playerScore += 6;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "6";
      document.getElementById("c-num").innerText = "4";
    } else if (computer == 5 || computer == 11) {
      document.getElementById("message").innerHTML =
        "You put 6, computer put 5";
      playerScore += 6;
      document.getElementById("p-s").innerText = playerScore;
      document.getElementById("p-num").innerText = "6";
      document.getElementById("c-num").innerText = "5";
    } else {
      document.getElementById("message").innerHTML =
        "You put 6, computer put 6, Player Out!";
      playerOut = true;
      document.getElementById("p-num").innerText = "6";
      document.getElementById("c-num").innerText = "6";
      computerChase();
    }
    winCheckPlayerChase();
  };
  //-----------------------------------------------------------------------------------------
};

let playerChase = () => {
  if (computerOut) {
    document.getElementById("message").innerHTML =
      "Computer Out,Target: " + (computerScore + 1);
  }
  PlayerBat();
};
let computerChase = () => {
  if (playerOut) {
    document.getElementById("message").innerHTML =
      "Player Out,Target: " + (playerScore + 1);
  }
  PlayerBowl();
};

let winCheckPlayerChase = () => {
  if (computerOut && playerScore > computerScore) {
    document.getElementById("message").innerHTML =
      "Player Win!" + "<br>" + "rematch?" + "<br>" + reset;
    disableClick();
    res();
  } else if (playerOut && computerScore > playerScore) {
    document.getElementById("message").innerHTML =
      "Computer Won by " +
      (computerScore - playerScore) +
      " runs" +
      "<br>" +
      "rematch?" +
      "<br>" +
      reset;
    disableClick();
    res();
  } else if (playerOut && computerOut && playerScore == computerScore) {
    document.getElementById("message").innerHTML =
      "Match Draw" + "<br>" + "rematch?" + "<br>" + reset;
    disableClick();

    res();
  }
};

let winCheckComputerChase = () => {
  if (playerOut && playerScore < computerScore) {
    document.getElementById("message").innerHTML =
      "Computer Win!" + "<br>" + "rematch?" + "<br>" + reset;
    disableClick();

    res();
  } else if (computerOut && playerScore > computerScore) {
    document.getElementById("message").innerHTML =
      "Player Won by " +
      (playerScore - computerScore) +
      " runs" +
      "<br>" +
      "rematch?" +
      "<br>" +
      reset;
    disableClick();

    res();
  } else if (computerOut && playerOut && playerScore == computerScore) {
    document.getElementById("message").innerHTML =
      "Match Draw" + "<br>" + "rematch?" + "<br>" + reset;
    disableClick();

    res();
  }
};

document.getElementById("let").onclick = () => {
  document.getElementById("message").innerHTML = "";
  document.getElementById("message").innerHTML = oddOrEven;
  // for clicking odd
  document.getElementById("o").onclick = () => {
    document.getElementById("message").innerHTML = "";
    document.getElementById("message").innerHTML =
      "<div class='ms'>you selected <strong style='background-color:#3d3d3d; padding:10px; border-radius:8px;'>ODD</strong>" +
      "<br><br> Click the Number!</div>";
    let computer = Math.floor(Math.random() * 12 + 1);
    // player clicks number 1!
    document.getElementById("one").onclick = () => {
      if (computer == 1 || computer == 7) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "1";
        document.getElementById("c-num").innerText = "1";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;

          PlayerBat();
        }
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 2 || computer == 8) {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;

        document.getElementById("p-num").innerText = "1";
        document.getElementById("c-num").innerText = "2";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -------------------------------------------------------------------------------------
      else if (computer == 3 || computer == 9) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "1";
        document.getElementById("c-num").innerText = "3";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // ------------------------------------------------------------------------------------
      else if (computer == 4 || computer == 10) {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "1";
        document.getElementById("c-num").innerText = "4";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 5 || computer == 11) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "1";
        document.getElementById("c-num").innerText = "5";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // -------------------------------------------------------------------------------------
      else {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "1";
        document.getElementById("c-num").innerText = "6";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
    };
    // player clicks number 2!
    document.getElementById("two").onclick = () => {
      if (computer == 2 || computer == 8) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "2";
        document.getElementById("c-num").innerText = "2";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 1 || computer == 7) {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "2";
        document.getElementById("c-num").innerText = "1";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -------------------------------------------------------------------------------------
      else if (computer == 4 || computer == 10) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "2";
        document.getElementById("c-num").innerText = "4";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // ------------------------------------------------------------------------------------
      else if (computer == 3 || computer == 9) {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "2";
        document.getElementById("c-num").innerText = "3";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 6 || computer == 12) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "2";
        document.getElementById("c-num").innerText = "6";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // -------------------------------------------------------------------------------------
      else {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "2";
        document.getElementById("c-num").innerText = "5";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
    };
    // player clicks number 3!
    document.getElementById("thr").onclick = () => {
      if (computer == 1 || computer == 7) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "3";
        document.getElementById("c-num").innerText = "1";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 2 || computer == 8) {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "3";
        document.getElementById("c-num").innerText = "2";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -------------------------------------------------------------------------------------
      else if (computer == 3 || computer == 9) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "3";
        document.getElementById("c-num").innerText = "3";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // ------------------------------------------------------------------------------------
      else if (computer == 4 || computer == 10) {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "3";
        document.getElementById("c-num").innerText = "4";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 5 || computer == 11) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "3";
        document.getElementById("c-num").innerText = "5";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // -------------------------------------------------------------------------------------
      else {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "3";
        document.getElementById("c-num").innerText = "6";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
    };
    // player clicks number 4!
    document.getElementById("fou").onclick = () => {
      if (computer == 2 || computer == 8) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "4";
        document.getElementById("c-num").innerText = "2";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 1 || computer == 7) {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "4";
        document.getElementById("c-num").innerText = "1";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -------------------------------------------------------------------------------------
      else if (computer == 4 || computer == 10) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "4";
        document.getElementById("c-num").innerText = "4";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // ------------------------------------------------------------------------------------
      else if (computer == 3 || computer == 9) {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "4";
        document.getElementById("c-num").innerText = "3";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 6 || computer == 12) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "4";
        document.getElementById("c-num").innerText = "6";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // -------------------------------------------------------------------------------------
      else {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "4";
        document.getElementById("c-num").innerText = "5";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
    };
    // player clicks number 5!
    document.getElementById("fiv").onclick = () => {
      if (computer == 1 || computer == 7) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "5";
        document.getElementById("c-num").innerText = "1";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 2 || computer == 8) {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "5";
        document.getElementById("c-num").innerText = "2";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -------------------------------------------------------------------------------------
      else if (computer == 3 || computer == 9) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "5";
        document.getElementById("c-num").innerText = "3";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // ------------------------------------------------------------------------------------
      else if (computer == 4 || computer == 10) {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "5";
        document.getElementById("c-num").innerText = "4";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 5 || computer == 11) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "5";
        document.getElementById("c-num").innerText = "5";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // -------------------------------------------------------------------------------------
      else {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "5";
        document.getElementById("c-num").innerText = "6";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
    };
    // player clicks number 6!
    document.getElementById("six").onclick = () => {
      if (computer == 2 || computer == 8) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "6";
        document.getElementById("c-num").innerText = "2";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 1 || computer == 7) {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "6";
        document.getElementById("c-num").innerText = "1";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -------------------------------------------------------------------------------------
      else if (computer == 4 || computer == 10) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "6";
        document.getElementById("c-num").innerText = "4";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // ------------------------------------------------------------------------------------
      else if (computer == 3 || computer == 9) {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "6";
        document.getElementById("c-num").innerText = "3";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 6 || computer == 12) {
        document.getElementById("message").innerHTML = "";
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "6";
        document.getElementById("c-num").innerText = "6";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = evenComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = evenComBowl;
          PlayerBat();
        }
      }
      // -------------------------------------------------------------------------------------
      else {
        document.getElementById("message").innerHTML = "";
        document.getElementById("message").innerHTML = playOdd;
        document.getElementById("p-num").innerText = "6";
        document.getElementById("c-num").innerText = "5";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
    };
  };
  document.getElementById("e").onclick = () => {
    document.getElementById("message").innerHTML =
      "<div class='ms'>you selected <strong style='background-color:#3d3d3d; padding:10px; border-radius:8px;'>EVEN</strong>" +
      "<br><br> Click the Number!</div>";
    let computer = Math.floor(Math.random() * 12 + 1);
    // player clicks number 1!
    document.getElementById("one").onclick = () => {
      if (computer == 1 || computer == 7) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "1";
        document.getElementById("c-num").innerText = "1";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 2 || computer == 8) {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "1";
        document.getElementById("c-num").innerText = "2";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
      // -------------------------------------------------------------------------------------
      else if (computer == 3 || computer == 9) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "1";
        document.getElementById("c-num").innerText = "3";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // ------------------------------------------------------------------------------------
      else if (computer == 4 || computer == 10) {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "1";
        document.getElementById("c-num").innerText = "4";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 5 || computer == 11) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "1";
        document.getElementById("c-num").innerText = "5";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -------------------------------------------------------------------------------------
      else {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "1";
        document.getElementById("c-num").innerText = "6";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
    };
    // player clicks number 2!
    document.getElementById("two").onclick = () => {
      if (computer == 2 || computer == 8) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "2";
        document.getElementById("c-num").innerText = "2";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 1 || computer == 7) {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "2";
        document.getElementById("c-num").innerText = "1";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
      // -------------------------------------------------------------------------------------
      else if (computer == 4 || computer == 10) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "2";
        document.getElementById("c-num").innerText = "4";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // ------------------------------------------------------------------------------------
      else if (computer == 3 || computer == 9) {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "2";
        document.getElementById("c-num").innerText = "3";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 6 || computer == 12) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "2";
        document.getElementById("c-num").innerText = "6";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -------------------------------------------------------------------------------------
      else {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "2";
        document.getElementById("c-num").innerText = "5";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
    };
    // player clicks number 3!
    document.getElementById("thr").onclick = () => {
      if (computer == 1 || computer == 7) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "3";
        document.getElementById("c-num").innerText = "1";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 2 || computer == 8) {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "3";
        document.getElementById("c-num").innerText = "2";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
      // -------------------------------------------------------------------------------------
      else if (computer == 3 || computer == 9) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "3";
        document.getElementById("c-num").innerText = "3";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // ------------------------------------------------------------------------------------
      else if (computer == 4 || computer == 10) {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "3";
        document.getElementById("c-num").innerText = "4";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 5 || computer == 11) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "3";
        document.getElementById("c-num").innerText = "5";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -------------------------------------------------------------------------------------
      else {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "3";
        document.getElementById("c-num").innerText = "6";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
    };
    // player clicks number 4!
    document.getElementById("fou").onclick = () => {
      if (computer == 2 || computer == 8) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "4";
        document.getElementById("c-num").innerText = "2";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 1 || computer == 7) {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "4";
        document.getElementById("c-num").innerText = "1";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
      // -------------------------------------------------------------------------------------
      else if (computer == 4 || computer == 10) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "4";
        document.getElementById("c-num").innerText = "4";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // ------------------------------------------------------------------------------------
      else if (computer == 3 || computer == 9) {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "4";
        document.getElementById("c-num").innerText = "3";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 6 || computer == 12) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "4";
        document.getElementById("c-num").innerText = "6";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -------------------------------------------------------------------------------------
      else {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "4";
        document.getElementById("c-num").innerText = "5";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
    };
    // player clicks number 5!
    document.getElementById("fiv").onclick = () => {
      if (computer == 1 || computer == 7) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "5";
        document.getElementById("c-num").innerText = "1";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 2 || computer == 8) {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "5";
        document.getElementById("c-num").innerText = "2";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
      // -------------------------------------------------------------------------------------
      else if (computer == 3 || computer == 9) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "5";
        document.getElementById("c-num").innerText = "3";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // ------------------------------------------------------------------------------------
      else if (computer == 4 || computer == 10) {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "5";
        document.getElementById("c-num").innerText = "4";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 5 || computer == 11) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "5";
        document.getElementById("c-num").innerText = "5";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -------------------------------------------------------------------------------------
      else {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "5";
        document.getElementById("c-num").innerText = "6";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
    };
    // player clicks number 6!
    document.getElementById("six").onclick = () => {
      if (computer == 2 || computer == 8) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "6";
        document.getElementById("c-num").innerText = "2";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 1 || computer == 7) {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "6";
        document.getElementById("c-num").innerText = "1";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
      // -------------------------------------------------------------------------------------
      else if (computer == 4 || computer == 10) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "6";
        document.getElementById("c-num").innerText = "4";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // ------------------------------------------------------------------------------------
      else if (computer == 3 || computer == 9) {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "6";
        document.getElementById("c-num").innerText = "3";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
      // -----------------------------------------------------------------------------------
      else if (computer == 6 || computer == 12) {
        document.getElementById("message").innerHTML = playEven;
        document.getElementById("p-num").innerText = "6";
        document.getElementById("c-num").innerText = "6";
        document.getElementById("ba").onclick = () => {
          document.getElementById("message").innerHTML = selBat;
          PlayerBat();
        };
        document.getElementById("bo").onclick = () => {
          document.getElementById("message").innerHTML = selBowl;
          PlayerBowl();
        };
      }
      // -------------------------------------------------------------------------------------
      else {
        let ComChoice = Math.floor(Math.random() * 2 + 1);
        document.getElementById("p-num").innerText = "6";
        document.getElementById("c-num").innerText = "5";
        if (ComChoice == 1) {
          document.getElementById("message").innerHTML = oddComBat;
          PlayerBowl();
        } else {
          document.getElementById("message").innerHTML = oddComBowl;
          PlayerBat();
        }
      }
    };
  };
};
