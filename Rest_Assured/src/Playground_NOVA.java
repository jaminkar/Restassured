import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Playground_NOVA {

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
			driver.findElement(By.cssSelector("input[id='username']")).sendKeys("tcarlyle@slimbodybylipolight.com");
			System.out.println("reach username");
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Heeresh@111");
			System.out.println("reach password");
			driver.findElement(By.xpath("//span[@class='ng-star-inserted']")).click();
			System.out.println("LoggedIn");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.xpath("//span[.='Playground']")).click();
			System.out.println("Clicked on PlayGround");
			driver.findElement(By.xpath("(//button[@id='nova-ai'])[2]")).click();
			System.out.println("Clicked on a NOVA");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.xpath("//button[contains(text(),' Generate Test Cases ')]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']")).click();
			driver.findElement(By.xpath("//button[contains(text(),' Add Test Cases to API ')]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.xpath("//button[@class='Apply']")).click();
			System.out.println("Test Cases Added Succesfully");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Clicked On Add Test Cases to API");
			
			
			
			
			
			
		}

	}

}
