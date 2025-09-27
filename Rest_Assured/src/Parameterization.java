import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver", "D:/HeereshJ/OneDrive/OneDrive - Quinnox Consultancy Services LtdDocuments/chrome.exe");
		{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://stg-api.qyrus.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("sanqaeshqa@yt-google.com"); 
		driver.findElement(By.id("password")).sendKeys("Heeresh@111");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("submit-button")).click();
		System.out.println("User Logged In");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//div[@class='card-data d-flex flex-column p-2 w-100 h-100 position-absolute'])[2]")).click();
		System.out.println("Clicked on Test Suite");
		driver.findElement(By.xpath("(//span[@class='small-regular ml-1 text-truncate'])[1]")).click();
		System.out.println("Clicked on a Suite");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//i[@class='fa-solid fa-ellipsis-vertical fa-lg'])[1]")).click();
		System.out.println("Clicked Suiion 3 dots");
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
		System.out.println("Details Given");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='slider round'])[2]")).click();
		System.out.println("API Paramterized button toggled");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='headers-params']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Params')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='key'])[2]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='key'])[2]")).sendKeys("status");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//input[@placeholder='value'])[2]")).sendKeys("Status");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//select[@formcontrolname='paramType']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//span[@class='slider round'])[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Query Paramterized button toggled");
		System.out.println("Query param Given");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[contains(text(),'Headers')]")).click();
		System.out.println("Clicked on headers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//span[@class='slider round'])[3]")).click();
		driver.findElement(By.xpath("//input[@class='mat-autocomplete-trigger form-control form-control-sm ng-untouched ng-pristine ng-valid']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@class='mat-autocomplete-trigger form-control form-control-sm ng-untouched ng-pristine ng-valid']")).sendKeys("accept");
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		System.out.println("Header Key given");
		
		driver.findElement(By.xpath("(//input[@class='form-control form-control-sm pr-4 ng-untouched ng-pristine ng-valid'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//input[@class='form-control form-control-sm pr-4 ng-untouched ng-pristine ng-valid'])[1]")).sendKeys("application/json");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Header added");
		//driver.findElement(By.xpath("(//span[@class='slider round'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Header Parameterized");
		
		driver.findElement(By.xpath("//button[@id='test-cases-tab']")).click(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Clicked on test case tab");
		driver.findElement(By.xpath("//span[contains(text(),'Response Test Cases')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Clicked on Response test case");
		driver.findElement(By.xpath("(//select[@class='custom-select-sm custom-select response-custom-dropdown ng-untouched ng-pristine ng-valid'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//select[@formcontrolname='responseType'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//input[@class='form-control form-control-sm pr-4 ng-untouched ng-pristine ng-valid'])[1]")).click();
		Thread.sleep(1000);
		System.out.println("Status code selected from dropdown");
	    driver.findElement(By.xpath("(//input[@class='form-control form-control-sm pr-4 ng-untouched ng-pristine ng-valid'])[1]")).sendKeys("Status_Code");
		Thread.sleep(1000);
		System.out.println("Status_code Header name passed for the file");
		driver.findElement(By.xpath("(//span[@class='slider round'])[3]")).click();
		System.out.println("Header name passed to the file ");
		driver.findElement(By.xpath("//i[@class='fa-light fa-floppy-disk mr-1 ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='small-regular api-sm-font title d-flex align-items-center justify-content-end'])[2]")).click();
		System.out.println("Clicked on header assertion");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//input[@id='mat-input-1'])[1]")).click();
		System.out.println("Clicked on header key value");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//input[@class='form-control form-control-sm pr-4 ng-untouched ng-pristine ng-valid'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//input[@class='form-control form-control-sm pr-4 ng-untouched ng-pristine ng-valid'])[3]")).sendKeys("Accept");
		driver.findElement(By.xpath("(//span[@class='slider round'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa-light fa-floppy-disk mr-1 ng-star-inserted']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Header Assertion added");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='small-regular api-sm-font title d-flex align-items-center justify-content-end'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		System.out.println("Clicked on Json Path Test case");
		driver.findElement(By.xpath("//input[@class='form-control form-control-sm ng-untouched ng-pristine ng-valid ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@class='form-control form-control-sm ng-untouched ng-pristine ng-valid ng-star-inserted']")).sendKeys("$[0].status");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//input[@class='form-control form-control-sm pr-4 ng-untouched ng-pristine ng-valid ng-star-inserted'])[1]")).sendKeys("$[0].status");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//span[@class='slider round'])[5]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//i[@class='fa-light fa-floppy-disk mr-1 ng-star-inserted']")).click();
		System.out.println("Json path Assertion Added");
		
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='small-regular api-sm-font title d-flex align-items-center justify-content-end'])[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='bodyassertionvalue-0']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='bodyassertionvalue-0']")).sendKeys("Status_value");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//span[@class='slider round'])[6]")).click();
		driver.findElement(By.xpath("//i[@class='fa-light fa-floppy-disk mr-1 ng-star-inserted']")).click();
		System.out.println("Body Assertion Added");
		
		driver.findElement(By.xpath("//i[@class='fa-light fa-floppy-disk mr-1 ng-star-inserted']")).click();
		System.out.println("Paramterized API Saved");
		driver.findElement(By.xpath("//button[contains(text(),' Test Data ')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button[@class='btn btn-outline-none d-flex justify-content-center align-items-center qyrus-yellow-btn px-2 p-1 border-radius-xl small-regular']")).click();
		System.out.println("Paramterized file downloaded");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-outline-none d-flex justify-content-center align-items-center qyrus-light-btn px-2 p-1 border-radius-xl small-regular']")).click();
		
		
		

	}

}
}
