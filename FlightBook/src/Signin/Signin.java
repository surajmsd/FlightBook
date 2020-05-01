package Signin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import actions.Actions;
import launchdriver.LaunchDriver;

public class Signin extends LaunchDriver {
	

	public static By signin=By.xpath("//a[text()= ' sign-in ']");
	public static By password=By.xpath("//input[@name='password']");
	public static By submit=By.xpath("//input[@name='login']");
	public static By username=By.xpath("//input[@name='userName']");
	
	
	@Test()
	public void signin_01() throws IOException
	{
		FileReader reader=new FileReader(System.getProperty("user.dir")+"/Properties/Data.properties");
		Properties prop=new Properties();
		prop.load(reader);
		  Actions.Wait(2000);
		Actions.Click(signin);  
      Actions.SendKeys(username,prop.getProperty("username"));
      Actions.SendKeys(password,prop.getProperty("password"));
      Actions.Click(submit);
    
	}
	@Test(enabled=false)
	public void signin_02() throws IOException
	{
		 FileReader reader=new FileReader(System.getProperty("user.dir")+"/Properties/Data.properties");
		Properties prop=new Properties();
		prop.load(reader);
		  Actions.Wait(2000);
		Actions.Click(signin);  
      Actions.SendKeys(username,prop.getProperty("username2"));
      Actions.SendKeys(password,prop.getProperty("password2"));
      Actions.Click(submit);
	
	
	

}
	@Test(enabled=false)
	public void signin_03() throws IOException
	{
		 FileReader reader=new FileReader(System.getProperty("user.dir")+"/Properties/Data1.properties");
		Properties prop=new Properties();
		prop.load(reader);
		  Actions.Wait(2000);
		Actions.Click(signin);  
      Actions.SendKeys(username,prop.getProperty("username1"));
      Actions.SendKeys(password,prop.getProperty("password1"));
      Actions.Click(submit);
	}
}
