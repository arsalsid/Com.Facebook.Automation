package day3;

import com.google.gson.annotations.Until;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FacebookAutomation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(wd, 30);
        wd.get("https://en-gb.facebook.com/");
/*

        By emailLocator = By.name("email"); //Locator
        WebElement emailLocatorTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(emailLocator));
        emailLocatorTextBox.sendKeys("abc@hotmail.com");

        By passwordLocator = By.id("pass");
        WebElement passwordTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator));
        passwordTextBox.sendKeys("Qwerrty");

        By loginButtonLocator = By.name("login");
        WebElement clickLoginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(loginButtonLocator));
        clickLoginButton.click();

*/

        By createAccountButtonLocator = By.xpath("//a[@data-testid=\"open-registration-form-button\"]");
        WebElement createAccountButton = wait.until(ExpectedConditions.visibilityOfElementLocated(createAccountButtonLocator));
        createAccountButton.click();

        //Pause!!
        //Thread.sleep(5000); // Java is going to wait for 5 sec

        //wd.manage().timeouts().implicitlyWait(30, TimeUnit.NANOSECONDS);
        By firstNameLocator = By.name("firstname");
        WebElement firstNameTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameLocator));
        firstNameTextBox.sendKeys("Alex");

        By lastNameLocator = By.name("lastname");
        WebElement lastNameTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameLocator));
        lastNameTextBox.sendKeys("Texas");

        By regEmailLocator = By.name("reg_email__");
        WebElement regEmailTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(regEmailLocator));
        regEmailTextBox.sendKeys("Alex@gmail.com");

        By confirmRegEmailTextBoxLocator = By.name("reg_email_confirmation__");
        WebElement confirmRegEmailTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmRegEmailTextBoxLocator));
        confirmRegEmailTextBox.sendKeys("Alex@gmail.com");

        By newPasswordLocator = By.name("reg_passwd__");
        WebElement newPasswordTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(newPasswordLocator));
        newPasswordTextBox.sendKeys("Qwertyu");
        String url = wd.getTitle();


        By genderRadioButtonLocator = By.xpath("//input[@type='radio' and @value='2']");
        WebElement genderRadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(genderRadioButtonLocator));
        genderRadioButton.click();

        //BirthDay Calender Day , Month and Year//

        //Select by Index
        By dayDropDownLocator = By.name("birthday_day");
        WebElement dayDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(dayDropDownLocator));
        Select dayDropDownSelect = new Select(dayDropDown);
        dayDropDownSelect.selectByIndex(26);

        //Select by Visible Text
        By monthDropDownLocator = By.id("month");
        WebElement monthDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(monthDropDownLocator));
        Select monthDropDownSelect = new Select(monthDropDown);
        monthDropDownSelect.selectByVisibleText("Dec");

        //Select by Value
        By yearDropDownLocator = By.id("year");
        WebElement yearDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(yearDropDownLocator));
        Select yearDropDownSelect = new Select(yearDropDown);
        yearDropDownSelect.selectByValue("1993");

        By registerAccountLocator = By.xpath("//button[text()='Sign Up']");
        WebElement registerAccountButton = wait.until(ExpectedConditions.visibilityOfElementLocated(registerAccountLocator));
        registerAccountButton.click();

    }
}
