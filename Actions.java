package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import launchdriver.LaunchDriver;

public class Actions {
	
	public static void Click(By loc)
	{
		LaunchDriver.getdriver().findElement(loc).click();
	}
	public static void SendKeys(By loc,String value)
	{
		LaunchDriver.getdriver().findElement(loc).sendKeys(value);
	}
	public static void Wait(long waitingtime)
	{
		try {
			Thread.sleep(waitingtime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Explicitwait(By loc,long value)
	{
		WebDriverWait w=new WebDriverWait(LaunchDriver.getdriver(),value);
		w.until(ExpectedConditions.alertIsPresent());
	}
	public static String gettext(By loc,String value)
	{
		return LaunchDriver.getdriver().findElement(loc).getText().toString();
	}
	public static void clear(By loc)
	{
		LaunchDriver.getdriver().findElement(loc).clear();
	}
	

}
