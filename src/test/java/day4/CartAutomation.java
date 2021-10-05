package day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;

public class CartAutomation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(wd, 30);
        wd.get("http://139.59.91.96:5001/selenium-workbook/shopping-cart.html");

        By priceLocator = By.xpath("//tr/td[2]");
        // WebElement priceElement = wd.findElement(priceLocator); //first weElement
        // with the specified locator
       // System.out.println(priceElement.getText());

        List<WebElement> priceElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(priceLocator));
       /* for(WebElement element : priceElements){
            System.out.println(element.getText());
        }*/

        String price = "";
        double sum = 0;
        // Array!! Concepts
        for(int index = 0; index < priceElements.size()-3; ++index){
            WebElement element = priceElements.get(index);
            price = element.getText();
            System.out.println(price);
            price = price.substring(1);
            sum = sum + Double.parseDouble(price);
        }
        System.out.print("Total sum = " + sum);

       /* Iterator<WebElement> priceIterator = priceElements.iterator();
        while (priceIterator.hasNext()){
            WebElement element = priceIterator.next();
            System.out.println(element.getText());
        }*/

    }
}
