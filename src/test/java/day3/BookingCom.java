package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingCom {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(wd , 30);
        wd.get("https://www.booking.com/");
        wd.manage().window().maximize();
/*
        //Registration Page of Booking.com part
        By registerButtonLocator = By.xpath("//span[contains(text(), 'Register')]");
        WebElement registerButton = wait.until(ExpectedConditions.visibilityOfElementLocated(registerButtonLocator));
        registerButton.click();

        By registerEmailLocator = By.id("username");
        WebElement registerEmailTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(registerEmailLocator));
        registerEmailTextBox.sendKeys("arsal243@gmail.com");

        By continueWithEmailLocator = By.xpath("//span[contains(text(), 'Continue with email')]");
        WebElement continueWithEmailButton = wait.until(ExpectedConditions.visibilityOfElementLocated(continueWithEmailLocator));
        continueWithEmailButton.click();

        By PasswordLocator = By.name("password");
        WebElement PasswordTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordLocator));
        PasswordTextBox.sendKeys("P@ssword");

        By signInLocator = By.xpath("//span[contains(text(), 'Sign in')]");
        WebElement signInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(signInLocator));
        signInButton.click();

        By confirmPasswordLocator = By.id("confirmed_password");
        WebElement confirmPasswordTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPasswordLocator));
        confirmPasswordTextBox.sendKeys("P@ssword");

        By createAccountLocator = By.xpath("//span[contains(text(), 'Create account')]");
        WebElement createAccountTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(createAccountLocator));
        createAccountTextBox.click();

*/
        //Not working WebElement
        //Handling DatePicker Calender By.xpath("//div[contains(text(), 'Check-in')]");
        By checkingLocator = By.xpath("//div[@data-sb-id='main' and @data-view-id=\"accommodation\"]");
        WebElement checkingButton = wait.until(ExpectedConditions.visibilityOfElementLocated(checkingLocator));
        checkingButton.click();

    }

    public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript('Arguments'[0].setAttribute('value',));
    }
}
