import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PlaygroundDeleteAPI {

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
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//span[text()='Get Doctors'])[1]"));
		System.out.println("Clicked on API");
		driver.findElement(By.xpath("(//i[@class='mat-menu-trigger fa-solid fa-ellipsis-vertical fa-xl dot-icon position-absolute'])[1]")).click();
		System.out.println("Clicked on 3 dots");
		driver.findElement(By.xpath("//i[@class='fa-light fa-trash']")).click();
		System.out.println("Clicked on Delete");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn delete-btn py-1 ml-3 mr-0 my-0 px-5 rounded-pill btn-outline-none']")).click();
		System.out.println("Clicked on Delete Yes");
		
		//driver.findElement(By.linkText("Get Doctors")).click();
		//System.out.println("Clicked on API Name");
		
		}
		

	}

}
 