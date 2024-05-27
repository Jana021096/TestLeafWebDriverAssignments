package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookAssignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch ChromeDriver
        ChromeDriver driver=new ChromeDriver();
        
        //load url
        driver.get("https://en-gb.facebook.com/");
        
        //maximize browser window
        driver.manage().window().maximize();
        
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElement(By.linkText("Create new account")).click();
        
      //enter user name
        driver.findElement(By.name("reg_email__")).sendKeys("janapriyamohan02@gmail.com");
        
        //enter password
        driver.findElement(By.name("reg_passwd__")).sendKeys("crmsfa");
        
        
        WebElement dob1 = driver.findElement(By.id("day"));
        
        Select sel1=new Select(dob1);
        sel1.selectByIndex(1);
        
        WebElement dob2 = driver.findElement(By.id("month"));
        
        Select sel2=new Select(dob2);
        sel2.selectByVisibleText("Jul");
       
        WebElement dob3 = driver.findElement(By.id("year"));
        
        Select sel3=new Select(dob3);
        sel3.selectByValue("1996");
        
        driver.findElement(By.name("firstname")).sendKeys("janapriya");

        driver.findElement(By.name("lastname")).sendKeys("mohan");

        driver.findElement(By.className("_58mt")).click();

        
        
        
        
        
        

	}

}
