package day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Runner {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(wd, 30);
        BrowserUtility browserUtility = new BrowserUtility(wd, wait);
        browserUtility.goToURL("http://139.59.91.96:5001/selenium-workbook/login.html");
        wd.manage().window().maximize();

        By userIdLocator = By.id("userid"); //Locator
        browserUtility.enterText(userIdLocator,"abc");


        By passwordLocator = By.name("password"); // We are telling selenium which locator to use
        browserUtility.enterPassword(passwordLocator, "admin123");

        By headingTextLocator = By.tagName("h1"); //Locator
        System.out.println(browserUtility.getTextFrom(headingTextLocator));

        By loginButton = By.xpath("//input[@type='submit']"); //Locator
        browserUtility.clickOn(loginButton);




        }
    }

