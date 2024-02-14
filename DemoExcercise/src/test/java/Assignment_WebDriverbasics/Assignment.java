package Assignment_WebDriverbasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        // d.get("https://petstore.octoperf.com/actions/Catalog.action");
        d.get("https://www.google.com/");

        Thread.sleep(5000);

        String title=d.getTitle();
        System.out.println(title);

        d.close();
        d.quit();
    }


}
