package com.telusko.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.model.Alien;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaunchJackson {
    public static void main(String[] args) throws IOException {



        ObjectMapper mapper = new ObjectMapper();

      Alien alien =   mapper.readValue(new File("json/sample") , Alien.class);
        System.out.println(alien);
    }
}
