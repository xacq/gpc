<?php
session_start();
session_destroy();
session_start();
$_SESSION['login'] = false;
header("location:../login.php", true, 301);
?>
