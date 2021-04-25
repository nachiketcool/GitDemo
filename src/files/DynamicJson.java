package files;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;

import java.io.IOException;



public class DynamicJson {

	@Test(dataProvider ="Booksdata")
	public void addBook(String isbn, String aisle) 
	
	{
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().log().all().header("Content-Type","application/json")
		.body(payload.Addbook(isbn,aisle))
	 	.when().post("/Library/Addbook.php")
		.then().log().all().statusCode(200)
		.extract().response().asString();  // this is asString() and not toString() **

		    JsonPath js = ReUseableMethods.rawToJson(response);
		 	
         String id = js.get("ID");
         System.out.println("ID is : " +id+ " in the fetched response");
         System.out.println("ID is : " +id );
         
	
	}
	
	@DataProvider(name = "Booksdata")
	public Object[][] getdata()
	
	{
		return new Object[][] {{"jhadgj","88822"},{"sfj","24724"},{"adaud","99234"}};

		
	}
	
	
}
