package TCS_JLR.VaibhavsFramew;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.SignUpPageObject;

public class SignupTestCase extends BaseClass{
	
	
	@Test
	
	public void fillSignupData() throws IOException, InterruptedException {
		
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		SignUpPageObject obj= new SignUpPageObject(driver);
		obj.EnterFirstName().sendKeys("Vaibhav");
		obj.EnterLastName().sendKeys("Farkadez");
		obj.EnterWorkEmail().sendKeys("Vaibhavfarkade54@gmail.com");
		//Thread.sleep(1000);
		
		Select S =new Select(obj.SelectJobTitle());
		S.selectByIndex(1);
		
		
		
		
		
		
	}
	
	

}
