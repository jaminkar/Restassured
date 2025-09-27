import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestSuite_ExecutePerformance {

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
			driver.findElement(By.cssSelector("input[id='username']")).sendKeys("tcarlyle@yummy-fast.fr");
			System.out.println("reach username");
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Heeresh@111");
			System.out.println("reach password");
			driver.findElement(By.xpath("//span[@class='ng-star-inserted']")).click();
			System.out.println("LoggedIn");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.xpath("(//div[@class='card-data d-flex flex-column p-2 w-100 h-100 position-absolute'])[2]")).click();
			System.out.println("Clicked on Test Suite");
			driver.findElement(By.xpath("(//span[@class='small-regular ml-1 text-truncate'])[1]")).click();
			System.out.println("Clicked on a Suite");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//div[@class='testsuite-api-wrapper d-flex rounded px-4 py-2 position-relative align-items-center testsuite-selected-api ng-star-inserted']")).click();
			System.out.println("Clicked on API");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='mat-menu-trigger dot-icon position-absolute api-text-dark ng-star-inserted'])[2]")).click();
			System.out.println("Clicked on 3 dots");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='fa-light fa-play']")).click();
			System.out.println("Clicked on Execute");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//i[@class='fa-light fa-gauge-high']")).click();
			System.out.println("Clicked on Performance");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//div[@class='caption-semibold api-text-dark slider-value']")).sendKeys("5");
			System.out.println("No of threads given");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//input[@class='api-p threshold-time text-center ng-touched ng-dirty ng-valid']")).sendKeys("50");
			System.out.println("Threshold value given");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
			
			
			
			
			
		}

	}

}
