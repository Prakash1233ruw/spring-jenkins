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
	public  contextLoads() {
		logger.info("text case executing... .....");
		assertEquals(true,true);
	}

}
