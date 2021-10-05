package day5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Oranum {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://oranum.com/en/search/Live");
        //How to set Implicit wait
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.NANOSECONDS);

        //SearchBox Handling
        By searchBoxLocator = By.xpath("//input[@data-testid='filter-text']");
        WebElement searchTextBox = wd.findElement(searchBoxLocator);
        searchTextBox.sendKeys("He");
        String message = "Passed";
        System.out.println(message);

//We will never use findElement method!!
//WebDriverWait ------------ Explicit Wait

        //Handling Multiple List of Elements
        WebDriverWait wait = new WebDriverWait(wd, 30); // 500 ms is the default time of wait.
        By searchResultItemsLocator = By.xpath("//div[@data-testid='search-result-list']//div[2]/div");
        List<WebElement> searchList = wait
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(searchResultItemsLocator));
        System.out.println(searchList.size());
        for (WebElement element : searchList){
            System.out.println(element.getText());
        }

    }
}
