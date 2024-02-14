package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_practice1 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("LearnMore");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("learnmore@123");
        driver.findElement(By.xpath("//*[@id=\"login_container\"]/div/div[3]/button")).click();
    }
}
