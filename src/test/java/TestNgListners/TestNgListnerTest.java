package TestNgListners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgListnerTest {
WebDriver driver;
	
	
	@Test(priority = 1)
	public void Enterurl() 
	{
		try {
			
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		catch (Exception e) {
			
		}
		
	}
	@Test(priority = 2)
	void logoVerify() {
		Boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if(status==true) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		
	}
	
	@Test(priority = 3, dependsOnMethods = "Enterurl")
	void login() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test(priority = 4)
	void logout() {
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > header:nth-child(2) > div:nth-child(1) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)")).click();
		Boolean status1 = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if(status1==true) {
			driver.close();
			
			
		}
		
		
		
	}
	

}
