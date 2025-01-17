package com.springboot.couchbase.springbootrealworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableTransactionManagement
public class SpringBootRealworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRealworldApplication.class, args);
    }

}
