package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webDriverAssignments {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch ChromeDriver
         ChromeDriver driver=new ChromeDriver();
         
         //load url
         driver.get(" http://leaftaps.com/opentaps/.");
         
         //maximize browser window
         driver.manage().window().maximize();
         
		//enter user name
         driver.findElement(By.id("username")).sendKeys("DemosalesManager");
         
         //enter password
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         
         //click login button
         driver.findElement(By.className("decorativeSubmit")).click();
         
         //click on link CRM/SFA
         driver.findElement(By.linkText("CRM/SFA")).click();
         
         //click on Accounts tab
         driver.findElement(By.linkText("Accounts")).click();
         
         //click on create account
         driver.findElement(By.linkText("Create Account")).click();
         
         //enter acct name
         driver.findElement(By.id("accountName")).sendKeys("janapriya");
         
         //enter description
         driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
         
         //select industry
         WebElement dropdown1 = driver.findElement(By.name("industryEnumId"));
         
         Select sel1=new Select(dropdown1);
         sel1.selectByIndex(3);
         
         //select ownership
         WebElement dropdown2 = driver.findElement(By.name("ownershipEnumId"));
         
         Select sel2=new Select(dropdown2);
         sel2.selectByVisibleText("S-Corporation");

         //select source
         WebElement dropdown3 = driver.findElement(By.name("dataSourceId"));
         
         Select sel3=new Select(dropdown3);
         sel3.selectByValue("LEAD_EMPLOYEE");
         
         //select marketing campaign
         WebElement dropdown4 = driver.findElement(By.name("marketingCampaignId"));
         
         Select sel4=new Select(dropdown4);
         sel4.selectByIndex(6);
         
       //select texas
         WebElement dropdown5 = driver.findElement(By.name("generalStateProvinceGeoId"));
         
         Select sel5=new Select(dropdown5);
         sel5.selectByValue("TX");
         
         driver.findElement(By.className("smallSubmit")).click();
         
         Thread.sleep(5000);
         
         //close
         driver.close();

         
        
	}

}
