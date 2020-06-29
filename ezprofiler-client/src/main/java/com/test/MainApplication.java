package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages="com.test")
@SpringBootApplication
public class MainApplication {
	
    public static void main(String[] args) throws Exception {
       	SpringApplication.run(MainApplication.class, args);
    }
   
}