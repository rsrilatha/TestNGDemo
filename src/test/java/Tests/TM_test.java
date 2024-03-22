package Tests;
import Pages.LoginPage;
import Utilities.CommonDriver;
import org.openqa.selenium.bidi.Command;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TM_test extends CommonDriver {
    LoginPage loginpageobj = new LoginPage();

@Test(description = "sample test case",priority = 1)
    public void TM_setup() throws InterruptedException {
//open Chrome browser

        driver = new ChromeDriver();
        Thread.sleep(1000);

        //login page obj initialization and definition

        loginpageobj.LoginSteps(driver);

    }
    @BeforeTest
public void Startup()
    {
        System.out.println("test execution has begun");
    }
    @AfterTest
    public void ClosingSteps()
    {
        driver.quit();
    }
}





