package com.myretail.controller.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.myretail.TargetappApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TargetappApplication.class)
@WebAppConfiguration
public class TargetappApplicationTests {

	@Test
	public void contextLoads() {
	}

}
