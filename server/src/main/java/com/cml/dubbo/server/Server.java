package com.cml.dubbo.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application.xml" });
		context.start();

		System.out.println(" app run ");

		System.in.read(); // 按任意键退出
	}
}