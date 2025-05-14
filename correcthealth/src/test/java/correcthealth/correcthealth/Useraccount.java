package correcthealth.correcthealth;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Useraccount {
	
	WebDriver driver = new ChromeDriver();
	  @Test
	  public void f() throws InterruptedException {
		
	 	 driver.get("http://localhost:8090/CHCP/login");
	 	driver.manage().window().maximize();
	 	
	 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
	 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	 	rememberme.click();
	 	driver.findElement(By.id("btn-login")).click();
	 	driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
	 	driver.findElement(By.xpath("//a[normalize-space()='User Accounts']")).click();
	 	
	 	//search user name
	 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement userNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
        userNameField.click();
        userNameField.sendKeys("Test Anbu");
        WebElement searchclick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='newSearch']")));
        searchclick.click();
        WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='clearSearch']")));
        clear.click();
        //select department 
        WebElement dropdown = driver.findElement(By.id("departmentId"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Education");
        searchclick.click();
       clear.click();
      //select jobtitle
        WebElement dropdownjobid = driver.findElement(By.id("jobId"));
        Select select1 = new Select(dropdownjobid);
        select1.selectByVisibleText("System Administrator");
        searchclick.click();
        clear.click();
        //Search usertype
        WebElement dropdownuser = driver.findElement(By.id("usertypeId"));
        Select select2 = new Select(dropdownuser);
        select2.selectByVisibleText("IT Support");
        searchclick.click();
        clear.click();
      //Select status
        WebElement dropdownstatus = driver.findElement(By.id("status"));
        Select select3 = new Select(dropdownstatus);
        select3.selectByVisibleText("Active");
        searchclick.click();
       clear.click();
       //Move to nextpage
       WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='summaryTable_next']")));
       nextpage.click();
       //page navigation
       WebElement pagenavigation = driver.findElement(By.name("summaryTable_length"));
       Select select4 = new Select(pagenavigation);
       select4.selectByVisibleText("30");
       //Edit 1st data
       WebElement edit1stdata = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_449']//td[contains(@class,'edit-control')]")));
       edit1stdata.click();
       WebElement editname =driver.findElement(By.xpath("//input[@id='lastName']"));
       editname.clear();
       editname.sendKeys("test2");
       WebElement readonly= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='readOnly_1']")));
       readonly.click();
       
     WebElement save= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save']")));
        save.click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement messageElement = wait1.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-success fade in']")));  // Replace with actual ID or selector of the message
        String displayedMessage = messageElement.getText();
        System.out.println("Captured message: " + displayedMessage);
        WebElement backbutton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-4 col-sm-4 col-xs-12 text-left']//img[@class='img-responsive goSummary']")));
        backbutton.click();
       
        //delete user 
        WebElement deleteuser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[contains(@class,'delete-control fileDeleteBtn')])[21]")));
        deleteuser.click();
        WebElement alertmessage = wait1.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Do you want to delete the User ?')]")));  // Replace with actual ID or selector of the message
        String alertmessage1 = alertmessage.getText();
        System.out.println("Captured message: " + alertmessage1);
        WebElement dismiss = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='cancel'])")));
        dismiss.click();
        deleteuser.click();
        WebElement delete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='confirm']")));
        delete.click();
	  }
        //Create new User
        @Test(enabled = false)
        public void createuser() throws InterruptedException {
        	driver.get("http://localhost:8090/CHCP/login");
    	 	driver.manage().window().maximize();
    	 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
    	 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
    	 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
    	 	rememberme.click();
    	 	driver.findElement(By.id("btn-login")).click();
    	 	driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
    	 	driver.findElement(By.xpath("//a[normalize-space()='User Accounts']")).click();
    	 	
    	 
    	 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement createnewuser= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newAdminAcc")));
        createnewuser.click();
        driver.findElement(By.id("firstName")).sendKeys("Test");
        driver.findElement(By.id("lastName")).sendKeys("Userone");
        WebElement dropdowndepartment=driver.findElement(By.id("departmentId"));
        Select select1 = new Select(dropdowndepartment);
        select1.selectByVisibleText("Education");
        WebElement dropdownjobid1=driver.findElement(By.id("jobId"));
        Select selectjob = new Select(dropdownjobid1);
        selectjob.selectByVisibleText("Claims Coordinator ");
        Actions act = new Actions(driver);

      //Double click on element
      WebElement ele = driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_facilityID']//option[@value='87'][normalize-space()='Baldwin County Jail (188)']")); 
      act.doubleClick(ele).perform();
      driver.findElement(By.id("email")).sendKeys("AkilanTest1911@gmail.com");
      driver.findElement(By.id("mobile")).sendKeys("1234569880");
     // WebElement phone= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@id,'phone')]")));
     // phone.sendKeys("9342893541"); 
      driver.findElement(By.xpath("//button[normalize-space()='Send Credentials Email']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("(//button[normalize-space()='ok'])[1]")).click();
      WebElement editall= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='allPermissionEditAndSave']")));
      editall.click();
      WebElement delete1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='delete_0']")));
      delete1.click();
      WebElement downloadall= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='allPermissionDownload']")));
      downloadall.click();
      Thread.sleep(2000);
      WebElement SAVEUSER= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save']")));
      SAVEUSER.click();
      Thread.sleep(2000);
      WebElement backUSER= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='img-responsive goSummary'])[1]")));
      backUSER.click();
	
        }
      //Edit new User
        @Test(enabled = false)
        public void Edituser() throws InterruptedException {
        	driver.get("http://localhost:8090/CHCP/login");
    	 	driver.manage().window().maximize();
    	 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
    	 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
    	 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
    	 	rememberme.click();
    	 	driver.findElement(By.id("btn-login")).click();
    	 	driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
    	 	driver.findElement(By.xpath("//a[normalize-space()='User Accounts']")).click();
    	 	
    	 
    	 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
    	 	WebElement edituser= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[@class=' edit-control'])[1]")));
    	 	edituser.click();
    	 	
    	 	 WebElement fileInput = driver.findElement(By.id("file"));

    	        // Provide the file path
    	        String filePath = "C:\\Users\\panini019\\Pictures\\Screenshots\\2nd Bug.png";
    	        fileInput.sendKeys(filePath);
    	        Thread.sleep(2000);
    	        WebElement SAVEUSER= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save']")));
    	        SAVEUSER.click();
    	        Thread.sleep(2000);
    	        WebElement backUSER= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='img-responsive goSummary'])[1]")));
    	        backUSER.click();
    	        
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
}
}
