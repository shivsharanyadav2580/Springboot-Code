package com.shivsharan.util;

import java.util.UUID;

public class Idgenerator {
    public static String generateId(){
        return UUID.randomUUID().toString().replace("-" ,"" ).substring(0,10);
    }
}
