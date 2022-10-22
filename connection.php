<?php

$dbhost = "localhost";
$dbname = "project";
$dbuser = "root";
$dbpass = "";

if (!$con = mysqli_connect($dbhost, $dbuser, $dbpass, $dbname)) {
    die("failed to connect!");
}
