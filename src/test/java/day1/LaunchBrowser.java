package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {

        //Step 1:
        WebDriverManager.chromedriver().setup(); // automatically WebDriverManager will download the driver files
        // Step 2:

        WebDriver wd = new ChromeDriver();
        // Runtime Polymorphism ------ Late Binding ========= Control the behaviour of
        // object
        // launches the Browser

        wd.get("https://www.facebook.com/");         // the java waits for the entire page to get loaded completely!!
        // https 443 port
        // http 80 port
        // ssh 22 port

        // Step 3:

        String url = wd.getTitle();
        System.out.println(url);

        wd.get("https://www.facebook.com/");
        url = wd.getTitle();
        System.out.println(url);
        wd.get("https://www.google.com/");
        url = wd.getTitle();
        System.out.println(url);
        wd.get("https://github.com/");
        url = wd.getTitle();
        System.out.println(url);
        wd.get("https://www.instagram.com/");
        url = wd.getTitle();
        System.out.println(url);
        wd.get("https://www.linkedin.com/");
        url = wd.getTitle();
        System.out.println(url);
        wd.get("https://www.google.com/");
        url = wd.getTitle();
        System.out.println(url);





    }


    }

