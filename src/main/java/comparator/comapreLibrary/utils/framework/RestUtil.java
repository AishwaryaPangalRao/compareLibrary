package comparator.comapreLibrary.utils.framework;


import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;




public class RestUtil {
	

		 public static Response callGet(String path) {
		        Response response = RestAssured.given().contentType("*/*").accept("*/*").when()
		                                    .get(path);
		        response.then();
		        return response;
		    }

}
