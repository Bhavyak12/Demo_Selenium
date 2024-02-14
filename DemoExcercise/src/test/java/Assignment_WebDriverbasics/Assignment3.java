package Assignment_WebDriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

    public static void main(String[] args) throws InterruptedException {

        //TC-1 launch Chrome browser
        WebDriver driver1=new FirefoxDriver();
        //TC-2 go to test URL https://www.google.com
        driver1.get("https://www.google.com");
        //TC-3 specify wait time for 5 sec
        Thread.sleep(5000);
        //TC-4 get the title of page into console
        String title=driver1.getTitle();
        System.out.println("Page title is "+title);
        //TC-5 close the browser
        driver1.close();



    }
}
