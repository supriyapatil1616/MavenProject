package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParametersExample {
    @Parameters({"courseName","cityName"})
    @Test
    public void googleSearch(String courseName, String cityName) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        WebElement ele=driver.findElement(By.name("q"));
        ele.sendKeys(courseName + cityName);
        ele.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
