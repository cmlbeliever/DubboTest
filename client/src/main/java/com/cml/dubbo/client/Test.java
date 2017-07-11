package com.cml.dubbo.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cml.dubbo.server.Provider;
import com.cml.dubbo.server.annotation.UserService;

public class Test {

	static Logger log = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application.xml" });
		context.start();

		log.info("====================================================");

		log.info("start success!!");
		Provider demoService = (Provider) context.getBean("demoService"); // 获取bean
		UserService userService = context.getBean(UserService.class);
		log.info("====getbean======");
		String message = "";
		try {
			long start = System.currentTimeMillis();
			for (int i = 0; i < 10; i++) {
				message = demoService.build("build for value : " + (i + 1));
				log.info(" the message from server is:" + message + ",spendTime:" + (System.currentTimeMillis() - start) + "ms");
				start = System.currentTimeMillis();
			}
			start = System.currentTimeMillis();
			for (int i = 0; i < 10; i++) {
				message = userService.login("username" + i, "password" + i);
				log.info(" login result:" + message + ",spendTime:" + (System.currentTimeMillis() - start) + "ms");
				start = System.currentTimeMillis();
			}

			context.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}