package Tests.Day9.Properties_Browser_Util;

import org.testng.annotations.Test;

public class Learning_Properties {

@Test
    public void java_properties_reading_test(){
    System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
    //Prints out os name -Mac OS X
    System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
   // Prints out your username -zukhra khaknazarova
}

}
