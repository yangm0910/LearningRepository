package com.example3.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * this is git demo pro
 */
@EnableEurekaServer
@SpringBootApplication
public class DemoApplication {

    /**
     * person do some change
     * @param args sdfsf
     */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
