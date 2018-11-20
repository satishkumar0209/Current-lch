package sharing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcaseone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Google Sign in button
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();

		Thread.sleep(3000);
		// Here passing email and password

		driver.findElement(By.id("identifierId")).sendKeys("sf");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='CwaK9']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='whsOnd zHQkBf']")).sendKeys("yt");

		driver.findElement(By.xpath("//*[@class='CwaK9']")).click();

		Thread.sleep(6000);

		// Click on gmail icon
		driver.findElement(By.id("img")).click();

		Thread.sleep(3000);

		driver.get("https://www.youtube.com/account");
		// driver.findElement(By.xpath("//*[text()='Settings']")).click();

		// Click on Connected apps

		driver.findElement(By.xpath("//*[@id=\"creator-sidebar-section-id-account\"]/ul/li[5]/a")).click();

		// click on twitter account

		driver.findElement(By.xpath("(//*[@type='button'])[18]")).click();

		Set<String> set = driver.getWindowHandles();

		Iterator<String> it = set.iterator();

		String pw = it.next();

		String cw = it.next();

		driver.switchTo().window(cw);

		driver.findElement(By.id("username_or_email")).sendKeys("123@gmail.com");

		driver.findElement(By.id("password")).sendKeys("12345");

		driver.findElement(By.xpath("//*[@value='Authorize app']")).click();

		System.out.println("123");

		driver.switchTo().window(pw);

		driver.findElement(By.xpath("(//*[@type='submit'])[3]")).click();

	}

}
