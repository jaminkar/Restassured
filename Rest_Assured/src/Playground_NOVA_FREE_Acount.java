import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
public class Playground_NOVA_FREE_Acount {

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
			driver.findElement(By.cssSelector("input[id='username']")).sendKeys("tcarlyle@kimssmartliving.com");
			System.out.println("reach username");
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Heeresh@111");
			System.out.println("reach password");
			driver.findElement(By.xpath("//span[@class='ng-star-inserted']")).click();
			System.out.println("LoggedIn");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.xpath("//span[.='Playground']")).click();
			System.out.println("Clicked on PlayGround");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.xpath("(//button[@id='nova-ai'])[2]")).click();
			System.out.println("Clicked on a NOVA");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			//int i = 1;
			/*
			 * for(i=1; i<=6; i++) {
			 * driver.findElement(By.xpath("(//button[@id='nova-ai'])[2]")).click();
			 * System.out.println("Clicked on a NOVA");
			 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 * driver.findElement(By.xpath("//button[contains(text(),' Generate Test Cases ')]")).click();
			 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); try {
			 * Thread.sleep(15000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); } //WebDriverWait wait = new
			 * WebDriverWait(driver, Duration.ofSeconds(15));
			 * driver.findElement(By.xpath("(//i[@class='fa-light fa-xmark fa-lg'])[2]")).
			 * click(); //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 * System.out.println( i + "Time Test Cases Generated"); }
			 */
			//By chromedriver;
			//Upgrade to Continue
			WebElement ele = driver.findElement(By.xpath("//button[@class='btn btn-outline-none qyrus-yellow-btn rounded p-2 ng-star-inserted']"));
			String text = ele.getText();
			System.out.println( text );
			//String bname1 = driver.getText("//button[@class='btn btn-outline-none qyrus-yellow-btn rounded p-2 ng-star-inserted']");
			if(text=="Upgrade to Continue")
			{
				System.out.println( "Test is pass and Nova assertion validation is working for Free account i.e. 5/5");
			}
			else
			{
				System.out.println( "Test is fail and Nova assertion validation is not working for Free account i.e. 5/5");
			}
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
		}

	}

}
