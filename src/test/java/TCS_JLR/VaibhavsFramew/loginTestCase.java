package TCS_JLR.VaibhavsFramew;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;

public class loginTestCase extends BaseClass {
	
	
	@Test (dataProvider = "testData")
	public void LaunchURL(String username, String Password) throws IOException, InterruptedException {
	
	LoginPageObject obj= new LoginPageObject(driver);
    obj.enterUsername().sendKeys("username");
    obj.enterPassword().sendKeys("Password");
	obj.clickLogin().click();
	Thread.sleep(2000);
	
	WebElement a =obj.showErrorTextCaptur();
	String actualText= a.getText();

	String ExpectedText= "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	
	Assert.assertEquals(actualText, ExpectedText);
	}
	
	@DataProvider
	public Object [] [] testData (){
		Object [] [] data = new Object[2][2];
		data [0][0]="test1";
		data [0][1]="test2";
		data [1][0]="test3";
		data [1][1]="test4";
		
		
		return data;
	}
	
	
	
	

}
