import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;


@Listeners(listenerInterface.class)

public class NewTest {
  
	@BeforeSuite
  public void beforeSuite() {
  
  System.out.println("Before Suite");
  
  }

  @Test
  public void f() {
  SoftAssert softassert = new SoftAssert();
	  
  System.out.println("Test Case");
  softassert.assertEquals("Hi", "hi");
  System.out.println("Hi we are here"); 
  softassert.assertEquals(4, 4);
  System.out.println("Hi after number");
  softassert.assertEquals(true, false);
  System.out.println("After true and false alert");
  softassert.assertAll();
  
  }
 
  
  @AfterSuite
  public void afterSuite() {
  
  System.out.println("After Suite");
  }

}
