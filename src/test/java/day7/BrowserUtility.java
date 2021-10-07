package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtility {

    private WebDriver wd;
    private WebDriverWait wait;

    public BrowserUtility(WebDriver wd, WebDriverWait wait) {
        this.wd = wd;
        this.wait = wait;
    }

    public void goToURL(String url){
        wd.get(url);
    }
    public void enterText (By locator, String textToEnter) {

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys(textToEnter);
    }
    public void enterPassword (By locator, String PasswordToEnter) {

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys(PasswordToEnter);
    }
    public void clickOn(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
    }
    public String getTextFrom(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }
}
