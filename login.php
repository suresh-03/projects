<?php

session_start();

include("connection.php");
include("functions.php");

if ($_SERVER['REQUEST_METHOD'] == 'POST') {

    $uname = $_POST['uname'];
    $upswd = $_POST['upswd'];

    if (!empty($uname) && !empty($upswd) && !is_numeric(($uname))) {

        //read from the database
        $uid = random_num(20);
        $query = "select * from register where uname = '$uname' limit 1";
        $result = mysqli_query($con, $query);


        if ($result) {
            if ($result && mysqli_num_rows($result) > 0) {

                $user_data = mysqli_fetch_assoc($result);
                if ($user_data['upswd'] === $upswd) {

                    $_SESSION['uid'] = $user_data['uid'];
                    header("Location:homepage.php");
                    die;
                }
            }
        }
        header("Location:wrongpass.php");
    } else {
        echo "please enter valid information";
        die;
    }
}

?>




<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@48,400,0,0">
</head>

<body>
    <div class="login-card-container">
        <div class="login-card" style="height: 430;">
            <div class="login-card-logo">
                <img src="Logo3.png" style="width:80px" alt="logo">
            </div>
            <div class="login-card-header">
                <h1>Login</h1>
                <div>Please login to use platform</div>
                <form class="login-card-form" method="POST">
                    <div class="form-item">
                        <span class="form-item-icon material-symbols-rounded">Person</span>
                        <input type="text" name="uname" placeholder="Enter username" required autofocus autocomplete="none">
                    </div>
                    <div class="form-item">
                        <span class="form-item-icon material-symbols-rounded">lock</span>
                        <input type="password" name="upswd" placeholder="Enter Password" required>
                    </div>
                    <div class="form-item-other">
                        <div class="checkbox">
                            <input type="checkbox" id="rememberMeCheckbox">
                            <label for="rememberMeCheckbox">Remember me</label>
                        </div>
                        <a href="#">I forgot my Password!</a>
                    </div>
                    <button type="submit">sign in</button>
                </form>
                <div class="login-card-footer">
                    Don't have an account?<a href="signup.php">Create a free account</a>.
                </div>

            </div>
            <div class="login-card-social">
                <div>Other sign-in platforms</div>
                <div class="login-card-social-btn">
                    <a href="#">
                        <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-brand-facebook" width="35" height="35" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round">
                            <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
                            <path d="M7 10v4h3v7h4v-7h3l1 -4h-4v-2a1 1 0 0 1 1 -1h3v-4h-3a5 5 0 0 0 -5 5v2h-3"></path>
                        </svg>
                    </a>
                    <a href="#">
                        <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-brand-google" width="35" height="35" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round">
                            <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
                            <path d="M17.788 5.108a9 9 0 1 0 3.212 6.892h-8"></path>
                        </svg>
                    </a>
                </div>
            </div>
        </div>
    </div>

</body>

</html>