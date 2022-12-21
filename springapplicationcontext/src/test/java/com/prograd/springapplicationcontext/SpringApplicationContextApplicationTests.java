package com.prograd.springapplicationcontext;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringApplicationContextApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testWhetherApplicationContextHasBeans(){
		//SpringApplicationContextApplication application = new SpringApplicationContextApplication();
		SpringApplicationContextApplication.main(new String[] {});
		Assertions.assertTrue(SpringApplicationContextApplication.isBeanPresent(
				SpringApplicationContextApplication.applicationContext.getBeanDefinitionNames(),
				"springApplicationContextApplication"));
	}

}
