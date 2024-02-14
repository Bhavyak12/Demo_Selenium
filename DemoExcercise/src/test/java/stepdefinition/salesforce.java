package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import reusable.BaseCode;

import java.io.IOException;

public class salesforce extends BaseCode {


   // WebDriver driver= new ChromeDriver();

    @Given("user navigates to salesforce")
     public void navigateToUrl() throws IOException {
       LaunchBrowser();
    }

    @When("user enters username {string} and password {string}")
    public void enterusernamepwd(String username,String password) throws IOException {
      //  LaunchBrowser();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");

    }
    @And("user clicks the login button")
    public void clickfn()
    {

        driver.findElement(By.name("Login")).click();

    }
    @Then("user validate the error message")
         public void validationfn()
    {

        String actualErrorMessage=driver.findElement(By.id("error")).getText();
        System.out.println("actualErrorMessage is "+actualErrorMessage);
        String expectedResult="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        if(actualErrorMessage.equals(expectedResult))
        {
            System.out.println("equal");
//driver.close();
        }
        else {
            System.out.println("not equal");
            //driver.close();
        }
    }


}
