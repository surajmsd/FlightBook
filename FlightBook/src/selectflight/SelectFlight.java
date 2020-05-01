package selectflight;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import actions.Actions;
import launchdriver.LaunchDriver;

public class SelectFlight extends LaunchDriver {
public static By Depart=By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']");
public static By returns=By.xpath("//input[@value='Blue Skies Airlines$630$270$12:23']");
public static By reserve=By.xpath("//input[@name='reserveFlights']");
public static By Depart1=By.xpath("//input[@value='Pangea Airlines$362$274$9:17']");
public static By return1=By.xpath("//input[@value='Pangea Airlines$632$282$16:37']");
		
@Test
public void Selectflight_01()
{
	Actions.Click(Depart);
	Actions.Click(returns);
	Actions.Click(reserve);
	
}
@Test(enabled=false)
public void Selectflight_02()
{
	Actions.Click(Depart1);
	Actions.Click(return1);
	Actions.Click(reserve);
	
}


}
