package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// we will create reusable method that will
// be reading from configuration.reader file

public class ConfigurationReader {

   //#1 create properties object
   private static Properties properties = new Properties();

   static {
       //#2 - Load the file info FileInputStream
       try {
           FileInputStream file = new FileInputStream("configuration.properties");

       //#3 - load properties object with the file (conf.prop)
       properties.load(file);

       } catch (IOException  e) {
           System.out.println("File not found in Configuration properties.");
       }
   }

}
