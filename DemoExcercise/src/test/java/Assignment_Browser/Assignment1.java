package Assignment_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

    public static void main(String[] args) throws InterruptedException {

        //TC-1 launch Chrome browser
        WebDriver driver1=new ChromeDriver();
        //TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/

  driver1.get("https://netbanking.hdfcbank.com/netbanking/");
               Thread.sleep(5000);

        //TC-3 maximize the browser window
          driver1.manage().window().maximize();
          //know more
           driver1.findElement(By.xpath("//div[@id='nortonimg1']/descendant::a[@href='javascript:void(0)']")).click();
 //driver1.findElement(By.cssSelector("#nortonimg2 > div.hdfcsmalltxt.mB10 > span.lightbluecolor > a")).click();
       // driver1.findElement((By.name("return window.open('https://www.hdfcbank.com/personal/useful-links/security');"))).click();
     //   driver1.findElement(By.xpath("//div[@id='nortonimg1']/descendant::a[@href='javascript:void(0)']")).getText();
            //   driver1.findElement(By.xpath("//div[@id='nortonimg1']/child::div[@class='hdfcsmalltxt mB10']/child::span[@class='lightbluecolor']/child::a[@href='javascript:void(0)']")).getText();
        //        WebElement testtt = driver1.findElement(By.xpath("/html/body/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[1]"));


        //        String isit =   testtt.getAttribute("value");
        //        System.out.println(isit);
        //        testtt.sendKeys("12345");


        //TC-4 get the title of page
        //   System.out.println(driver1.getTitle());
        //TC-5 click on know more link text

        // driver1.findElement(By.xpath("//*[contains(text(),'Know')]")).click();
        //driver1.findElement(By.partialLinkText("Know")).click();
        //driver1.findElement(By.linkText("https://www.hdfcbank.com/personal/useful-links/security")).click();
        // driver1.findElement(By.xpath("//body[@id='pageBody']/div[1]/form[@name='frmLogin']/div[@class='container']//div[@class='nwtquestwrap']/div[2]/div[1]//a[@href='javascript:void(0)']")).click();
        //        System.out.println(driver1.getWindowHandle());
        //        driver1.switchTo().newWindow(WindowType.TAB);
        //        System.out.println(driver1.getWindowHandle());
        //        System.out.println(driver1.getTitle());
        Thread.sleep(5000);
        driver1.close();




    }
}
