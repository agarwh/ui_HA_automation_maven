package com.HA.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {


    public static void accessLink(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ultimateqa.com/automation/");
    }

}

