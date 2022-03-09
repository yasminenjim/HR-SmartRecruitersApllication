package com.alightmea.userms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScans({ @ComponentScan("com.alightmea.userms.controller")})
//@EnableJpaRepositories("com.alightmea.userms.repository")
//@EntityScan("com.alightmea.userms.entities")
@ComponentScan({"com.alightmea.userms.controller", "com.alightmea.userms.repository", "com.alightmea.userms.entities", "com.alightmea.userms.services"})
public class UserMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMsApplication.class, args);
    }

}
