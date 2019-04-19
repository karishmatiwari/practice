package app;

import exceptions.PropertyNotFound;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */

public class App {

    public String getFile(String key) {

        Properties prop = new Properties();
        InputStream input = null;

        String client_analytics = System.getenv(PropertyKeys.CLIENT_ANALYTICS.getKey());
        File file = new File(client_analytics +File.separator +"config.properties");

        try {
            //input = this.getClass().getResourceAsStream("/config.properties");
            input = new FileInputStream(file.getName());

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            String propertyValue = prop.getProperty(key);
            if (propertyValue == null){
                throw new PropertyNotFound("Property not found for :"+key);

            }
            return propertyValue;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "";
    }


    public static void main(String[] args) {
        App app = new App();
        System.out.println("url : "+ app.getFile(PropertyKeys.URL.getKey()));
        System.out.println("url : "+ app.getFile("url"));
        System.out.println("pwd : "+ app.getFile(PropertyKeys.PASSWORD.getKey()));
        System.out.println(System.getProperty("os.name"));
        //System.out.println(System.getProperty("CLASS"));
    }

}
