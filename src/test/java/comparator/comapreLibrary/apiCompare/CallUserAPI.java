package comparator.comapreLibrary.apiCompare;


import com.jayway.restassured.response.Response;
import comparator.comapreLibrary.utils.framework.RestUtil;

public class CallUserAPI {
	
	 public Response callUserAPIFunction(String path) {
		 Response userAPIResponse;
		 userAPIResponse = RestUtil.callGet(path);
         return userAPIResponse;	 
	 }

}
