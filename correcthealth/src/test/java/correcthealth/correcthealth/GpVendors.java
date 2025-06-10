package correcthealth.correcthealth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GpVendors {
	WebDriver driver = new ChromeDriver();
	  @Test
	  public void f() throws InterruptedException {
		  
		  driver.get("http://localhost:8080/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
    	 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();
		 	
		 	driver.findElement(By.xpath("//a[normalize-space()='GP Vendors']")).click();
		 	driver.findElement(By.xpath("//a[normalize-space()='GP Vendors Summary']")).click();
		 	Thread.sleep(5000);
		 	//Select Vendor Name
		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	//WebElement vendorname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select2-autoCompleterVendorName-container']")));
		 	//vendorname.click(); 
	        //WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='1ST CHOICE MEDICAL & CANCER CARE']")));
	        //option.click();
	        
	        //select vendor id
	        WebElement vendorid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Vendor ID')]")));
	        vendorid.click(); 
	        WebElement selectvendorid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='135-0690']")));
	        selectvendorid.click();
	        
	        //select vendor type
	        WebElement status = driver.findElement(By.id("vendorTypeId"));
	        Select select1 = new Select(status);
	        select1.selectByVisibleText("Eye Clinic");
	        
	      //select city
	        WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select City')]")));
	        city.click(); 
	        WebElement selectcity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='ACWORTH']")));
	        selectcity.click();
	        
	      //select state
	        WebElement state = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select State')]")));
	        state.click(); 
	        WebElement selectstate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='COIMBATORE']")));
	        selectstate.click();
	        
	      //select phone number
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterPhoneNumber1-container")));
	        phone.click();
	        WebElement selectphone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='20176770700000']")));
	        selectphone.click();
	        
	        //select status
	        WebElement selectstatus = driver.findElement(By.id("status"));
	        Select select2 = new Select(selectstatus);
	        select2.selectByVisibleText("Active");
	        
	        //Click Search Button
	        driver.findElement(By.id("newSearch")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("clearSearch")).click();
	        
	        //Click download
	        WebElement download = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@src='/CHCP/resources/images/excel.png'])[1]")));
	        download.click(); 
	        
	        
	        // Click Popup
	        WebElement popup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='ok']")));
	        popup.click();
	        
	      //Move to nextpage
	        WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vendorSummaryTable_next")));
	        nextpage.click();
	        //page navigation
	        WebElement pagenavigation = driver.findElement(By.name("vendorSummaryTable_length"));
	        Select select4 = new Select(pagenavigation);
	        select4.selectByVisibleText("80");
	        
	        //Back Navigation
	        driver.navigate().back();
	        
	        
  }
}
