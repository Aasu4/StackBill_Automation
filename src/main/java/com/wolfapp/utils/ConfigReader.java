package com.wolfapp.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    // Load properties file
    public static void loadProperties() {
        properties = new Properties();
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");
            properties.load(file);
            
           
            
        } catch (IOException e) {
            System.out.println("Could not read config file: " + e.getMessage());
        }
    }

    public static void setBrowserName(String browserName) throws IOException {
    	String fileOut="src/test/resources/config.properties";
        // Update the property file with the opposite browser for next run
        properties.setProperty("browser", browserName);

        FileOutputStream fos = new FileOutputStream(fileOut);
       properties .store(fos, "Browser value toggled to " + browserName);
    }
    
    // Get property value by key
    public static String getProperty(String key) {
        if (properties == null) {
            loadProperties();
        }
        return properties.getProperty(key);
    }
}
