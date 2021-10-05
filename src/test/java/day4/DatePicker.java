package day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePicker {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://139.59.91.96:5001/selenium-workbook/datepicker.html");


        By datePickerLocator = By.id("datepicker");
        WebElement dataPickerTextBox = wd.findElement(datePickerLocator);
        dataPickerTextBox.click();
        Date d = new Date();
        System.out.println(d.toString());


        SimpleDateFormat simpleDate = new SimpleDateFormat("dd");
        String formatedDate = simpleDate.format(d);
        System.out.println(formatedDate);
        int Date = Integer.parseInt(formatedDate);
        System.out.println(Date);
        //System.out.println(Date-1);

        By dateLocator = By.xpath("//tbody//tr//td/a[text()='"+Date+"']");
        WebElement dateElement = wd.findElement(dateLocator);
        dateElement.click();

    }
}
