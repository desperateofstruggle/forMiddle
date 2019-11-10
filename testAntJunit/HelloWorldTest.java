import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class HelloWorldTest{
   @Test
   public void testHello(){
       HelloWorld helloworld =new HelloWorld(); 
       assertEquals("Hello World!",  helloworld.Hello());
       assertEquals("Hello World",  helloworld.Hello());
   }
}