package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Props {

	public static String getConfigData(String value)throws FileNotFoundException{

		String path = "src/main/resources/prop/message.properties";
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(path);
		String key = "";
		try {
			prop.load(file);
			key = prop.getProperty(value);
		} catch(IOException e) {
			e.printStackTrace();
		}
		return key;
	}

}



