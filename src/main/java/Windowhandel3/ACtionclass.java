package Windowhandel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACtionclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		driver.manage().window().maximize();
		WebElement wb=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.click(wb).build().perform();
		
		

	}

}
