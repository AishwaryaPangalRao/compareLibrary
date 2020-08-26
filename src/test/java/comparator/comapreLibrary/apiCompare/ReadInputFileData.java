package comparator.comapreLibrary.apiCompare;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadInputFileData {

	public List<String> getFileData(String path) throws IOException {
		
		List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
		return lines;
			
	}

}
