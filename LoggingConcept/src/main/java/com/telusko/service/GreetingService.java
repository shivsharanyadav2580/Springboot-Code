package com.telusko.service;

import com.telusko.rest.GreetingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class GreetingService implements IgrretingService {
    private static final Logger log = LoggerFactory.getLogger(GreetingService.class);

    @Override
    public String generateWishes() {
        log.trace("In service class trace method ");
        log.debug(
                "Log message in service method "
        );



        LocalDateTime now = LocalDateTime.now();

        int hour = now.getHour();

        if (hour < 12) {
            return "Good Morning";
        }
        else if (hour < 16) {
            return "Good Afternoon";
        }
        else if (hour < 20) {
            return "Good Evening";
        }
        else {
            return "Good Night";
        }
    }
}