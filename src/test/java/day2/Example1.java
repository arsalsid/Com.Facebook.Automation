package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://139.59.91.96:5001/selenium-workbook/login.html");



        By userIdLocator = By.id("userid"); //Locator
        WebElement userIDElement = wd.findElement(userIdLocator);// FIRST WEB ELEMENT PRESENT ON THE PAGE
        userIDElement.sendKeys("Arsalan");
        String userPlaceholder = userIDElement.getAttribute("placeholder");
        System.out.println(userPlaceholder);

        By passwordLocator = By.name("password"); // We are telling selenium which locator to use
        WebElement passwordElement = wd.findElement(passwordLocator); // finding the element using that locator
        passwordElement.sendKeys("admin123"); // performing the action
        String passwordPlaceholder = passwordElement.getAttribute("placeholder");
        System.out.println(passwordPlaceholder);

        By headingLocator = By.tagName("h1"); //Locator
        WebElement headingElement = wd.findElement(headingLocator);
        String headingText = headingElement.getText(); //visibleText
        System.out.println(headingText);

        By loginButton = By.className("btn btn-primary"); //Locator
        WebElement loginElement = wd.findElement(loginButton);
        loginElement.click();


    }
}
