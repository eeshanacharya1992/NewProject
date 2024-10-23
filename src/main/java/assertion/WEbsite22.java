package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WEbsite22 {
	@Test
	public void Iphone() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.optus.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement link1 = driver.findElement(By.linkText("Shop iPhone 16 Pro"));//button[@font-size='small']
		link1.click();
		WebElement linkpro = driver.findElement(By.linkText("iPhone 16 Pro Max"));
		linkpro.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions actions = new Actions(driver);
		 for (int i = 0; i <=2; i++) 
		 {  // Scroll down 10 times
	         actions.sendKeys(Keys.ARROW_DOWN).perform();
	         Thread.sleep(500); 
		 }	
		WebElement colour = driver.findElement(By.xpath("//span[normalize-space()='Desert Titanium']"));
		colour.click();
		WebElement Memory = driver.findElement(By.xpath("//span[.='512GB']"));
		Memory.click();
		WebElement Irate = driver.findElement(By.xpath("//span[.='Outright']"));
		Irate.click(); //button[@aria-label='Select Plan Promo Plan'] 
		WebElement plan = driver.findElement(By.xpath("//button[@aria-label='Select Plan Promo Plan']"));
		plan.click(); 
//		WebElement cbu = driver.findElement(By.xpath("//button[@font-size='small']"));
//		cbu.click(); 
		//button[@class='sc-hTtIkV dghAgU Button__SCButton']
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement cbu = driver.findElement(By.cssSelector("button[font-size='small']"));
		cbu.click(); 
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();	
		////button[normalize-space()='Continue']
		////button[.='Continue']
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		//Thread.sleep(8000);
		driver.findElement(By.xpath("(//button[@class='mb-0 btn btn-primary w-md-100'])[2]")).click();
		
	
}
}