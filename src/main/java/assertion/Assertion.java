package assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
    @Test
    public void add()
    {
    	ChromeDriver driver= new ChromeDriver();
    	driver.get("https://www.google.com");
    //	Assert.assertEquals( driver.getTitle(),"ji");
  //   Assert.assertFalse(true);
    	Assert.assertTrue(true);
    }
}
