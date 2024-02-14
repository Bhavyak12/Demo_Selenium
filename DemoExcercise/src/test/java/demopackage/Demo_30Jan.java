package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo_30Jan {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver= new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        //driver.findElement(By.id("username")).sendKeys("learnmore");
       // driver.findElement(By.id("password")).sendKeys("123");
       // Thread.sleep(5000);
       // driver.findElement(By.name("Login")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("learnmore");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("learntext");




    }
}

