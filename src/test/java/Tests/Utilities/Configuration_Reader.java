package Tests.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//We will create re-usable method will be reading from
//configuration.reader file
public class Configuration_Reader {
   private static Properties properties=new Properties();
   static{
      //Load the file into FileInputStream
      try {
         FileInputStream file= new FileInputStream("configuration.properties");
         //Load preperties object with the file(Configuration.properties)
         properties.load(file);
         //file close
         file.close();
      } catch (IOException e) {
         System.out.println("File not found in Configuration Properties");
      }

   }
   //Use the above created logic to create a reusable static method
   public static String getProperty(String keyword){
      return properties.getProperty(keyword);
   }

}
