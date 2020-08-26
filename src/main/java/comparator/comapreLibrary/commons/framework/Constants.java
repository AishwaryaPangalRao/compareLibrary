package comparator.comapreLibrary.commons.framework;

public class Constants {
	
	public static final String TEST_RESOURCE_DIR = new StringBuilder(System.getProperty("user.dir"))
            .append(System.getProperty("file.separator"))
            .append("src").append(System.getProperty("file.separator"))
            .append("test").append(System.getProperty("file.separator"))
            .append("resources").append(System.getProperty("file.separator"))
            .toString();
	
	public static final String TESTDATA_PATH = new StringBuilder(TEST_RESOURCE_DIR)
			.append(System.getProperty("file.separator")).append("testdata").append(System.getProperty("file.separator"))
			.toString();
	
	public static final String PROTOCOL_APP_JSON = "application/json";

	public static final int STATUS_CODE_200 = 200;

}
