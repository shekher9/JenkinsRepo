package com.jenkins.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static Logger loger= LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@PostConstruct
	public void init(){
		loger.info("Application Got Started.......");
	}

	public static void main(String[] args) {
		loger.info("Application Main method got Started........");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
