package files;

import io.restassured.path.json.JsonPath;

public class ReUseableMethods {
//  
//	 public static String rawToJson(String getPlaceResponse)
//	 
//	 {
//		 JsonPath js1 = new JsonPath(getPlaceResponse);
//		 String actualaddress = js1.getString("address");
//		 return actualaddress;
//	 }
//	 
	
	 public static JsonPath rawToJson(String getPlaceResponse)
	 {
		 System.out.println("this is first comment");
			System.out.println("this is second comment");
			System.out.println("this is thirs comment");
			System.out.println("this is thirs comment");
			System.out.println("this is from new develop");
			System.out.println("this is 2nd comment new develop");
			System.out.println("this is new check in by American guy");
		 JsonPath js1 = new JsonPath(getPlaceResponse);
		 return js1;
	 }
	
}


