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

        By userIdLocator = By.id("userid"); //Locator
        browserUtility.enterText(userIdLocator,"abc");


        By passwordLocator = By.name("password"); // We are telling selenium which locator to use

        By headingLocator = By.tagName("h1"); //Locator
        WebElement headingElement = wd.findElement(headingLocator);
        String headingText = headingElement.getText(); //visibleText
        System.out.println(headingText);

        By loginButton = By.className("btn btn-primary"); //Locator
        WebElement loginElement = wd.findElement(loginButton);
        loginElement.click();




        }
    }

