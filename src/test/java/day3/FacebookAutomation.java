package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAutomation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://en-gb.facebook.com/");
       /*

        By emailLocator = By.name("email"); //Locator
        WebElement emailLocatorTextBox = wd.findElement(emailLocator);
        emailLocatorTextBox.sendKeys("abc@hotmail.com");

        By passwordLocator = By.id("pass");
        WebElement passwordTextBox = wd.findElement(passwordLocator);
        passwordTextBox.sendKeys("Qwerrty");

        By loginButtonLocator = By.name("login");
        WebElement clickLoginButton = wd.findElement(loginButtonLocator);
        clickLoginButton.click();

        */

        By createAccountButtonLocator = By.xpath("//a[@data-testid=\"open-registration-form-button\"]");
        WebElement createAccountButton = wd.findElement(createAccountButtonLocator);
        createAccountButton.click();

        //Pause!!
        Thread.sleep(5000); // Java is going to wait for 5 sec
        By firstNameLocator = By.name("firstname");
        WebElement firstNameTextBox = wd.findElement(firstNameLocator);
        firstNameTextBox.sendKeys("Alex");

        By lastNameLocator = By.name("lastname");
        WebElement lastNameTextBox = wd.findElement(lastNameLocator);
        lastNameTextBox.sendKeys("Texas");

        By regEmailLocator = By.name("reg_email__");
        WebElement regEmailTextBox = wd.findElement(regEmailLocator);
        regEmailTextBox.sendKeys("Alex@gmail.com");

        By confirmRegEmailTextBoxLocator = By.name("reg_email_confirmation__");
        WebElement confirmRegEmailTextBox = wd.findElement(confirmRegEmailTextBoxLocator);
        confirmRegEmailTextBox.sendKeys("Alex@gmail.com");

        By newPasswordLocator = By.name("reg_passwd__");
        WebElement newPasswordTextBox = wd.findElement(newPasswordLocator);
        newPasswordTextBox.sendKeys("Qwertyu");
        String url = wd.getTitle();


        By genderRadioButtonLocator = By.xpath("//input[@type='radio' and @value='2']");
        WebElement genderRadioButton = wd.findElement(genderRadioButtonLocator);
        genderRadioButton.click();

        //BirthDay Calender Day , Month and Year//

        ////Select by Index
        By dayDropDownLocator = By.name("birthday_day");
        WebElement dayDropDown = wd.findElement(dayDropDownLocator);
        Select dayDropDownSelect = new Select(dayDropDown);
        dayDropDownSelect.selectByIndex(27);

        //Select by Visible Text
        By monthDropDownLocator = By.id("month");
        WebElement monthDropDown = wd.findElement(monthDropDownLocator);
        Select monthDropDownSelect = new Select(monthDropDown);
        monthDropDownSelect.selectByVisibleText("Dec");

        //Select by Value
        By yearDropDownLocator = By.id("year");
        WebElement yearDropDown = wd.findElement(yearDropDownLocator);
        Select yearDropDownSelect = new Select(yearDropDown);
        yearDropDownSelect.selectByValue("1993");

        By registerAccountLocator = By.xpath("//button[text()='Sign Up']");
        WebElement registerAccountButton = wd.findElement(registerAccountLocator);
        registerAccountButton.click();


    }
}
