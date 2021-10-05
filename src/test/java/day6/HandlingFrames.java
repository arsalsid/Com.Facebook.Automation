package day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrames {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(wd, 30);
        wd.get("http://139.59.91.96:5001/selenium-workbook/wyswyg-editor.html");

        wd.switchTo().frame("editor_ifr");
        By textBoxLocator = By.id("tinmyce");
        WebElement textBoxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxLocator));
        textBoxElement.sendKeys("ABC");
    }
}
