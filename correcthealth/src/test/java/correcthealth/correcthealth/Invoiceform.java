package correcthealth.correcthealth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Invoiceform {
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
	@Test (enabled=false)
	public void f() throws InterruptedException {
		  driver.get("http://localhost:8090/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Invoices = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Invoices']")));
		 	Invoices.click(); 
		 	Thread.sleep(3000);
		 	WebElement Invoiceform = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Invoice Form']"))); 
		 	Invoiceform.click();
	  Thread.sleep(2000);
	  
	  
	  //Create New Invoice
	  driver.findElement(By.xpath("//button[normalize-space()='Create New Invoice']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("invoiceDate")).click();
	  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement invoicedate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[16]")));
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
       WebElement invoicedateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='2'][data-year='2024']")));
       invoicedateselect.click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='>>']")).click();
	  driver.findElement(By.xpath("(//input[@placeholder='Filter'])[2]")).sendKeys("harris");
	  Actions act = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]/option[1]")); 
	act.doubleClick(ele).perform();
	driver.findElement(By.xpath("//button[normalize-space()='Push Invoice Data to DB']")).click();
	Thread.sleep(40000);
	WebElement okay = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='ok']"))); 
	okay.click();
	Thread.sleep(1500);
	driver.findElement(By.id("generateInvoicePDF1")).click();
	Thread.sleep(5000);
	
	}
	
	//Search Function 
	//Facility
	@Test (enabled=false)
	public void edit() throws InterruptedException {
		  driver.get("http://localhost:8090/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Invoices = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Invoices']")));
		 	Invoices.click(); 
		 	Thread.sleep(3000);
		 	WebElement Invoiceform = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Invoice Form']"))); 
		 	Invoiceform.click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//tr[@id='row_41']//td[contains(@class,'edit-control btnCol')]")).click();
	  WebElement Facility = driver.findElement(By.name("facilityIdFilter"));
	Select Facilityselect = new Select(Facility);
	Facilityselect.selectByVisibleText("Harris County Prison (176)");
	Thread.sleep(1000);
	 WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
	 search.click();
	 Thread.sleep(1000);
	 WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
	 clear.click();
	
	//Contract Type
	 WebElement ContractType= driver.findElement(By.name("contractTypeFilter"));
		Select ContractTypeselect = new Select(ContractType);
		ContractTypeselect.selectByVisibleText("CAP");
		Thread.sleep(1000);
		 search.click();
		 Thread.sleep(1000);
		 clear.click();
		 
		//Invoice Type
		 WebElement InvoiceType= driver.findElement(By.name("invoiceTypeFilter"));
			Select InvoiceTypeselect = new Select(InvoiceType);
			InvoiceTypeselect.selectByVisibleText("CAP Invoice");
			
			Thread.sleep(1000);
			 search.click();
			 Thread.sleep(1000);
			 clear.click();
			 Thread.sleep(1000);
			 //Invoice Date
			 driver.findElement(By.id("invoiceDateFilter")).click();
			  WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		      WebElement invoiceDateFilter = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[26]")));
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		       WebElement invoiceDateFilterselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='2'][data-year='2024']")));
		       invoiceDateFilterselect.click();
		
		       Thread.sleep(1000);
				 search.click();
				 Thread.sleep(1000);
				 clear.click();
	
		//Invoice Status
		 WebElement Invoicestatus= driver.findElement(By.name("invoiceStatusFilter"));
			Select Invoicestatusselect = new Select(Invoicestatus);
			Invoicestatusselect.selectByVisibleText("Pending");
			
			Thread.sleep(1000);
			 search.click();
			 Thread.sleep(1000);
			 clear.click();
		 
			//Email Status
			 WebElement Emailstatus= driver.findElement(By.name("emailStatusFilter"));
				Select Emailstatusselect = new Select(Emailstatus);
				Emailstatusselect.selectByVisibleText("Not Emailed");
				
				Thread.sleep(1000);
				 search.click();
				 Thread.sleep(1000);
				 clear.click();
				 Thread.sleep(1000);
				 
					driver.findElement(By.id("validateInvoiceData")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
					Thread.sleep(1000);
					
					//Download and Delete
					driver.findElement(By.xpath("//tr[@id='row_2811']//img[@class='download-control fileDownloadBtn']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//tr[@id='row_2811']//img[@class='download-control fileDownloadBtn']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//tr[@id='row_2811']//td[contains(@class,'delete-control fileDeleteBtn')]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[normalize-space()='cancel']")).click();
					Thread.sleep(1000);
					
					//Edit Invoice
					driver.findElement(By.xpath("//tr[@id='row_2853']//td[contains(@class,'edit-control btnCol')]")).click();
					Thread.sleep(2000);
					 WebElement STATUS= driver.findElement(By.name("invoiceStatus"));
						Select STATUSCHANGE = new Select(STATUS);
						STATUSCHANGE.selectByVisibleText("Pending");
						Thread.sleep(2000);
					driver.findElement(By.id("appoveBtn")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("downloadInvoiceBtn")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//b[normalize-space()='Back to Invoice Form']")).click();
	}
					
				//Summary Search and Delete
					@Test (enabled=true)
					public void searchdelete() throws InterruptedException {
						  driver.get("http://localhost:8090/CHCP/login");
						 	driver.manage().window().maximize();
						 	
						 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
						 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
						 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
						 	rememberme.click();
						 	driver.findElement(By.id("btn-login")).click();

						 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
						 	WebElement Invoices = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Invoices']")));
						 	Invoices.click(); 
						 	Thread.sleep(3000);
						 	WebElement Invoiceform = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Invoice Form']"))); 
						 	Invoiceform.click();
					  Thread.sleep(2000);	
					
					//Invoice Date
						 driver.findElement(By.id("invoiceFromDateFilter")).click();
						  WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
					      WebElement invoiceDate = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					       WebElement invoiceDateFilterselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='2'][data-year='2024']")));
					       invoiceDateFilterselect.click();
					
					       Thread.sleep(1000);
							
					     //Invoice Date
							 driver.findElement(By.id("invoiceToDateFilter")).click();
							  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
						      WebElement invoiceDateto = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[10]")));
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      
						      WebElement invoiceDatetoselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='3'][data-year='2024']")));
						       invoiceDatetoselect.click();
						
						       Thread.sleep(2000);
					
					driver.findElement(By.id("newSearch")).click();
					Thread.sleep(2000);
					driver.findElement(By.id("clearSearch")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//tr[@id='row_38']//td[@class=' delete-control fileDeleteBtn']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[normalize-space()='cancel']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//th[@aria-label='Invoice Date: activate to sort column ascending']")).click();
					Thread.sleep(2000);
					//Page navigation
			        WebElement pagenavigation = driver.findElement(By.name("invoiceFormSummaryListTable_length"));
			        Select select4 = new Select(pagenavigation);
			        select4.selectByVisibleText("80");
			        Thread.sleep(3000);
			        WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("invoiceFormSummaryListTable_next")));
			        nextpage.click();
			        Thread.sleep(5000);
			        WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("invoiceFormSummaryListTable_previous")));
			        previous.click();
			        Thread.sleep(8000);
					
					}
}
