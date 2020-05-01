package flightconfirm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import actions.Actions;

public class FlightConfirm {
	public static By logout=By.xpath("//img[@src='/images/forms/Logout.gif']");
	


@Test()
public void confirm()
{
	Actions.Click(logout);
}
}

