<?php
    session_start();
    if ($_SESSION['login'] != true){
        unset($_POST);
        session_destroy();
        header("Location: ./login.php", true, 301);
        exit();
    }
?>