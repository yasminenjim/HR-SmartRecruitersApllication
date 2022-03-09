package com.alightmea.meeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.alightmea.meeting.controller", "com.alightmea.meeting.repository", "com.alightmea.meeting.entities", "com.alightmea.meeting.services"})
public class MeetingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetingApplication.class, args);
    }

}
