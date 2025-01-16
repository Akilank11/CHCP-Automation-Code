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

public class Claimbill {
	WebDriver driver = new ChromeDriver();
	//WebDriver driver;
	//FirefoxOptions firefoxoptions = new FirefoxOptions();
	//ChromeOptions chromeoptions = new ChromeOptions();
	//EdgeOptions edgeoptions = new EdgeOptions();

	//@Parameters("browser")
	//@BeforeTest

	//public void initialize(String browser) 

	//{
		// if (browser.equalsIgnoreCase("chrome")) {
	          
	           // driver = new ChromeDriver();
	        //} else if (browser.equalsIgnoreCase("firefox")) {
	            
	            //driver = new FirefoxDriver();
	       // } else if (browser.equalsIgnoreCase("edge")) {
	           
	            //driver = new EdgeDriver();
	        //}
	        //driver.manage().window().maximize();
	    //}
	@Test
	public void f() throws InterruptedException {
		  driver.get("http://localhost:8090/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		 	driver.findElement(By.id("password")).sendKeys("Dev@5612");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement claimbills = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Claim Bills']")));
		 	claimbills.click(); 
		 	Thread.sleep(3000);
		 	WebElement claimbill = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Claim Bill']"))); 
		 	claimbill.click();
	  Thread.sleep(7000);
	  
	  //Select Facility
	WebElement facility = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterFacilityId-container")));
	facility.click(); 
      WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Carroll County Jail (107)']")));
      option.click();
      WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
      search.click(); 
      Thread.sleep(2000);
      WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
      clear.click(); 
      
    //Select Patientid
  	WebElement Patientid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterPatientID-container")));
  	Patientid.click(); 
  	driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("107-P02111");
  	WebElement Patientidoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='107-P02111']")));
        Patientidoption.click();
        search.click(); 
        Thread.sleep(2000);
        clear.click(); 
        
      //Select Patientname
      	WebElement Patientname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterPatientName-container")));
      	Patientname.click(); 
      	driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ham");
      	WebElement Patientnameoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Hamm Jennifer']")));
      	Patientnameoption.click();
            search.click(); 
            Thread.sleep(2000);
            clear.click();
            
            
            //Select ContentType
            	WebElement ContentType = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterContentType-container")));
            	ContentType.click(); 
            	WebElement ContentTypeoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Physician Bill']")));
            	ContentTypeoption.click();
                  search.click(); 
                  Thread.sleep(2000);
                  clear.click();
                  
                  //select bill id
                  driver.findElement(By.id("autoCompleterBillID")).sendKeys("107-B05240");
                  search.click(); 
                  Thread.sleep(2000);
                  clear.click();
                  
                //select visit  id
                  driver.findElement(By.id("autoCompleterVisitId")).sendKeys("107-V03900");
                  search.click(); 
                  Thread.sleep(2000);
                  clear.click();
                  
                //select Document Nbr
                  driver.findElement(By.id("autoCompleterDocumentNbr")).sendKeys("H10000048993100");
                  search.click(); 
                  Thread.sleep(2000);
                  clear.click();
                  
                  //Select Vendor
                	WebElement Vendor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterVendorId-container")));
                	Vendor.click();
                	WebElement Vendoroption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='2020 MEDICAL CONSULTING INC']")));
                	Vendoroption.click();
                      search.click(); 
                      Thread.sleep(2000);
                      clear.click();
                  
                    //Select Billstatus
                  	WebElement Billstatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterBillStatus-container")));
                  	Billstatus.click();
                  	WebElement Billstatusoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Pending']")));
                  	Billstatusoption.click();
                        search.click(); 
                        Thread.sleep(2000);
                        clear.click();
                        
                      //Select Payablestatus
                      	WebElement Payablestatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterPayableStatus-container")));
                      	Payablestatus.click();
                      	WebElement Payablestatusoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Pending']")));
                      	Payablestatusoption.click();
                            search.click(); 
                            Thread.sleep(2000);
                            clear.click();
                            
                            
                          //select Bill DOS Start Date
                            driver.findElement(By.id("dateFrom")).click();
                            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
             	           WebElement dos = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[6]")));
             	           dos.click();
             	           dos.click();
             	           dos.click();
             	           dos.click();
             	           dos.click();
             	           dos.click();
             	           WebElement dosselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='30'][data-month='5'][data-year='2024']")));
             	           dosselect.click();
             	
             //Select Bill DOS End Date
             	           WebElement invoice = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("dateTo")));
             	           invoice.sendKeys("07/15/2024");
             	           
             	           
             	        //Select Invoice Date
             		        WebElement Invoicedate = driver.findElement(By.id("invoiceDate"));
             		        Select select1 = new Select(Invoicedate);
             		        select1.selectByVisibleText("5/15/2024");
             		        
             		     //select Document Nbr
                            driver.findElement(By.id("chInvoiceNbr")).sendKeys("117093");
                            search.click(); 
                            Thread.sleep(2000);
                            clear.click();
             		        
  }
}
