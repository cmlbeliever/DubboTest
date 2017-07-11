package com.cml.dubbo.client.listener;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.listener.DeprecatedInvokerListener;
import com.alibaba.dubbo.rpc.listener.InvokerListenerAdapter;

public class MyRemoteListener extends InvokerListenerAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(DeprecatedInvokerListener.class);

	@Override
	public void referred(Invoker<?> invoker) throws RpcException {
		super.referred(invoker);
		LOGGER.info("targetInterface:" + invoker.getInterface() + ",url:" + invoker.getUrl());
	}
}
