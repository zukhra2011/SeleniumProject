package Tests.Day9.Properties_Browser_Util;

import Tests.Utilities.Configuration_Reader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reading_Properties {
    @Test
    public void reading_from_properties_file() throws IOException {
        //Create object of Properties class (Coming from Java Library)
        Properties properties= new Properties();
        //Open the file using FileInputStream
        //We are trying to open a file, so we need to pass the path.
        FileInputStream file=new FileInputStream("configuration.properties");
        //load the properties into our file
        properties.load(file);
        //reading from configuration.properties
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));

    }


    @Test
    public void using_properties_method(){

        System.out.println("Configuration_Reader.getProperty(\"browser\") = " + Configuration_Reader.getProperty("browser"));
        System.out.println("Configuration_Reader.getProperty(\"env\") = " + Configuration_Reader.getProperty("env"));

    }
}
