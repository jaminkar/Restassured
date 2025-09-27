import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PlayGroundSaveToSuite {

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
		driver.findElement(By.xpath("(//span[text()='Get Doctors'])[1]"));
		System.out.println("Clicked on API");
		driver.findElement(By.xpath("(//i[@class='mat-menu-trigger fa-solid fa-ellipsis-vertical fa-xl dot-icon position-absolute'])[1]")).click();
		System.out.println("Clicked on 3 dots");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa-light fa-floppy-disk']")).click();
		System.out.println("Clicked on SaveToSuite");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//mat-checkbox[@class='mat-checkbox mr-2 mat-primary']")).click();
		System.out.println("Clicked on First Checkbox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@id='save-test-suite-button']")).click();
		System.out.println("Clicked on Save");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Script Saved in Suite");
		
		
		//driver.findElement(By.linkText("Get Doctors")).click();
		//System.out.println("Clicked on API Name");
		
		}
		

	}

}
 