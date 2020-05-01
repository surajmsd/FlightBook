package PageObjects;

import java.util.Properties;

import Signin.Signin;
import bookflight.BookFlight;
import flightconfirm.FlightConfirm;
import flightfinder.FlightFinder;
import registration.Registration;
import selectflight.SelectFlight;

public class PageFactory {
	public static Signin sign=new Signin();
	public static Registration registration=new Registration();
	public static FlightFinder flightfinder=new FlightFinder();
	public static SelectFlight selectflight=new SelectFlight();
	public static BookFlight bookflight=new BookFlight();
	public static FlightConfirm confirm=new FlightConfirm();
	public static Properties logintestdata=new Properties();
	
	

}
