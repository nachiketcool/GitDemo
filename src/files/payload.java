package files;

public class payload {

	public static String Addbook(String isbn, String aisle)
	
	{
//		String payload =  "{\"name\" : \"Learn Appium Automation with Java\", \"isbn\" : \"bcd\", \"aisle\" : \"872384\", \"author\" : \"John foe\"}";
//		return payload;

	return "{\r\n"
	+ "\r\n"
	+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
	+ "\"isbn\":\""+isbn+"\",\r\n"
	+ "\"aisle\":\""+aisle+"\",\r\n"
	+ "\"author\":\"John foe\"\r\n" +
	"}\r\n" +
	"\r\n"	+
	"";
	}
	
} 



