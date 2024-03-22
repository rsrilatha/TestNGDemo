package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {
    public static void waitToBeClickable(WebDriver driver, String locatorType, String locatorValue, int seconds)
    {
        var wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (locatorType == "Xpath")
        {
            //wait.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementToBeClickable(By.XPath(locatorValue)));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
        }
        if (locatorType == "Id")
        {
           // wait.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementToBeClickable(By.Id(locatorValue)));
            wait.until(ExpectedConditions.elementToBeClickable(By.id(locatorValue)));
        }
        if (locatorType == "CssSelector")
            //wait.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementToBeClickable(By.CssSelector(locatorValue)));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locatorValue)));

        if (locatorType == "Name")
           // wait.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementToBeClickable(By.Name(locatorValue)));
            wait.until(ExpectedConditions.elementToBeClickable(By.name(locatorValue)));

    }

    //internal static void waitToBeClickable(IWebDriver driver, string v1, string v2, int v3)
    {
       // throw new NotImplementedException();
    }

   // internal static void waitToBeVisible(IWebDriver driver, string v1, int v2)
    {
        //throw new NotImplementedException();
    }

  //  internal static void waitToBeVisible(IWebDriver driver, string v1, string v2, int v3)
    {
        //throw new NotImplementedException();
    }

    //internal static void WaitToBeVisible(IWebDriver driver, string v1, string v2, int v3)
    {
       // throw new NotImplementedException();
    }
}