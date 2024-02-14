package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Feb6 {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("learnmore");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
        driver.findElement(By.name("Login")).click();

        // validating error message
   String actualErrorMessage=driver.findElement(By.id("error")).getText();
        System.out.println("actualErrorMessage is "+actualErrorMessage);
   String expectedResult="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
    if(actualErrorMessage.equals(expectedResult))
    {
        System.out.println("equal");

    }
    else {
        System.out.println("not equal");
    }
    }
}
