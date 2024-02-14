

package demopackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {


    public static void main(String[] args) {
        
        int a=95;
        System.out.println(a);
        WebDriver d= new ChromeDriver();
        d.get("https://petstore.octoperf.com/actions/Catalog.action");
    }



}
