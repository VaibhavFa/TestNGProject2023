package PageObjectModel;

import java.security.PublicKey;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	public WebDriver driver;
	
	By FirstName= By.xpath("//input[@name='UserFirstName']");
	By lastName = By.xpath("//input[@name='UserLastName']");
	By WorkEmail = By.xpath("//input[@name='UserEmail']");
	By JobTitle = By.xpath("//select[@name='UserTitle']");
	
	public SignUpPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement EnterFirstName() {
		return driver.findElement(FirstName);	
	}
	
	public WebElement EnterLastName() {
		return driver.findElement(lastName);
		
	}
	
	public WebElement EnterWorkEmail() {
		return driver.findElement(WorkEmail);		
	}
	
	public WebElement SelectJobTitle() {
		return driver.findElement(JobTitle);
		
	}


}
