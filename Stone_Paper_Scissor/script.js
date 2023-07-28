let computerScore = 0;
let playerScore = 0;

let stone = "<div style='font-size:40px;'>&#9994;</div>";
let paper = "<div style='font-size:40px;'>&#9995;</div>";
let scissor = "<div style='font-size:40px;'>&#128070;</div>";

document.getElementById("s").onclick = () => {
  let computer = Math.floor(Math.random() * 3) + 1;
  if (computer == 1) {
    document.getElementById("message").innerText =
      "Computer selected stone, you selected stone, Match Draw!";
    document.getElementById("p-choice").innerHTML = stone;
    document.getElementById("c-choice").innerHTML = stone;
  } else if (computer == 2) {
    document.getElementById("message").innerText =
      "Computer selected paper, you selected stone, Computer Win!";
    computerScore += 1;
    document.getElementById("c-s").innerText = computerScore;
    document.getElementById("p-choice").innerHTML = stone;
    document.getElementById("c-choice").innerHTML = paper;
  } else {
    document.getElementById("message").innerText =
      "Computer selected scissor, you selected stone, You Win!";
    playerScore += 1;
    document.getElementById("p-s").innerText = playerScore;
    document.getElementById("p-choice").innerHTML = stone;
    document.getElementById("c-choice").innerHTML = scissor;
  }
  if (playerScore == 3) {
    playerScore = 0;
    computerScore = 0;
    document.getElementById("p-s").innerText = 0;
    document.getElementById("c-s").innerText = 0;
    document.getElementById("p-choice").innerHTML = "";
    document.getElementById("c-choice").innerHTML = "";
    document.getElementById("message").innerText = "Player Won The Match!";
  } else if (computerScore == 3) {
    playerScore = 0;
    computerScore = 0;
    document.getElementById("p-s").innerText = 0;
    document.getElementById("c-s").innerText = 0;
    document.getElementById("p-choice").innerHTML = "";
    document.getElementById("c-choice").innerHTML = "";
    document.getElementById("message").innerText = "Computer Won The Match!";
  }
};

document.getElementById("p").onclick = () => {
  let computer = Math.floor(Math.random() * 3) + 1;
  if (computer == 1) {
    document.getElementById("message").innerText =
      "Computer selected stone, you selected paper, Player Win!";
    playerScore += 1;
    document.getElementById("p-s").innerText = playerScore;
    document.getElementById("p-choice").innerHTML = paper;
    document.getElementById("c-choice").innerHTML = stone;
  } else if (computer == 2) {
    document.getElementById("message").innerText =
      "Computer selected paper, you selected paper, Match Draw!";
    document.getElementById("p-choice").innerHTML = paper;
    document.getElementById("c-choice").innerHTML = paper;
  } else {
    document.getElementById("message").innerText =
      "Computer selected scissor, you selected paper, Computer Win!";
    computerScore += 1;
    document.getElementById("c-s").innerText = computerScore;
    document.getElementById("p-choice").innerHTML = paper;
    document.getElementById("c-choice").innerHTML = scissor;
  }
  if (playerScore == 3) {
    playerScore = 0;
    computerScore = 0;
    document.getElementById("p-s").innerText = 0;
    document.getElementById("c-s").innerText = 0;
    document.getElementById("p-choice").innerHTML = "";
    document.getElementById("c-choice").innerHTML = "";
    document.getElementById("message").innerText = "Player Won The Match!";
  } else if (computerScore == 3) {
    playerScore = 0;
    computerScore = 0;
    document.getElementById("p-s").innerText = 0;
    document.getElementById("c-s").innerText = 0;
    document.getElementById("p-choice").innerHTML = "";
    document.getElementById("c-choice").innerHTML = "";
    document.getElementById("message").innerText = "Computer Won The Match!";
  }
};

document.getElementById("sc").onclick = () => {
  let computer = Math.floor(Math.random() * 3) + 1;
  if (computer == 1) {
    document.getElementById("message").innerText =
      "Computer selected stone, you selected scissor, Computer Win!";
    computerScore += 1;
    document.getElementById("c-s").innerText = computerScore;
    document.getElementById("p-choice").innerHTML = scissor;
    document.getElementById("c-choice").innerHTML = stone;
  } else if (computer == 2) {
    document.getElementById("message").innerText =
      "Computer selected paper, you selected scissor, You Win!";
    playerScore += 1;
    document.getElementById("p-s").innerText = playerScore;
    document.getElementById("p-choice").innerHTML = scissor;
    document.getElementById("c-choice").innerHTML = paper;
  } else {
    document.getElementById("message").innerText =
      "Computer selected scissor, you selected scissor, Match Draw!";

    document.getElementById("p-choice").innerHTML = scissor;
    document.getElementById("c-choice").innerHTML = scissor;
  }
  if (playerScore == 3) {
    playerScore = 0;
    computerScore = 0;
    document.getElementById("p-s").innerText = 0;
    document.getElementById("c-s").innerText = 0;
    document.getElementById("p-choice").innerHTML = "";
    document.getElementById("c-choice").innerHTML = "";
    document.getElementById("message").innerText = "Player Won The Match!";
  } else if (computerScore == 3) {
    playerScore = 0;
    computerScore = 0;
    document.getElementById("p-s").innerText = 0;
    document.getElementById("c-s").innerText = 0;
    document.getElementById("p-choice").innerHTML = "";
    document.getElementById("c-choice").innerHTML = "";
    document.getElementById("message").innerText = "Computer Won The Match!";
  }
};

document.getElementById("rst").onclick = () => {
  playerScore = 0;
  computerScore = 0;
  document.getElementById("p-s").innerText = 0;
  document.getElementById("c-s").innerText = 0;
  document.getElementById("p-choice").innerHTML = "";
  document.getElementById("c-choice").innerHTML = "";
  document.getElementById("message").innerText = "Welcome To The Game!";
};
