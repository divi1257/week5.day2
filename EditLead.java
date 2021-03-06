package Dataprovider;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends Baseclass  {
	
	@Test(dataProvider="EditLead")
	public void editLead(String phoneNum,String company) throws InterruptedException {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
		
		driver.findElement(By.name("submitButton")).click();
	}	
	    @DataProvider(name="EditLead")
		public String[][] fetchData() throws IOException {
		return ReadExcelData.readData();
	}
	
	}


