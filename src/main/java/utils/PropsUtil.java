package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropsUtil {
    public static Properties prop = new Properties();

    public static String getProperty(String key) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/resources/api.properties");
            prop.load(fis);
            System.out.println(prop.getProperty(key));
        } catch (IOException io) {
            System.out.println(io.fillInStackTrace());
        } finally {
            try {
                assert fis != null;
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return prop.getProperty(key);
    }
}
