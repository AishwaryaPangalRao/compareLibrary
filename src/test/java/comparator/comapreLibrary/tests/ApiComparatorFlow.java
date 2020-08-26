package comparator.comapreLibrary.tests;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import comparator.comapreLibrary.apiCompare.ComparatorLogicWithThread;
import comparator.comapreLibrary.apiCompare.ReadInputFileData;
import comparator.comapreLibrary.commons.framework.*;


public class ApiComparatorFlow {
  
  @Test
  public void comapreFlow() throws IOException, InterruptedException {
	  
	  String filePath1=Constants.TESTDATA_PATH+"File1";
	  String filePath2=Constants.TESTDATA_PATH+"File2";
	  int maxLen=0;
	  ReadInputFileData readData = new ReadInputFileData();
	  List<String> fileData1=readData.getFileData(filePath1);
	  List<String> fileData2=readData.getFileData(filePath2);
	  maxLen = (fileData1.size() > fileData2.size()) ? fileData1.size() : fileData2.size();
	  ComparatorLogicWithThread thread1 = new ComparatorLogicWithThread("thread1", 0, maxLen/2,fileData1, fileData2 );
	  Thread t1 = new Thread(thread1);
	  t1.start();
	  ComparatorLogicWithThread thread2 = new ComparatorLogicWithThread("thread2",maxLen/2, maxLen, fileData1, fileData2 );
	  Thread t2 = new Thread(thread2);
	  t2.start();
	  while(t1.isAlive() || t2.isAlive() ) {
		  ;
	  }

	  
	
	 
  }
}
