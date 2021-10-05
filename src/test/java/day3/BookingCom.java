package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingCom {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.booking.com/");
/*
        By registerButtonLocator = By.xpath("//span[contains(text(), 'Register')]");
        WebElement registerButton = wd.findElement(registerButtonLocator);
        registerButton.click();

        By registerEmailLocator = By.id("username");
        WebElement registerEmailTextBox = wd.findElement(registerEmailLocator);
        registerEmailTextBox.sendKeys("arsal243@gmail.com");

        By continueWithEmailLocator = By.xpath("//span[contains(text(), 'Continue with email')]");
        WebElement continueWithEmailButton = wd.findElement(continueWithEmailLocator);
        continueWithEmailButton.click();

        Thread.sleep(3000);
        By PasswordLocator = By.name("password");
        WebElement PasswordTextBox = wd.findElement(PasswordLocator);
        PasswordTextBox.sendKeys("P@ssword");

        By signInLocator = By.xpath("//span[contains(text(), 'Sign in')]");
        WebElement signInButton = wd.findElement(signInLocator);
        signInButton.click();

        Thread.sleep(3000);
        By confirmPasswordLocator = By.id("confirmed_password");
        WebElement confirmPasswordTextBox = wd.findElement(confirmPasswordLocator);
        confirmPasswordTextBox.sendKeys("P@ssword");

        By createAccountLocator = By.xpath("//span[contains(text(), 'Create account')]");
        WebElement createAccountTextBox = wd.findElement(createAccountLocator);
        createAccountTextBox.click();
        */

        //Handling DatePicker Calender By.xpath("//div[contains(text(), 'Check-in')]");
        Thread.sleep(3000);
        By checkingLocator = By.xpath("//div[contains(text(), 'Check-in')]");
        WebElement checkingButton = wd.findElement(checkingLocator);
        checkingButton.click();

    }

    public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript('Arguments'[0].setAttribute('value',));
    }
}
