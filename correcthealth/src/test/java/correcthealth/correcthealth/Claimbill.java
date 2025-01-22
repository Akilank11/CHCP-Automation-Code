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
	@Test(enabled=false)
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
     //  Create new Claim Bills                     
	@Test(enabled=false)
                        	public void createnewbill() throws InterruptedException {
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
                        	  Thread.sleep(9000);
                        	  
                        	  //Create new claim bill
                        	  driver.findElement(By.id("newClaimBill")).click();
                        	  Thread.sleep(5000);
                        	//Select Content Type
               		        WebElement Contenttype = driver.findElement(By.id("contentType"));
               		        Select Contenttypeselect = new Select(Contenttype);
               		     Contenttypeselect.selectByVisibleText("Physician Bill");
               		     Thread.sleep(2000);
               		  WebElement facility = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterFacilityId-container")));
               		facility.click(); 
               		Thread.sleep(2000);
               	      WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Acadia Parish Jail (182)']")));
               	      option.click(); 
               		       Thread.sleep(2000);
               		    WebElement Patientname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterPatientID-container")));
               	      	Patientname.click(); 
               	      	driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Patient");
               	     Thread.sleep(2000);
               	      	WebElement Patientnameoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Patient New Test']")));
               	      	Patientnameoption.click();
               	      	Thread.sleep(2000);
               	     WebElement Vendor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterVendorName-container")));
               	  Vendor.click(); 
               	Thread.sleep(2000);
                	      WebElement Vendoroption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='2020 MEDICAL CONSULTING INC']")));
                	      Vendoroption.click(); 
                		       Thread.sleep(2000);
                		       WebElement Visitid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterVisitId-container")));
                		       Visitid.click(); 
                		       Thread.sleep(2000);
                             	      WebElement Visitidoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='182-V00029 - 01/18/2025']")));
                             	     Visitidoption.click(); 
                             		       Thread.sleep(2000);
                             		      WebElement parentVisitid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterParentVisitId-container")));
                             		     parentVisitid.click(); 
                             		    Thread.sleep(2000);
                                        	      WebElement parentVisitidoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='182-V00029 - 01/18/2025']")));
                                        	      parentVisitidoption.click(); 
                                        		       Thread.sleep(2000);
                                        		       
                                        		       
                                        		     //select Bill DOS Start Date
                                                       driver.findElement(By.id("billDOS")).click();
                                                       WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
                                        	           WebElement dosselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='18'][data-month='0'][data-year='2025']")));
                                        	           dosselect.click();
                                        	
                                        //Select Bill DOS End Date
                                        	           WebElement invoice = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("billDOSEnd")));
                                        	           invoice.sendKeys("02/15/2025");
                                        	           
               	      	driver.findElement(By.id("billingVendorName")).sendKeys("Chioce Medical");
               	      	driver.findElement(By.xpath("(//input[@id='billingAddress'])[1]")).sendKeys("MGR Nagar");
               	     driver.findElement(By.xpath("(//input[@id='billingAddress2'])[1]")).sendKeys("2nd Street");
               	  driver.findElement(By.id("billingCity")).sendKeys("Tirupur");
               	 driver.findElement(By.id("billingState")).sendKeys("Tamilnadu");
               	driver.findElement(By.id("billingZip")).sendKeys("641607");
               	driver.findElement(By.id("billingTaxID")).sendKeys("1234AK"); 	
               	
               	
               	//CLAIM FORM DETAILS
               	driver.findElement(By.id("documentNbr")).sendKeys("1245KMN");
               	driver.findElement(By.id("providerName")).sendKeys("Test123");
                WebElement Service = driver.findElement(By.id("serviceLocation"));
   		        Select Serviceselect = new Select(Service);
   		     Serviceselect.selectByVisibleText("Hospital");
   		  driver.findElement(By.id("billCreated")).click();
          WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
          WebElement billselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='18'][data-month='0'][data-year='2025']")));
          billselect.click();
          Thread.sleep(1000);
          driver.findElement(By.id("gpAcctNbr")).sendKeys("1245KMNU");
          driver.findElement(By.id("gpAcctNbr2")).sendKeys("124MNU");
          driver.findElement(By.id("gpAcctAmt")).sendKeys("10.02");
          driver.findElement(By.id("versionID")).clear();
          driver.findElement(By.id("versionID")).sendKeys("2.5");
          
          
          //Pricing Details
          WebElement thirdpartyrepricing = driver.findElement(By.id("thirdPartyRepricing"));
		        Select thirdpartyrepricingselect = new Select(thirdpartyrepricing);
		        thirdpartyrepricingselect.selectByVisibleText("Yes");
		     Thread.sleep(1000);
		     WebElement paidbyfacility = driver.findElement(By.id("paidByFacility"));
		        Select paidbyfacilityselect = new Select(paidbyfacility);
		        paidbyfacilityselect.selectByVisibleText("Yes");
		     Thread.sleep(1000);
		     WebElement Duplicate = driver.findElement(By.id("duplicate"));
		        Select Duplicateselect = new Select(Duplicate);
		        Duplicateselect.selectByVisibleText("Yes");
		     Thread.sleep(1000);
		     WebElement Invalid = driver.findElement(By.id("invalid"));
		        Select Invalidselect = new Select(Invalid);
		        Invalidselect.selectByVisibleText("No");
		     Thread.sleep(1000);
		     WebElement Invalidreason = driver.findElement(By.id("invalidReason"));
		        Select Invalidreasonselect = new Select(Invalidreason);
		        Invalidreasonselect.selectByVisibleText("Patient not booked");
		     Thread.sleep(1000);
		     driver.findElement(By.id("anesthesiaTime")).sendKeys("2 Min");
		     WebElement Repricing = driver.findElement(By.id("repricing"));
		        Select Repricingselect = new Select(Repricing);
		        Repricingselect.selectByVisibleText("Full Price");
		     Thread.sleep(1000);
		     WebElement InvoiceDate = driver.findElement(By.id("invoiceDate"));
		        Select InvoiceDateselect = new Select(InvoiceDate);
		        InvoiceDateselect.selectByVisibleText("12/15/2024");
		        Thread.sleep(1000);
		        driver.findElement(By.id("savebtn")).click();
		        driver.findElement(By.id("repricebtn")).click();
		        driver.findElement(By.xpath("//button[normalize-space()='Validate']")).click();
		        driver.findElement(By.id("approvebtn1")).click();
		        driver.findElement(By.xpath("//button[normalize-space()='Pending Hospital']")).click();
		        driver.findElement(By.xpath("//button[normalize-space()='Pending Review']")).click();
		        driver.findElement(By.id("cancelbtn")).click();
		        driver.findElement(By.id("unApprovebtn2")).click();
		        
		        
		     
  }
	 //  Edit Claim Bill and Sorting                  
		@Test
	                        	public void Editandsorting() throws InterruptedException {
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
	                        	  Thread.sleep(9000);
	                        	  
	                        	  //Sorting
	                        	  driver.findElement(By.xpath("//th[@aria-label='Content Type: activate to sort column ascending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Content Type: activate to sort column descending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Bill ID: activate to sort column ascending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Bill ID: activate to sort column descending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Document Nbr: activate to sort column ascending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Document Nbr: activate to sort column descending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Bill DOS: activate to sort column ascending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Bill DOS: activate to sort column descending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Patient ID: activate to sort column ascending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Patient ID: activate to sort column descending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Facility: activate to sort column ascending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Facility: activate to sort column descending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Vendor: activate to sort column ascending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Vendor: activate to sort column descending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Bill Status: activate to sort column ascending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Bill Status: activate to sort column descending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Payable Status: activate to sort column ascending']")).click();
	                        	  Thread.sleep(1000);
	                        	  driver.findElement(By.xpath("//th[@aria-label='Payable Status: activate to sort column descending']")).click();
	                        	  Thread.sleep(1000);
                      		 	claimbill.click();
                      		 	Thread.sleep(4000);
                      		 	WebElement InvoiceDate = driver.findElement(By.xpath("//tr[@id='row_1465998']//select[@id='selectedVisitID']"));
                		        Select InvoiceDateselect = new Select(InvoiceDate);
                		        InvoiceDateselect.selectByVisibleText("120-V02141");
                		        Thread.sleep(2000);
                		        driver.findElement(By.id("saveVisitList")).click();
                		        Thread.sleep(4000);
                		        driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
                		        Thread.sleep(2000);
                		        driver.findElement(By.xpath("//img[@src='../resources/images/excel_small.png']")).click();
                		        Thread.sleep(1000);
                		        WebElement pagenavigation = driver.findElement(By.name("claimBillsSummaryTable_length"));
                		        Select select = new Select(pagenavigation);
                		        select.selectByVisibleText("50");
                		        Thread.sleep(3000);
                		        WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("claimBillsSummaryTable_next")));
                		        nextpage.click();
                		        Thread.sleep(5000);
                		        WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("claimBillsSummaryTable_previous")));
                		        previous.click();
                		        Thread.sleep(8000);
                		          
                		        
}
}	