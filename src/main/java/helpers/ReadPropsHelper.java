package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropsHelper {

    /**
     * <p>Current methods reads property file and returns the value that matches the provided key.</p>
     * <p>Properties file is selected by provided absolute path in the methods' <b>propLocation</b> parameter</p>
     * <p>The key of the search attribute should be provided in the methods' <b>key</b> parameter</p>
      * @param propLocation absolute path to the properties file
     * @param key value of the search attribute key
     * @return the property value in the <b>String</b> format
     */
    public String getPropertyByKey(String propLocation,String key){
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(propLocation));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String propertyData = properties.getProperty(key);
        return propertyData;
    }
}
