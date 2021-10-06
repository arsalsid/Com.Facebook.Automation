package day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalHandling {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(wd, 30);
        wd.get("http://139.59.91.96:5001/selenium-workbook/popups.html#");
        wd.manage().window().maximize();

        By modalButtonLocator = By.xpath("//a[@data-toggle='modal']");
        WebElement modalButton = wait.until(ExpectedConditions.elementToBeClickable(modalButtonLocator));
        modalButton.click();

        By modalTextLocator = By.xpath("//input[@class ='span12']");
        WebElement modalText = wait.until(ExpectedConditions.visibilityOfElementLocated(modalTextLocator));
        modalText.sendKeys("Arsalan");


    }
}
