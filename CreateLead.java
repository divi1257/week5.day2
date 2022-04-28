package Dataprovider;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends Baseclass {
	 
	
		@Test(dataProvider = "getData")
			public  void runCreateLead(String cname,String fname, String lname, String pnum) throws InterruptedException {
			
				
			    driver.findElement(By.className("decorativeSubmit")).click();
			    driver.findElement(By.linkText("CRM/SFA")).click();
			    driver.findElement(By.linkText("Leads")).click();
			    driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
				driver.findElement(By.name("submitButton")).click();
				
		}
				@DataProvider(name="getData")
				public String[][] sendData(){
					   String[][] data = new String[2][4];
					   data[0][0] = "TL";
					   data[0][1] ="Divya";
				       data[0][2]	="Arunachalam"  ;
				       data[0][3] = "5463";
				       data[1][0]="TL";
					   data[1][1]="ad";
				       data[1][2]="Arunachalam"  ;
				       data[1][3]= "4687";
				     
				       return data;
		}
}
