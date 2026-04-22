package com.telusko.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.model.Alien;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaunchJackson {
    public static void main(String[] args) throws JsonProcessingException {
        Alien alien = new Alien( 1 , "Rohit" , "Begluru");
        Alien alien1 = new Alien( 2 , "Rohit" , "Begluru");
        Alien alien2 = new Alien( 3 , "Rohit" , "Begluru");
        List<Alien> aliens = Arrays.asList(alien , alien1 , alien2);


        ObjectMapper mapper = new ObjectMapper();
      String json =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(aliens);
        System.out.println(json);
    }
}
