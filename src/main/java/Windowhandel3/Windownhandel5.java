package Windowhandel3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Windownhandel5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement a=driver.findElement(By.placeholder("Month"));
		Select sel=new Select(wb);
		sel.selectByVisibleText("CSS");
		List<WebElement>ls=sel.getOptions();
		int a=ls.size();
		System.out.println(a);

	}

}
