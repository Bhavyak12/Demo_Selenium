package reusable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class BaseCode {

    public static WebDriver driver;
    public static void LaunchBrowser() throws IOException {
        FileInputStream fis= new FileInputStream(new File("src/main/resources/configuration/config.properties")) ;
        Properties prob=new Properties();
        prob.load(fis);
        if(prob.getProperty("browser").equalsIgnoreCase("edge"))
        {
            driver=new EdgeDriver();
        }
        else if (prob.getProperty("browser").equalsIgnoreCase("chrome"))
        {
            driver=new ChromeDriver();
        }
        else if (prob.getProperty("browser").equalsIgnoreCase("safari")) {

            driver=new SafariDriver();
        }

        else{

            throw new InvalidArgumentException("please enter valid browser input");
        }
  driver.get(prob.getProperty("environemnt"));
    }
}
