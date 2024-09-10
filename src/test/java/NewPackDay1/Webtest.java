package NewPackDay1;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webtest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String Title = driver.getTitle();
		System.out.println(Title);
		WebElement m =driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		m.sendKeys("pixel7");
		m.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[normalize-space()='Google Pixel 7 (Snow, 128 GB)']")).click();
		Actions act = new Actions(driver);
		
		//driver.close();

	}

}
