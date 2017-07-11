package com.cml.dubbo.server.impl;

import java.util.concurrent.TimeUnit;

import com.cml.dubbo.server.Provider;

public class ProviderImpl implements Provider {

	public String build(String name) throws Exception {
		System.out.println("server build:" + name);
//		TimeUnit.SECONDS.sleep(30);
		return name + ".server";
	}

}
