package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void TestCase1() {
        SoftAssert softassert = new SoftAssert();

        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        WebElement userTextBox=driver.findElement(By.id("login1"));
        Assert.assertEquals(driver.getTitle(),"rediffmail","Title should be match");
        Assert.assertTrue(userTextBox.isDisplayed(),"Textbox should be displyed");
        driver.close();
        softassert.assertAll();


    }
}
