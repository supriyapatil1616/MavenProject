import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount=10)
    public void invocationCount(){
        System.out.println("number of Statement is same as invocation count");
    }
    @Test(invocationCount=20,invocationTimeOut=2)
    public void incocationtimeout(){
        System.out.println("TimeOut");
    }
}
