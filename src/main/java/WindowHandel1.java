import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandel1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement wb=driver.findElement(By.id("month"));
		Select sel= new Select (wb);
		sel.selectByIndex(5);
		WebElement abc= sel.getFirstSelectedOption();
		String a=abc.getText();
		System.out.println("a");
		

	}

}
