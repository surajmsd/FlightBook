package registration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import actions.Actions;
import launchdriver.LaunchDriver;

public class Registration extends LaunchDriver {
	
	public static By register=By.xpath("//a[text()='REGISTER']");
	public static By Firstname=By.xpath("//input[@name='firstName']");
	public static By lastname=By.xpath("//input[@name='lastName']");
	public static By phone=By.xpath("//input[@name='phone']");
	public static By Email=By.xpath("//input[@id='userName']");
	public static By address=By.xpath("//input[@name='address1']");
	public static By city=By.xpath("//input[@name='city']");
	public static By state=By.xpath("//input[@name='state']");
	public static By postalcode=By.xpath("//input[@name='postalCode']");
	public static By selectcountry=By.xpath("//select[@name='country']");
	public static By username=By.xpath("//input[@id='email']");
	public static By password=By.xpath("//input[@name='password']");
	public static By confirmpassword=By.xpath("//input[@name='confirmPassword']");
	public static By submit=By.xpath("//input[@name='register']");
	
     @Test()
     public void Registration_01() throws IOException
     {
    	 FileInputStream reader=new FileInputStream(System.getProperty("user.dir")+"/Properties/Data.properties");
    	 Properties prop=new Properties();
    	 prop.load(reader);
    	 Actions.Click(register);
    	 Actions.SendKeys(Firstname,prop.getProperty("firstname"));
    	 Actions.SendKeys(lastname,prop.getProperty("lastname"));
    	 Actions.SendKeys(phone,prop.getProperty("phone"));
    	 Actions.SendKeys(Email,prop.getProperty("email"));
    	 Actions.SendKeys(address,prop.getProperty("address"));
    	 Actions.SendKeys(city,prop.getProperty("city"));
    	 Actions.SendKeys(state,prop.getProperty("state"));
    	 Actions.SendKeys(postalcode,prop.getProperty("postalcode"));
    	 Select s=new Select(LaunchDriver.getdriver().findElement(selectcountry));
    	 s.selectByIndex(10);
    	 Actions.SendKeys(username,prop.getProperty("username"));
    	 Actions.SendKeys(password,prop.getProperty("password"));
    	 Actions.SendKeys(confirmpassword,prop.getProperty("confirmpassword"));
    	 Actions.Click(submit);
    	 
    	
     }
     @Test(enabled=false)
     public void Registration_02() throws IOException
     {
    	 FileReader reader=new FileReader(System.getProperty("user.dir")+"/Properties/Data.properties");
    	 Properties prop=new Properties();
    	 prop.load(reader);
    	 Actions.Click(register);
    	 Actions.SendKeys(Firstname,prop.getProperty("firstname2"));
    	 Actions.SendKeys(lastname,prop.getProperty("lastname2"));
    	 Actions.SendKeys(phone,prop.getProperty("phone2"));
    	 Actions.SendKeys(Email,prop.getProperty("email2"));
    	 Actions.SendKeys(address,prop.getProperty("address2"));
    	 Actions.SendKeys(city,prop.getProperty("city2"));
    	 Actions.SendKeys(state,prop.getProperty("state2"));
    	 Actions.SendKeys(postalcode,prop.getProperty("postalcode2"));
    	 Select s=new Select(LaunchDriver.getdriver().findElement(selectcountry));
    	 s.selectByIndex(3);
    	 Actions.SendKeys(username,prop.getProperty("username2"));
    	 Actions.SendKeys(password,prop.getProperty("password2"));
    	 Actions.SendKeys(confirmpassword,prop.getProperty("confirmpassword2"));
    	 Actions.Click(submit);
    	 
    	 
    	 
    	 
     }
     @Test(enabled=false)
     public void Registration_03() throws IOException
     {
    	 FileInputStream reader=new FileInputStream(System.getProperty("user.dir")+"/Properties/Data1.properties");
    	 Properties prop=new Properties();
    	 prop.load(reader);
    	 Actions.Click(register);
    	 Actions.SendKeys(Firstname,prop.getProperty("firstname"));
    	 Actions.SendKeys(lastname,prop.getProperty("lastname"));
    	 Actions.SendKeys(phone,prop.getProperty("phone"));
    	 Actions.SendKeys(Email,prop.getProperty("email"));
    	 Actions.SendKeys(address,prop.getProperty("address"));
    	 Actions.SendKeys(city,prop.getProperty("city"));
    	 Actions.SendKeys(state,prop.getProperty("state"));
    	 Actions.SendKeys(postalcode,prop.getProperty("postalcode"));
    	 Select s=new Select(LaunchDriver.getdriver().findElement(selectcountry));
    	 s.selectByIndex(3);
    	 Actions.SendKeys(username,prop.getProperty("username"));
    	 Actions.SendKeys(password,prop.getProperty("password"));
    	 Actions.SendKeys(confirmpassword,prop.getProperty("confirmpassword"));
    	 Actions.Click(submit);
    	 
    	 
     }
     @Test(enabled=false)
     public void Registration_04() throws IOException
     {
    	 FileReader reader=new FileReader(System.getProperty("user.dir")+"/Properties/Data1.properties");
    	 Properties prop=new Properties();
    	 prop.load(reader);
    	 Actions.Click(register);
    	 Actions.SendKeys(Firstname,prop.getProperty("firstname1"));
    	 Actions.SendKeys(lastname,prop.getProperty("lastname1"));
    	 Actions.SendKeys(phone,prop.getProperty("phone1"));
    	 Actions.SendKeys(Email,prop.getProperty("email1"));
    	 Actions.SendKeys(address,prop.getProperty("address1"));
    	 Actions.SendKeys(city,prop.getProperty("city1"));
    	 Actions.SendKeys(state,prop.getProperty("state1"));
    	 Actions.SendKeys(postalcode,prop.getProperty("postalcode1"));
    	 Select s=new Select(LaunchDriver.getdriver().findElement(selectcountry));
    	 s.selectByIndex(2);
    	 Actions.SendKeys(username,prop.getProperty("username1"));
    	 Actions.SendKeys(password,prop.getProperty("password1"));
    	 Actions.SendKeys(confirmpassword,prop.getProperty("confirmpassword1"));
    	 Actions.Click(submit);
    	 
     
     
}
}
