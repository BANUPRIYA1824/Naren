
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		String RedbusURL = driver.getCurrentUrl();
		System.out.println(RedbusURL);

		if ("https://www.redbus.in/".equals(RedbusURL)) {
			System.out.println("The URL matched");
		} else {
			System.out.println("URL does not match");
		}
		
		driver.findElement(By.xpath("//a[@href='https://www.redbus.in/railways']")).click();

		

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Erode Jn");
		driver.findElement(By.xpath("//input[@id='dst']")).sendKeys("Salem Jn");
		driver.close();
	}

}
