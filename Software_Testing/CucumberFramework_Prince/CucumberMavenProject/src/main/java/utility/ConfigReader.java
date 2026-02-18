package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties prop;

    public static void loadConfig() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
        prop = new Properties();
        prop.load(fis);
    }

    public static String getBaseUrl() {
        String env = System.getProperty("env",prop.getProperty("env"));
        return prop.getProperty(env+".url");
    }



}
