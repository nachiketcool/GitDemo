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
		 JsonPath js1 = new JsonPath(getPlaceResponse);
		 return js1;
	 }
	
}


