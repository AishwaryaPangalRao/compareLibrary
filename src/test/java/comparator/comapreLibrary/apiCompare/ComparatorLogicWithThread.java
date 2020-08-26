package comparator.comapreLibrary.apiCompare;

import java.util.List;

import com.jayway.restassured.response.Response;

public class ComparatorLogicWithThread implements Runnable {
	
	private Thread compareThread;
	private String threadName;
	private int start, stop;
	private List<String> fileData1,fileData2;
	private String line1, line2;
	Response response1 = null,response2 = null;
	CallUserAPI callAPI = new CallUserAPI();
	public ComparatorLogicWithThread(String threadNamed, int startLimit, int stopLimit, List<String> file1Data, List<String> file2Data){
		
		threadName=threadNamed;
		start=startLimit;
		stop=stopLimit;
		fileData1=file1Data;
		fileData2=file2Data;
	}
	
	
	 public void run() {
		 
		 for(int i=start; i< stop; i++) {
			  if(i < fileData1.size()) {
				  response1= callAPI.callUserAPIFunction(fileData1.get(i));
				  line1=fileData1.get(i);
			  }else
				  line1=null;
				  
			  if(i < fileData2.size()) {
				  response2= callAPI.callUserAPIFunction(fileData2.get(i));
				  line2=fileData2.get(i);
			  }else
				  line2=null;
				  
			  if(response1!=null && response2!=null && response1.asString().equals(response2.asString()))
				  System.out.println(line1+" equals "+line2);
			  else
				  System.out.println(line1+" not equals "+line2);
			  
			  response1=null;
			  response2=null;
		 } 
	 }
	
	 
	 public void start() {
		
		
	 }
	 

}
