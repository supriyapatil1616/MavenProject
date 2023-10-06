package Parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class PwithAnotationExample {
    public static WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethod(String browserName){
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
    }
}
