package launchdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import PageObjects.PageFactory;
import globalvariable.Globalvariable;

public class LaunchDriver {
	public static WebDriver driver=null;
	public Properties prop;
	
     
	@BeforeSuite
	@Parameters({"browser","FlightbookURL"})
	public void Login(String browser,String FlightbookURL) throws IOException
	{
	
		Globalvariable.flightbookurl=FlightbookURL;
		if(driver==null)
		{
	
		switch(browser)
		{
		case "chrome":launchchrome();
		     break;
		
		case "firefox"://code for firefox
		     break;
		     
		default:launchchrome();
		       break; 
	}
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(,TimeUnit.SECONDS);
		
		
	
     
     
	


}
	}
	public void launchchrome() throws IOException
	{
		FileInputStream reader=new FileInputStream(System.getProperty("user.dir")+"/Properties/Data.properties");
		Properties prop=new Properties();
		prop.load(reader);
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(prop.getProperty("URL"));
	}

	public static WebDriver getdriver()
	{
		return driver;
	}
}


	
	
