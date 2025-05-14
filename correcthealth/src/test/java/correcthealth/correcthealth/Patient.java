package correcthealth.correcthealth;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Patient {
	WebDriver driver = new ChromeDriver();
	  @Test
	  public void f() throws InterruptedException {
		  driver.get("http://localhost:8090/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("akilanksa10@gmail.com");
		 	driver.findElement(By.id("password")).sendKeys("Dev@9092");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();
		 	driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
		 	
		 	//Patient Click
		 	driver.findElement(By.xpath("//a[normalize-space()='Patient']")).click();
		 	driver.findElement(By.xpath("//a[normalize-space()='Patients']")).click();
		 	Thread.sleep(25000);
		 	
		 	//select facility
		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterFacilityId-container")));
	        clear.click(); 
	        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Athens Correctional Institution (120)')]")));
	        option.click();
	        
	        //Select status
	        WebElement status = driver.findElement(By.id("status"));
	        Select select1 = new Select(status);
	        select1.selectByVisibleText("Active");
	        
	        //select patientid
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement patientDropdown = driver.findElement(By.id("select2-autoCompleterPatientID-container"));
	        patientDropdown.click();  
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement option1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[normalize-space()='120-P00011'])[1]")));
	        option1.click();
	        
	        //select patientname
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement patientnameDropdown = driver.findElement(By.xpath("//span[contains(text(),'Select Patient Name')]"));
	        patientnameDropdown.click();
	      WebElement option2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[normalize-space()='Peck Joseph'])[1]")));
	        option2.click();
	        
	        //selectbooking
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement selectbooking = driver.findElement(By.id("select2-autoCompleterBookingNumber-container"));
	        selectbooking.click();
	      WebElement option3 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='342']")));
	        option3.click();
	        
	        //select inmate
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement selectinmate = driver.findElement(By.id("select2-autoCompleterInmateNumber-container"));
	        selectinmate.click();
	      WebElement option4 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='1419551']")));
	        option4.click();
	        
	        //select type of inmate
	        WebElement typeinmate = driver.findElement(By.id("typeofInmate"));
	        Select select2 = new Select(typeinmate);
	        select2.selectByVisibleText("County Inmate");
	        
	        //Select housedin
	        //WebElement housedin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterHousedIn-container")));
	        //housedin.click(); 
	        //WebElement housedinoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Acadia Parish Jail (182)']")));
	        //housedinoption.click();
	        
	        //selectdate type
	        //WebElement selectdatetype = driver.findElement(By.id("datetype"));
	        //Select select3 = new Select(selectdatetype);
	        //select3.selectByVisibleText("Housed In");
	  
	  
	      //Click Search
	        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
	        search.click(); 
	        
	        //Click Clear
	        WebElement clear1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
	        clear1.click(); 
	        
	      //Move to nextpage
	        WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='newVisitSummaryTable_next']")));
	        nextpage.click();
	        
	        //page navigation
	        WebElement pagenavigation = driver.findElement(By.name("newVisitSummaryTable_length"));
	        Select select5 = new Select(pagenavigation);
	        select5.selectByVisibleText("80");
	        
	      //Click download
	         WebElement download = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@src='../resources/images/excel_small.png'])[1]")));
	         download.click(); 


	         //Click Clear
	         
	         clear1.click(); 
	         
	         //Click Patient Edit
	         WebElement patientedit = driver.findElement(By.xpath("//tr[@id='row_933721']//td[contains(@class,'edit-control')]"));
	         patientedit.click();
	         
	      WebElement editname = driver.findElement(By.id("lastName"));
	      editname.clear();
	      editname.sendKeys("suresh");
	      driver.findElement(By.id("saveBtnDiv1")).click();
	      driver.findElement(By.xpath("(//img[@class='img-responsive goSummary'])[1]")).click();
	       
	      //Download print
	      
	      WebElement patientprint = driver.findElement(By.xpath("//tr[@id='row_933721']//td[@class=' download-control fileDownloadBtn']"));
	      patientprint.click();
	        	 
	      //Delete Patient
	      
	      WebElement deletepatient = driver.findElement(By.xpath("//tr[@id='row_933721']//td[contains(@class,'delete-control fileDeleteBtn')]"));
	      deletepatient.click();
	      WebElement deletepopup = driver.findElement(By.xpath("//button[normalize-space()='cancel']"));
	      deletepopup.click();
	  }}
