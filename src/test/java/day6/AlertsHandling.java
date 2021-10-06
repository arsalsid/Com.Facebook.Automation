package day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsHandling {
    public static void main(String[] args) {

        //There are 2 type of pop ups
        //Synthetic = Modal (is a part of webpage)
        // Alert Javascript pop ups

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://139.59.91.96:5001/selenium-workbook/popups.html");
        wd.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(wd, 20);
        By alertButtonLocator = By.id("alert");
        WebElement alertButton = wait.until(ExpectedConditions.elementToBeClickable(alertButtonLocator));
        alertButton.click();


        //Handle Alert
        // No Alert Present Exception
        Alert alert = wd.switchTo().alert();
        alert.accept();


        By confirmButtonLocator = By.linkText("Confirm");
        WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(confirmButtonLocator));
        confirmButton.click();

        alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
    }
}
