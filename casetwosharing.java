package sharing;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class casetwosharing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=J-kfiXUTU1U");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Google Sign in button
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();

		Thread.sleep(3000);
		// Here passing email and password

		driver.findElement(By.id("identifierId")).sendKeys("peloteando2@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='CwaK9']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='whsOnd zHQkBf']")).sendKeys("peloteando");

		driver.findElement(By.xpath("//*[@class='CwaK9']")).click();

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,300)");
//
//		Thread.sleep(3000);
//		System.out.println("1");
//		driver.findElement(By.xpath("(//*[@class='style-scope ytd-toggle-button-renderer'])[1]")).click();
//		System.out.println("1");
//		Thread.sleep(2000);
	//	System.out.println(driver.findElement(By.id("label")).getText());
		
		
		//Share on google+
		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//*[text()='Share'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='Google+']")).click();
		Set<String> set1=driver.getWindowHandles();
		Iterator<String> it1=set1.iterator();
		String pw1=it1.next();
		String cw1=it1.next();
		driver.switchTo().window(cw1);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@class='ZFr60d CeoRYc'])[2]")).click();
		
		
		
		//Share facebook
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[text()='Share'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@title='Facebook']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		String pw=it.next();
		String cw=it.next();
		driver.switchTo().window(cw);
		
		
		
		driver.findElement(By.id("email")).sendKeys("peloteando2@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("peloteando@123");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		driver.findElement(By.xpath("//*[@name='__CONFIRM__']")).click();
		driver.switchTo().window(cw);
		
		

	}

}
