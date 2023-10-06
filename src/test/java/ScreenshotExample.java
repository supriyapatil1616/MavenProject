import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotExample {
    public static void main(String args[]) throws InterruptedException, IOException {
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\HP\\Pictures\\Saved Pictures\\Testing2"+timestamp()+".png");
        FileUtils.copyFile(src,dest);

        Thread.sleep(2000);
        driver.close();

    }
    public static String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}
