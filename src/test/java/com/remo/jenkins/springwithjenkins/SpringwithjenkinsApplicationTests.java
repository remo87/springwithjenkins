package com.remo.jenkins.springwithjenkins;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringwithjenkinsApplicationTests {


	public static Logger logger = LoggerFactory.getLogger(SpringwithjenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(1, 1 );
	}

}
