package com.wolfapp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtil {

    public static String generateName(String prefix) {
        
        String pocName = ConfigReader.getProperty("pocName");  // <-- reading from config.properties

        if (pocName == null || pocName.isEmpty()) {
            pocName = "DEFAULTPOC"; // fallback
        }

        pocName = pocName.replace(" ", "-"); // if spaces available

        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

        return prefix + "-" + pocName + "-" + timestamp;
    }
}
