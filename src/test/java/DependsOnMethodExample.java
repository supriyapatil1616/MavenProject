import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void login(){
        System.out.println("Login to application");
        Assert.assertFalse(true);
    }
    @Test(dependsOnMethods={"login"})
    public void homepage(){
        System.out.println("Homepage of app");
    }
    @Test
    public void sendrequest(){
        System.out.println("Send Request");
    }
    @Test
    public void logout(){
        System.out.println("Logout");
    }
}
