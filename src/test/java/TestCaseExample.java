import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseExample {

    public static WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Test(enabled =false)

    public void TestCase1(){

        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();


    }

    @Test
    public void TestCase2(){

        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
