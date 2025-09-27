import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlayGround_Add_API {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.crome.driver", "D:\\chrome-win64\\chrome-win64");
		{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://stg-api.qyrus.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("tcarlyle@yummy-fast.fr");
		driver.findElement(By.id("password")).sendKeys("Heeresh@111");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("submit-button")).click();
		System.out.println("User Logged In");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[.='Playground']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Clicked on Playground");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//i[@class='fa-light fa-circle-plus']")).click();
		System.out.println("Clicked on + icon");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button[@id='Createmanually']")).click();
		System.out.println("Clicked on Create Manually");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abc");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Name Given");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button[@id='create-api-button']")).click();
		System.out.println("API Saved");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'abc')]")).click();
		System.out.println("Clicked On API");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname='apiEndpoint']")).sendKeys("petstore.swagger.io");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@formcontrolname='apiContextPath']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname='apiContextPath']")).sendKeys("/v2/pet/findByStatus");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button[@id='headers-params']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Params')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='key'])[2]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='key'])[2]")).sendKeys("status");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='value'])[2]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='value'])[2]")).sendKeys("sold");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//select[@formcontrolname='paramType']")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//option[@value='QUERY']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//i[@class='fa-light fa-floppy-disk mr-1 ng-star-inserted']")).click();
		System.out.println("API added and Saved.");
		
		
		
		

	}

}
}
