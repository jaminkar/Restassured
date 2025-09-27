import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSuite_NOVA_Free_Account {

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
		driver.findElement(By.id("username")).sendKeys("tcarlyle@kimssmartliving.com");
		driver.findElement(By.id("password")).sendKeys("Heeresh@111");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("submit-button")).click();
		System.out.println("User Logged In");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//div[@class='card-data d-flex flex-column p-2 w-100 h-100 position-absolute'])[2]")).click();
		System.out.println("Clicked on Test Suite");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
