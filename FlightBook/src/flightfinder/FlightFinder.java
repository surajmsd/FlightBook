package flightfinder;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import actions.Actions;
import launchdriver.LaunchDriver;

public class FlightFinder extends LaunchDriver {
	public static By Type=By.xpath("//input[@value='roundtrip']");
	public static By passengers=By.xpath("//select[@name='passCount']");
	public static By Departingfrom=By.xpath("//select[@name='passCount']");
	public static By Departingmonth=By.xpath("//select[@name='fromMonth']");
	public static By Departingday=By.xpath("//select[@name='fromDay']");
	public static By Arrivingi=By.xpath("//select[@name='toPort']");
	public static By returningmonth=By.xpath("//select[@name='toMonth']");
	public static By returningday=By.xpath("//select[@name='toDay']");
	public static By serviceclass=By.xpath("//input[@value='Coach']");
	public static By airline=By.xpath("//select[@name='airline']");
	public static By findflight=By.xpath("//input[@name='findFlights']");
	
	@Test()
	public void Flighfinder_01()
	{
	  Actions.Click(Type);
	  Select s=new Select(LaunchDriver.getdriver().findElement(passengers));
	  s.selectByIndex(1);
	  Select s1=new Select(LaunchDriver.getdriver().findElement(Departingfrom));
	  s1.selectByIndex(2);
	  Select s2=new Select(LaunchDriver.getdriver().findElement(Departingmonth));
	  s1.selectByIndex(2);
	  Select s3=new Select(LaunchDriver.getdriver().findElement(Departingday));
	  s3.selectByIndex(5);
	  Select s4=new Select(LaunchDriver.getdriver().findElement(Arrivingi));
	  s4.selectByIndex(3);
	  Select s5=new Select(LaunchDriver.getdriver().findElement(returningmonth));
	  s5.selectByIndex(6);
	  Select s6=new Select(LaunchDriver.getdriver().findElement(returningday));
	  s6.selectByIndex(4);
	  Actions.Click(serviceclass);
	  Select s7=new Select(LaunchDriver.getdriver().findElement(airline));
	  s7.selectByIndex(1);
	  Actions.Click(findflight);
	  
	  
	  
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}
	@Test(enabled=false)
	public void Flighfinder_02()
	{
	  Actions.Click(Type);
	  Select s=new Select(LaunchDriver.getdriver().findElement(passengers));
	  s.selectByIndex(1);
	  Select s1=new Select(LaunchDriver.getdriver().findElement(Departingfrom));
	  s1.selectByIndex(2);
	  Select s2=new Select(LaunchDriver.getdriver().findElement(Departingmonth));
	  s2.selectByVisibleText("June");
	  Select s3=new Select(LaunchDriver.getdriver().findElement(Departingday));
	  s3.selectByVisibleText("30");
	  Select s4=new Select(LaunchDriver.getdriver().findElement(Arrivingi));
	  s4.selectByIndex(3);
	  Select s5=new Select(LaunchDriver.getdriver().findElement(returningmonth));
	  s5.selectByVisibleText("August");
	  Select s6=new Select(LaunchDriver.getdriver().findElement(returningday));
	  s6.selectByVisibleText("23");
	  Actions.Click(serviceclass);
	  Select s7=new Select(LaunchDriver.getdriver().findElement(airline));
	  s7.selectByIndex(1);
	  Actions.Click(findflight);
	  
	
	

	}

	@Test(enabled=false)
	public void Flighfinder_03()
	{
	 Actions.Click(Type);
	  Select s=new Select(LaunchDriver.getdriver().findElement(passengers));
	  s.selectByIndex(1);
	  Select s1=new Select(LaunchDriver.getdriver().findElement(Departingfrom));
	  s1.selectByIndex(1);
	  Select s2=new Select(LaunchDriver.getdriver().findElement(Departingmonth));
	  s2.selectByVisibleText("April");
	  Select s3=new Select(LaunchDriver.getdriver().findElement(Departingday));
	  s3.selectByVisibleText("20");
	  Select s4=new Select(LaunchDriver.getdriver().findElement(Arrivingi));
	  s4.selectByIndex(2);
	  Select s5=new Select(LaunchDriver.getdriver().findElement(returningmonth));
	  s5.selectByVisibleText("January");
	  Select s6=new Select(LaunchDriver.getdriver().findElement(returningday));
	  s6.selectByVisibleText("18");
	  Actions.Click(serviceclass);
	  Select s7=new Select(LaunchDriver.getdriver().findElement(airline));
	  s7.selectByIndex(1);
	  Actions.Click(findflight);
	}
	@Test(enabled=false)
	public void Flighfinder_04()
	{
	 Actions.Click(Type);
	  Select s=new Select(LaunchDriver.getdriver().findElement(passengers));
	  s.selectByIndex(1);
	  Select s1=new Select(LaunchDriver.getdriver().findElement(Departingfrom));
	  s1.selectByIndex(1);
	  Select s2=new Select(LaunchDriver.getdriver().findElement(Departingmonth));
	  s2.selectByVisibleText("February");
	  Select s3=new Select(LaunchDriver.getdriver().findElement(Departingday));
	  s3.selectByVisibleText("30");
	  Select s4=new Select(LaunchDriver.getdriver().findElement(Arrivingi));
	  s4.selectByIndex(2);
	  Select s5=new Select(LaunchDriver.getdriver().findElement(returningmonth));
	  s5.selectByVisibleText("March");
	  Select s6=new Select(LaunchDriver.getdriver().findElement(returningday));
	  s6.selectByVisibleText("18");
	  Actions.Click(serviceclass);
	  Select s7=new Select(LaunchDriver.getdriver().findElement(airline));
	  s7.selectByIndex(1);
	  Actions.Click(findflight);
	}
	
	
}
	  
	
	
