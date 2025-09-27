import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver", "D:/HeereshJ/OneDrive/OneDrive - Quinnox Consultancy Services LtdDocuments/chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.getTitle();
		System.out.println(driver.getTitle());
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"))).build().perform();
		driver.manage().window().maximize();
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		
		/*
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 * driver.findElement(By.id("username")).sendKeys("sanqaeshqa@yt-google.com");
		 * driver.findElement(By.id("password")).sendKeys("Heeresh@111");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * driver.findElement(By.id("submit-button")).click();
		 * System.out.println("User Logged In");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 * driver.findElement(By.
		 * xpath("(//div[@class='card-data d-flex flex-column p-2 w-100 h-100 position-absolute'])[2]"
		 * )).click(); System.out.println("Clicked on Test Suite");
		 * driver.findElement(By.
		 * xpath("(//span[@class='small-regular ml-1 text-truncate'])[1]")).click();
		 * System.out.println("Clicked on a Suite");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 */
	
	}

}
