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
	  public void Patientcreate() throws InterruptedException {
		    driver.get("http://localhost:8080/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
  	 	    driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();
		 	
		 	//Patient Click
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Patient = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Patient']")));
		 	Patient.click(); 
		 	Thread.sleep(3000);
		 	WebElement Patients = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Patients']"))); 
		 	Patients.click();
		 	Thread.sleep(9000);
	  
	  //Patient Create
	  driver.findElement(By.id("newPatientAcc")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("firstName")).sendKeys("Akilan");
	  driver.findElement(By.id("middleInitial")).sendKeys("Test");
	  driver.findElement(By.id("lastName")).sendKeys("Patient");
	  driver.findElement(By.id("patientDOB")).click();
      WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement DOB = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[18]")));
      DOB.click();
      DOB.click();
      DOB.click();
      DOB.click();
      DOB.click();
      DOB.click();
      WebElement DOBselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='30'][data-month='0'][data-year='2025']")));
      DOBselect.click();
      Thread.sleep(1000);
      WebElement Facility = driver.findElement(By.id("facilityId"));
      Select Facilityselect = new Select(Facility);
      Facilityselect.selectByVisibleText("Test (010)");
      WebElement Booking = driver.findElement(By.id("inmateBookedIn"));
      Select Bookingselect = new Select(Booking);
      Bookingselect.selectByVisibleText("No");
      driver.findElement(By.id("bookingNumber")).sendKeys("56879");
      driver.findElement(By.id("bookInDateTime")).click();
      WebElement Bookindate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[24]")));
      Bookindate.click();
      WebElement Bookindateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='30'][data-month='4'][data-year='2025']")));
      Bookindateselect.click();
      Thread.sleep(1000);
      driver.findElement(By.id("insuredID")).sendKeys("561279");
      driver.findElement(By.id("inmateNumber")).sendKeys("5687459");
      driver.findElement(By.id("typeofInmate1")).click();
      WebElement Housedin = driver.findElement(By.id("housedIn"));
      Select Housedinselect = new Select(Housedin);
      Housedinselect.selectByVisibleText("Test (010)");
      driver.findElement(By.id("housedInDate")).click();
      WebElement Houseddateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='30'][data-month='5'][data-year='2025']")));
      Houseddateselect.click();
      Thread.sleep(1000);
      driver.findElement(By.id("patientNote")).sendKeys("Test");
      WebElement patientsex = driver.findElement(By.id("sex"));
      Select patientsexselect = new Select(patientsex);
      patientsexselect.selectByVisibleText("Male");
      WebElement patientrace = driver.findElement(By.id("race"));
      Select patientraceselect = new Select(patientrace);
      patientraceselect.selectByVisibleText("Hispanic");
      driver.findElement(By.id("otherAllergies")).sendKeys("Allergy");
      Thread.sleep(1000);
      driver.findElement(By.id("saveBtnDiv1")).click();
      Thread.sleep(1000);
	}
	  @Test(enabled = false)
	  public void f() throws InterruptedException {
		  driver.get("http://localhost:8080/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
    	 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();
		 	
		 	
		 	//Patient Click
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Patient = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Patient']")));
		 	Patient.click(); 
		 	Thread.sleep(3000);
		 	WebElement Patients = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Patients']"))); 
		 	Patients.click();
	  Thread.sleep(9000);
		 	
		 	//select facility
		 	
	  WebElement facility = driver.findElement(By.id("select2-autoCompleterFacilityId-container"));
	  facility.click();  
	        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Athens Correctional Institution (120)')]")));
	        option.click();
	      //Click Search
	        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
	        search.click(); 
	        Thread.sleep(1000);
	        //Click Clear
	        WebElement clear1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
	        clear1.click();
	        Thread.sleep(1000);
	        
	        //Select status
	        WebElement status = driver.findElement(By.id("status"));
	        Select select1 = new Select(status);
	        select1.selectByVisibleText("Active");
	        search.click(); 
	        Thread.sleep(1000);
	        clear1.click();
	        Thread.sleep(1000);
	        
	        //select patientid
	        facility.click();
	        option.click();
	        Thread.sleep(1000);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement patientDropdown = driver.findElement(By.id("select2-autoCompleterPatientID-container"));
	        patientDropdown.click();  
	        
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement option1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[normalize-space()='120-P00011'])[1]")));
	        option1.click();
	        search.click(); 
	        Thread.sleep(1000);
	        clear1.click();
	        Thread.sleep(1000);
	        
	        //select patientname
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement patientnameDropdown = driver.findElement(By.xpath("//span[contains(text(),'Select Patient Name')]"));
	        patientnameDropdown.click();
	      WebElement option2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Sheardon Allen']")));
	        option2.click();
	        search.click(); 
	        Thread.sleep(1000);
	        clear1.click();
	        Thread.sleep(1000);
	        
	        //selectbooking
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement selectbooking = driver.findElement(By.id("select2-autoCompleterBookingNumber-container"));
	        selectbooking.click();
	      WebElement option3 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='007']")));
	        option3.click();
	        search.click(); 
	        Thread.sleep(1000);
	        clear1.click();
	        Thread.sleep(1000);
	        
	        //select inmate
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement selectinmate = driver.findElement(By.id("select2-autoCompleterInmateNumber-container"));
	        selectinmate.click();
	      WebElement option4 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='1048875']")));
	        option4.click();
	        search.click(); 
	        Thread.sleep(1000);
	        clear1.click();
	        Thread.sleep(1000);
	        
	        //select type of inmate
	        WebElement typeinmate = driver.findElement(By.id("typeofInmate"));
	        Select select2 = new Select(typeinmate);
	        select2.selectByVisibleText("County Inmate");
	        search.click(); 
	        Thread.sleep(1000);
	        clear1.click();
	        Thread.sleep(1000);
	        
	        //Select housedin
	        WebElement housedin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Housed In')]")));
	        housedin.click(); 
	        WebElement housedinoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Bartow County Jail (114)']")));
	        housedinoption.click();
	        search.click(); 
	        Thread.sleep(1000);
	        clear1.click();
	        Thread.sleep(1000);
	        
	        //selectdate type
	        WebElement selectdatetype = driver.findElement(By.id("datetype"));
	        Select select3 = new Select(selectdatetype);
	        select3.selectByVisibleText("Housed In");
	        
	        
	      //Select Issue From Date
	        driver.findElement(By.id("dateFrom")).click();
	      
	        WebElement Issuefromdate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
	        Issuefromdate.click();
	        Issuefromdate.click();
	        Issuefromdate.click();
	        Issuefromdate.click();
	        WebElement issuedateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='19'][data-month='0'][data-year='2025']")));
	        issuedateselect.click();
	        

	        //Select Issue To Date
	        driver.findElement(By.id("dateTo")).click();
	        WebElement Issuetodate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[10]")));
	        Issuetodate.click();
	        Issuetodate.click();
	        WebElement Issuetodateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='1'][data-month='2'][data-year='2025']")));
	        Issuetodateselect.click();
	        search.click(); 
	        Thread.sleep(1000);
	        clear1.click();
	        Thread.sleep(1000);
	        
	  }
	  @Test(enabled = false)
      public void Edituser() throws InterruptedException {
      	driver.get("http://localhost:8080/CHCP/login");
  	 	driver.manage().window().maximize();
  	 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
  	 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
  	 	rememberme.click();
  	 	driver.findElement(By.id("btn-login")).click();
	  
  	//Patient Click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Patient = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Patient']")));
	 	Patient.click(); 
	 	Thread.sleep(3000);
	 	WebElement Patients = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Patients']"))); 
	 	Patients.click();
  Thread.sleep(9000);
	        
	        //Page navigation
	        WebElement pagenavigation = driver.findElement(By.name("summaryTable_length"));
	        Select select4 = new Select(pagenavigation);
	        select4.selectByVisibleText("50");
	        Thread.sleep(3000);
	        WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("summaryTable_next")));
	        nextpage.click();
	        Thread.sleep(5000);
	        WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("summaryTable_previous")));
	        previous.click();
	        Thread.sleep(8000);
	        
	      //Click download
	         WebElement download = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/CHCP/resources/images/excel.png']")));
	         download.click(); 


	   
	         
	       
	         
	         //Click Patient Edit
	         WebElement patientedit = driver.findElement(By.xpath("(//td[@class=' edit-control'])[1]"));
	         patientedit.click();
	         
	      WebElement editname = driver.findElement(By.id("lastName"));
	      editname.clear();
	      editname.sendKeys("suresh");
	      driver.findElement(By.id("saveBtnDiv1")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("(//img[@class='img-responsive goSummary'])[1]")).click();
	       
	      //Download print
	      
	      WebElement patientprint = driver.findElement(By.xpath("(//td[contains(@class,'download-control fileDownloadBtn')])[1]"));
	      patientprint.click();
	        	 
	      //Delete Patient
	      
	      WebElement deletepatient = driver.findElement(By.xpath("(//td[contains(@class,'delete-control fileDeleteBtn')])[1]"));
	      deletepatient.click();
	      WebElement deletepopup = driver.findElement(By.xpath("//button[normalize-space()='cancel']"));
	      deletepopup.click();
	  }}
