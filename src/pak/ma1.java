package pak;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ma1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:/# SK #/4_Others/Backup/Automation/Selenium JARs/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://rc-health.brightsquid.com/login");
		dr.findElement(By.id("email")).sendKeys("ckent@brightsquid.com");
		dr.findElement(By.id("password")).sendKeys("ch1c4g0");
		dr.findElement(By.xpath(".//*[@type='submit']")).click();
		System.out.println("Successfully Done");
		Thread.sleep(3000);
		dr.findElement(By.className("dropdown-toggle")).click();
		dr.findElement(By.xpath(".//*[@data-reactid='.0.0.0.1.1.0.1.1']")).click();
		
		List<WebElement> LW1 = dr.findElements(By.xpath(".//*[@data-reactid='.0.1.0.0']"));
		Random rand = new Random(System.currentTimeMillis());
		
		for(WebElement W1 : LW1)
		{
			System.out.println("Menu Selected : "+ W1.getText());
			W1.click();
		}

	}

}
