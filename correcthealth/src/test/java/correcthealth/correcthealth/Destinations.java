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

public class Destinations {
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
		 	
		 	driver.findElement(By.xpath("//a[normalize-space()='Destinations']")).click();
		 	driver.findElement(By.xpath("//a[@href='/CHCP/destination/destinationSummary']")).click();
		 	
		 	//Select Vendor Name
		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement vendorname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Vendor Name')]")));
		 	vendorname.click(); 
	        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")));
	        option.click();
	        
	        //select vendor id
	        WebElement vendorid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Vendor ID')]")));
	        vendorid.click(); 
	        WebElement selectvendorid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='202-1300']")));
	        selectvendorid.click();
	        
	        //select vendor type
	        WebElement status = driver.findElement(By.id("vendorTypeId"));
	        Select select1 = new Select(status);
	        select1.selectByVisibleText("Eye Clinic");
	        
	      //select city
	        WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select City')]")));
	        city.click(); 
	        WebElement selectcity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Acworth']")));
	        selectcity.click();
	        
	      //select state
	        WebElement state = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select State')]")));
	        state.click(); 
	        WebElement selectstate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='AL']")));
	        selectstate.click();
	        
	      //select phone number
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterPhoneNumber1-container")));
	        phone.click();
	        WebElement selectphone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='(000) 000-0000']")));
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
	       // WebElement download = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@src='/CHCP/resources/images/excel.png'])[1]")));
	        //download.click(); 
	        
	        
	        // Click Popup
	       // WebElement popup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='ok']")));
	       // popup.click();
	        
	      //Move to nextpage
	        //WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='destinationSummaryTable_next']")));
	        //nextpage.click();
	        //page navigation
	        WebElement pagenavigation = driver.findElement(By.name("destinationSummaryTable_length"));
	        Select select4 = new Select(pagenavigation);
	        select4.selectByVisibleText("80");
	        
	        
	        //Create new destination
	        driver.findElement(By.id("newDestinationAcc")).click();
	        WebElement selectstatus1 = driver.findElement(By.id("status"));
	        Select select3 = new Select(selectstatus1);
	        select3.selectByVisibleText("Active");
	        WebElement vendortype = driver.findElement(By.id("vendorTypeId"));
	        Select select5 = new Select(vendortype);
	        select5.selectByVisibleText("Eye Clinic");
	        driver.findElement(By.id("vendorName")).sendKeys("Ganga Hospital");
	        driver.findElement(By.id("address1")).sendKeys("2/348D DSP NAGAR, Mannarai post");
	        driver.findElement(By.id("address2")).sendKeys("Near Ks theatre");
	        driver.findElement(By.id("city")).sendKeys("Tirupur");
	        driver.findElement(By.id("state")).sendKeys("Tamilnadu");
	        driver.findElement(By.id("zipCode")).sendKeys("641607");
	        driver.findElement(By.id("phoneNumber1")).sendKeys("8489320176");
	        driver.findElement(By.id("faxNumber")).sendKeys("8765467890");
	        driver.findElement(By.id("phoneNumber2")).sendKeys("6543222345");
	        driver.findElement(By.id("taxID")).sendKeys("gst-001");
	        driver.findElement(By.id("notes")).sendKeys("Main Hospital");
	        Thread.sleep(2000);
	        WebElement savebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save']")));
	        savebutton.click();
	        
		 	
		 	
	  
	  
	  
	  
  }
}
