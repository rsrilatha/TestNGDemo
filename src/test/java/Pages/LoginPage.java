package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    public void LoginSteps(WebDriver driver) throws InterruptedException {
        driver.manage().window().maximize();

        // launch turnup portal
        driver.navigate().to("http://horse.industryconnect.io/Account/Login?ReturnUrl=%2f");
        Thread.sleep(1500);

        try
        {
            // identify the username textbox and enter a valid username
            WebElement usernameTextbox = driver.findElement(By.id("UserName"));
            usernameTextbox.sendKeys("HARI");
        }
        catch (Exception ex)
        {
          //  Assert.Fail("TurnUp portal hasn't launched. ", ex.Message);
            Assert.fail("TurnUp portal hasn't launched");
        }


        // identify password textbox and enter valid password
        WebElement passwordTextbox = driver.findElement(By.id("Password"));
        passwordTextbox.sendKeys("789789");

        // click on login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[3]/input[1]"));
        loginButton.click();
        Thread.sleep(2000);
    }
}

