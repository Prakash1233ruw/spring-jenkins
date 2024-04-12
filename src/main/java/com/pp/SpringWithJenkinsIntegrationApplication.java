package com.pp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWithJenkinsIntegrationApplication {
public static Logger logger=LoggerFactory.getLogger(SpringWithJenkinsIntegrationApplication.class);
	
	public void init() {
		logger.info("application started .....");
	}
	public static void main(String[] args) {
		logger.info("application executed .....");
		SpringApplication.run(SpringWithJenkinsIntegrationApplication.class, args);
	}

}
