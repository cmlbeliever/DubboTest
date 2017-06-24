package com.cml.dubbo.server.impl;

import com.cml.dubbo.server.Provider;

public class ProviderImpl implements Provider {

	public String build(String name) throws Exception {
		System.out.println("server build:" + name);
		return name + ".server";
	}

}
