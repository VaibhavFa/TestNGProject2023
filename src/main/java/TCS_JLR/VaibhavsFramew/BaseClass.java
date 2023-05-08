package TCS_JLR.VaibhavsFramew;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop; 
		
	
	public WebDriver driverInitialization() throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\vaibh\\eclipse\\VaibhavsFramew\\src\\main\\java\\Data.properties");
		prop = new Properties();
		prop.load(fis);
		String browserName =prop.getProperty("browser");
		/*
		
		ChromeOptions op= new ChromeOptions ();
		op.addArguments ("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(op);*/
		
		if(browserName.contentEquals("chrome")) {
			 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\eclipse\\VaibhavsFramew\\ChromeDriverPath\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
		     ChromeOptions options = new ChromeOptions();
		     options.addArguments("--remote-allow-origins=*");
		     driver = new ChromeDriver(options);
		
		}
		else if (browserName.contentEquals("firfox")) {
			
		}
		return driver;
		
	}
	@BeforeMethod
	public void LaunchDriver() throws IOException {
		
		driver =driverInitialization();
		driver.get(prop.getProperty("URL"));
	}
	
	@AfterMethod
	
	public void closeBrowser () {
		driver.close();
	}
	
     
}
