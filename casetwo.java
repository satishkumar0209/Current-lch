package sharing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class casetwo {

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
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Thread.sleep(3000);
		System.out.println("1");
		driver.findElement(By.xpath("(//*[@class='style-scope ytd-toggle-button-renderer'])[1]")).click();
		System.out.println("1");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("label")).getText());

	}

}
