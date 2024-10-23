package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Website {
	@Test
	public void Iphone() throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.optus.com.au/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	WebElement link1 = driver.findElement(By.linkText("Shop iPhone 16 Pro"));
	link1.click();
	WebElement linkpro = driver.findElement(By.linkText("iPhone 16 Pro Max"));
	linkpro.click();
	WebElement colour = driver.findElement(By.xpath("//span[normalize-space()='Desert Titanium']"));
	colour.click();
	WebElement Memory = driver.findElement(By.xpath("//span[.='512GB']"));
	Memory.click();
	WebElement Irate = driver.findElement(By.xpath("//span[.='Outright']"));
	Irate.click(); //button[@aria-label='Select Plan Promo Plan']
	WebElement plan = driver.findElement(By.xpath("//button[@aria-label='Select Plan Promo Plan']"));
	plan.click(); ////button[@class='sc-iWajrY flGqHq Button__SCButton']
	WebElement cbu = driver.findElement(By.xpath("//div[@class='cta-cart-wrapper']"));
	cbu.click(); ////button[@class='sc-iWajrY flGqHq Button__SCButton']
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-intent mb-3 js-aem-handover-submit-btn mobileFlow']")).click();
	//Thread.sleep(8000) ;
WebElement s1=driver.findElement(By.xpath("(//span[.='iPhone 16 Pro Max'])[1]"));
//System.out.println(link1.isDisplayed());
if(link1.getText()==s1.getText())
{
	System.out.println("Elements are same");
}
else {
	System.out.println("Not same");
}
	}
	}
