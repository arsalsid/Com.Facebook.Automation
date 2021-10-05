package day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        wd.manage().window().maximize();

        //wd.switch to method iframe

        // Through String Name
       /* wd.switchTo().frame("editor_ifr");
        By textBoxLocator = By.id("tinymce");
        WebElement textBoxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxLocator));
        textBoxElement.clear();

        // Through Index
        wd.switchTo().frame("0");

        // Through Web Element
        By iframeLocator = By.xpath("//div[@id= \"mceu_27\"]/iframe");
        wd.switchTo().frame(wait.until(ExpectedConditions.visibilityOfElementLocated(iframeLocator)));*/

        //default content method for multiple iframe in single page
        wd.switchTo().defaultContent();
        By headingTagLocator = By.tagName("h1");
        WebElement headingTag = wait.until(ExpectedConditions.visibilityOfElementLocated(headingTagLocator));
        System.out.println(headingTag.getText());

    /*
        textBoxElement.sendKeys(Keys.CONTROL + "i" ); //ctrl +b
        textBoxElement.sendKeys(Keys.F5);
        wd.get("http://139.59.91.96:5001/selenium-workbook/wyswyg-editor.html");
        wd.navigate().refresh();
        textBoxElement.sendKeys(Keys.CONTROL +"" +Keys.F5);
    */
    }
}
