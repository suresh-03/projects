<?php

session_start();

include("connection.php");
include("functions.php");

if ($_SERVER['REQUEST_METHOD'] == 'POST') {

    $uname = $_POST['uname'];
    $email = $_POST['email'];
    $upswd = $_POST['upswd'];

    if (!empty($uname) && !empty($email) && !empty($upswd) && !is_numeric(($uname) && !is_numeric($email))) {

        //save to the database
        $uid = random_num(20);
        $query = "insert into register (uid,uname,email,upswd) values ('$uid','$uname','$email','$upswd')";

        mysqli_query($con, $query);
        header("Location:login.php");
        die;
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
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" href="styleR.css">
</head>

<body>
    <div class="register-card-container">
        <div class="register-card">
            <div class="register-card-logo">
                <img src="logo3.png" style="width: 80px;" alt="logo">
            </div>
            <div class="register-card-header">
                <h1>Register</h1>
                <div>Please Register to login</div>
                <form class="register-data" name="myform" method="post">
                    <div class="form-item">
                        <input type="text" name="uname" placeholder="Enter username" required autofocus autocomplete="none">
                    </div>
                    <div class="form-item">
                        <input type="email" name="email" placeholder="Enter mail" required autocomplete="none">
                    </div>
                    <div class="form-item">
                        <input type="password" name="upswd" placeholder="Enter password" required>
                    </div>
                    <div class="register-button">
                        <button type="submit">Register</button>
                    </div>
                </form>
                <div class="register-card-footer">
                    Already have an account?<a href="login.php"> Log in!</a>
                </div>

            </div>
        </div>
    </div>

</body>

</html>