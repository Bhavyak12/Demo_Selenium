package stepdefinition;

import org.junit.After;
import org.junit.Before;
import reusable.BaseCode;

import java.io.IOException;

public class Hooks extends BaseCode  {

 // System.out.println("in hooks");

    @Before
    public void setUp() throws IOException {


        System.out.println("in hooks");
        BaseCode.LaunchBrowser();
    }
    @After
    public void TearDown()
    {

        //driver.close();
    }
}
