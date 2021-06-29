package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceInfo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.facebook.com/");
        String title = wd.getTitle();
        System.out.println(title);
        String htmlcode = wd.getPageSource();
        System.out.println(htmlcode);
    }
}
