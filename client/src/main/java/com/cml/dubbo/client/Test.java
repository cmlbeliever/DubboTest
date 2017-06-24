package com.cml.dubbo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cml.dubbo.server.Provider;

public class Test {
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application.xml" });
		context.start();

		System.out.println("start success!!");
		Provider demoService = (Provider) context.getBean("demoService"); // 获取bean
		System.out.println("====getbean======");
		String message = "";
		try {
			message = demoService.build("2016-10-20");
			System.out.println(" the message from server is:" + message);
			message = demoService.build("2016-10-20");
			System.out.println(" the message from server is:" + message);
			message = demoService.build("2016-10-20");
			System.out.println(" the message from server is:" + message);
			message = demoService.build("2016-10-20");
			System.out.println(" the message from server is:" + message);
			message = demoService.build("2016-10-20");
			System.out.println(" the message from server is:" + message);
			message = demoService.build("2016-10-20");
			System.out.println(" the message from server is:" + message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}