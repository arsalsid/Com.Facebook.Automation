package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuviIdealAutomation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://www.suvideals.ooo/Login.action");


        By userInputTextBoxLocator = By.id("userHandle");
        WebElement userInputBox = wd.findElement(userInputTextBoxLocator);
        userInputBox.sendKeys("xyz@hotmail.com");

        By passwordInputTextBoxLocator = By.id("password");
        WebElement passwordInputTextBox = wd.findElement(passwordInputTextBoxLocator);
        passwordInputTextBox.sendKeys("demo123");

        By loginButtonLocator = By.xpath("//button[text()='LOGIN']");
        WebElement loginButton = wd.findElement(loginButtonLocator);
        loginButton.click();

/*

        By createAccountButtonLocator = By.id("new-account-btn"); //Locator
        WebElement createAccountButton = wd.findElement(createAccountButtonLocator);
        createAccountButton.click();

        By registrationFormLocator = By.id("registration-form"); //Locator
        WebElement registrationForm = wd.findElement(registrationFormLocator);

        By userNameLocator = By.name("userName");
        WebElement userNameTextBox = registrationForm.findElement(userNameLocator);
        userNameTextBox.sendKeys("Arsalan");


        By emailLocator = By.name("email");
        WebElement emailTexBox = registrationForm.findElement(emailLocator);
        emailTexBox.sendKeys("abc@hotmail.com");

        By passwordLocator = By.id("password");
        WebElement passwordTextBox = registrationForm.findElement(passwordLocator);
        passwordTextBox.sendKeys("125qwx");

        By createNewAccountButtonLocator = By.xpath("");
        WebElement createNewAccount = registrationForm.findElement(createNewAccountButtonLocator);
        createNewAccount.click();


*/
    }
}



