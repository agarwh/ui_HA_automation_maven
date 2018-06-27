package com.worldpay.cucumber.stepDefinition;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Givens {

    /**
     * login method
     */
    @Given("^i can login$")
    public void i_can_login()  {
        System.out.println("my first test case");

        System.setProperty("webdriver.chrome.driver","C:/Users/agrawalh657/Downloads/chromedriver_win32la/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ultimateqa.com/automation/");
    }


}
