package day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Oranum {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://oranum.com/en/search/Live");


        //SearchBox Handling
        By searchBoxLocator = By.xpath("//input[@data-testid='filter-text']");
        WebElement searchTextBox = wd.findElement(searchBoxLocator);
        searchTextBox.sendKeys("Matt");
        String message = "Passed";
        System.out.println(message);

        //Handling Multiple List of Elements
        By searchResultItemsLocator = By.xpath("//div[@data-testid='search-result-list']//div[2]/div");
        List<WebElement> searchList = wd.findElements(searchResultItemsLocator);
        System.out.println(searchList.size());
        for (WebElement element : searchList){
            System.out.println(element.getText());
        }

    }
}
