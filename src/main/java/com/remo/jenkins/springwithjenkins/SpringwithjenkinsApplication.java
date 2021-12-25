package com.remo.jenkins.springwithjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringwithjenkinsApplication {

	public static Logger logger= LoggerFactory.getLogger(SpringwithjenkinsApplication.class);

	@PostConstruct
	public  void intt() {
		logger.info("Application started...");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringwithjenkinsApplication.class, args);
		logger.info("Application started...");
	}

}
