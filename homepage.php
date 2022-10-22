<?php
session_start();

include("connection.php");
include("functions.php");

$user_data = check_login($con);


?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>homepage</title>
    <link rel="stylesheet" href="styleH.css">
</head>

<body>
    <div class="container">
        <form class="form-item">
            <div class="homepage">
                <p>this is my homepage</p>
            </div>
            <div class="projects">

                my project simple calculator.<br>want to see?press<a href="CALCULATOR/index.html">calculator</a>

            </div>
            <br>
            <div class="username">
                <p>hello,<?php echo $user_data['uname'];
                            echo "<br>" ?></p>
            </div>
            want to logout press <a href="logout.php">logout</a>
        </form>


    </div>

</body>

</html>