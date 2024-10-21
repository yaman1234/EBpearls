package variables;

import utilities.DateOperations;

public class Var {

//	VARIABLES
	public static final String baseurl = "https://parabank.parasoft.com/parabank/index.htm";
	
	
//	REGISTER VARIABLES
	public static String firstName = "John";
	public static String lastName = "Wick";
	public static String address = "adress";
	public static String city = "City";
	public static String state = "State";
	public static String zipCode = "40000000";
	public static String phoneNumber = "123456789";
	public static String ssn = "123456";
	public static String username = "John" + DateOperations.getCurrentTimestamp();
	public static String password = "123";
}
