package com.pp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringWithJenkinsIntegrationApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(SpringWithJenkinsIntegrationApplicationTests.class);

	@Test
	public void  contextLoads() {
		logger.info("text case executing... .....");
		logger.info("text case second log... .....");
		logger.info("text case third log... .....");
		assertEquals(true,true);
	}

}
