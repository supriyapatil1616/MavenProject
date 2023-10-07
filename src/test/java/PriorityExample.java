import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority=3)
    public void testA(){
        System.out.println("A");
    }
    @Test(priority = 1)
    public void testZ(){
        System.out.println("z");
    }
    @Test(priority=5)
    public void testN(){
        System.out.println("N");
    }
    @Test
    public void testD(){
        System.out.println("D");
    }

}
