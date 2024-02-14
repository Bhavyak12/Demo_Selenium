package Assignment_WebDriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

    public static void main(String[] args) {

        WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.google.com");
        WebDriver driver2=new EdgeDriver();
        driver2.get("https://www.facebook.com");
        WebDriver driver3=new FirefoxDriver();
        driver3.get("https://lichess.org/");

        driver1.close();
        driver2.close();
        driver3.close();



    }
}
