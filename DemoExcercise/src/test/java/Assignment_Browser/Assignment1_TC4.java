package Assignment_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment1_TC4 {

    public static void main(String[] args) throws InterruptedException {
        //TC-1 launch Chrome browser
        WebDriver driver1=new ChromeDriver();
        //TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/

        driver1.get("https://netbanking.hdfcbank.com/netbanking/");
        driver1.switchTo().frame("login_page");
        Thread.sleep(5000);

        //TC-3 maximize the browser window
        driver1.manage().window().maximize();
        //know more
        driver1.findElement(By.xpath("//div[@id='nortonimg1']/descendant::a[@href='javascript:void(0)']")).click();

        Thread.sleep(5000);

         driver1.close();

    }

}
