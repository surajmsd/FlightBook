package bookflight;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import actions.Actions;
import launchdriver.LaunchDriver;

public class BookFlight extends LaunchDriver {
	public static By Firstname=By.xpath("//input[@name='passFirst0']");
	public static By lastname=By.xpath("//input[@name='passLast0']");
	public static By meal=By.xpath("//select[@name='pass.0.meal']");
	public static By passenger2fname=By.xpath("//input[@name='passFirst1']");
	public static By passenger2lname=By.xpath("//input[@name='passLast1']");
	public static By passenger2meal=By.xpath("//select[@name='pass.1.meal']");
	public static By passenger3fname=By.xpath("//input[@name='passFirst2']");
	public static By passenger3lname=By.xpath("//input[@name='passLast2']");
	public static By passenger3meal=By.xpath("//select[@name='pass.2.meal']");		
	public static By creditcardtype=By.xpath("//select[@name='creditCard']");
	public static By number=By.xpath("//input[@name='creditnumber']");
	public static By expirationmonth=By.xpath("//select[@name='cc_exp_dt_mn']");
	public static By expirationyear=By.xpath("//select[@name='cc_exp_dt_yr']");
	public static By firstname2=By.xpath("//input[@name='cc_frst_name']");
	public static By middlename=By.xpath("//input[@name='cc_mid_name']");
	public static By lastname2=By.xpath("//input[@name='cc_last_name']");
	public static By address=By.xpath("//input[@name='billAddress1']");
	public static By city=By.xpath("//input[@name='delCity']");
	public static By state=By.xpath("//input[@name='delState']");
	public static By postalcode=By.xpath("//input[@name='delZip']");
	public static By country=By.xpath("//select[@name='delCountry']");
	public static By deladdress=By.xpath("//input[@name='delAddress1']");
	public static By delcity=By.xpath("//input[@name='delCity']");
	public static By state1=By.xpath("//input[@name='delState']");
	public static By delpostal=By.xpath("//input[@name='delZip']");
	public static By delcountry=By.xpath("//select[@name'delCountry']");
	public static By findflight=By.xpath("//input[@name='buyFlights']");

	@Test
	public void Book_flight01() throws IOException
	{
		Properties prop=new Properties();
		 FileReader reader=new FileReader(System.getProperty("user.dir")+"/Properties/Data.properties");
		prop.load(reader);
		Actions.SendKeys(Firstname,prop.getProperty("firstname"));
		Actions.SendKeys(lastname,prop.getProperty("lastname"));
		Select s=new Select(LaunchDriver.getdriver().findElement(meal));
		s.selectByVisibleText("Vegetarian");
		Actions.SendKeys(passenger2fname,prop.getProperty("passenger2fname"));
		Actions.SendKeys(passenger2lname,prop.getProperty("passenger2lname"));
		Select a=new Select(LaunchDriver.getdriver().findElement(passenger2meal));
		a.selectByVisibleText("Hindu");
		Actions.SendKeys(passenger3fname,prop.getProperty("passenger3fname"));
		Actions.SendKeys(passenger3lname,prop.getProperty("passenger3lname"));
		Select a1=new Select(LaunchDriver.getdriver().findElement(passenger3meal));
		a1.selectByVisibleText("Muslim");
		
		Select s1=new Select(LaunchDriver.getdriver().findElement(creditcardtype));
		s1.selectByIndex(1);
		Actions.SendKeys(number,prop.getProperty("creditnumber"));
		Select s2=new Select(LaunchDriver.getdriver().findElement(expirationmonth));
		s2.selectByVisibleText("04");
		Select s3=new Select(LaunchDriver.getdriver().findElement(expirationyear));
		s3.selectByIndex(1);
		Actions.SendKeys(firstname2,prop.getProperty("firstname"));
		Actions.SendKeys(lastname2,prop.getProperty("lastname"));
		
		
		Actions.Click(findflight);
		
		
		
		
		
	
	

}
	@Test(enabled=false)
	public void Book_flight02() throws IOException
	{
		Properties prop=new Properties();
		 FileReader reader=new FileReader(System.getProperty("user.dir")+"/Properties/Data.properties");
		prop.load(reader);
		Actions.SendKeys(Firstname,prop.getProperty("firstname2"));
		Actions.SendKeys(lastname,prop.getProperty("lastname2"));
		Select s=new Select(LaunchDriver.getdriver().findElement(meal));
		s.selectByVisibleText("Diabetic");
		Actions.SendKeys(passenger2fname,prop.getProperty("passengerfname"));
		Actions.SendKeys(passenger2lname,prop.getProperty("passengerlname"));
		Select a=new Select(LaunchDriver.getdriver().findElement(passenger2meal));
		a.selectByVisibleText("Hindu");
		Actions.SendKeys(passenger3fname,prop.getProperty("passenger3fname"));
		Actions.SendKeys(passenger3lname,prop.getProperty("passenger3lname"));
		Select a1=new Select(LaunchDriver.getdriver().findElement(passenger3meal));
		a1.selectByVisibleText("Muslim");
		
		Select s1=new Select(LaunchDriver.getdriver().findElement(creditcardtype));
		s1.selectByIndex(1);
		Actions.SendKeys(number,prop.getProperty("creditnumber"));
		Select s2=new Select(LaunchDriver.getdriver().findElement(expirationmonth));
		s2.selectByVisibleText("04");
		Select s3=new Select(LaunchDriver.getdriver().findElement(expirationyear));
		s3.selectByIndex(1);
		Actions.SendKeys(firstname2,prop.getProperty("firstname"));
		Actions.SendKeys(lastname2,prop.getProperty("lastname"));
		
		
		Actions.Click(findflight);
		
		
}
	@Test(enabled=false)
	public void Book_flight03 () throws IOException
	{
		Properties prop=new Properties();
		 FileReader reader=new FileReader(System.getProperty("user.dir")+"/Properties/Data.properties");
		prop.load(reader);
		Actions.SendKeys(Firstname,prop.getProperty("firstname2"));
		Actions.SendKeys(lastname,prop.getProperty("lastname2"));
		Select s=new Select(LaunchDriver.getdriver().findElement(meal));
		s.selectByVisibleText("Hindu");
		Actions.SendKeys(passenger2fname,prop.getProperty("passengerfname"));
		Actions.SendKeys(passenger2lname,prop.getProperty("passengerlname"));
		Select a=new Select(LaunchDriver.getdriver().findElement(passenger2meal));
		a.selectByVisibleText("Hindu");
		Actions.SendKeys(passenger3fname,prop.getProperty("passenger3fname"));
		Actions.SendKeys(passenger3lname,prop.getProperty("passenger3lname"));
		Select a1=new Select(LaunchDriver.getdriver().findElement(passenger3meal));
		a1.selectByVisibleText("Muslim");
		
		Select s1=new Select(LaunchDriver.getdriver().findElement(creditcardtype));
		s1.selectByIndex(1);
		Actions.SendKeys(number,prop.getProperty("creditnumber"));
		Select s2=new Select(LaunchDriver.getdriver().findElement(expirationmonth));
		s2.selectByVisibleText("January");
		Select s3=new Select(LaunchDriver.getdriver().findElement(expirationyear));
		s3.selectByVisibleText("2000");
		Actions.SendKeys(firstname2,prop.getProperty("firstname"));
		Actions.SendKeys(lastname2,prop.getProperty("lastname"));
		
		
		Actions.Click(findflight);
		
		
}
}
