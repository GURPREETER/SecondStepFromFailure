package StepDefForFailure;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class StepDef {

    @Given("^This is the login page$")
    public void this_is_the_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:/Users/gkgur/ChromeSetup/chromedriver.exe");
        WebDriver fb = new ChromeDriver();
        fb.manage().window().maximize();
        fb.get("https://www.linkedin.com");


    }

}
