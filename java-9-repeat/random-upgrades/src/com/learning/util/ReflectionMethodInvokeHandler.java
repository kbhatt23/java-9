package com.learning.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ReflectionMethodInvokeHandler implements InvocationHandler{

	private Object realInstance;
	public ReflectionMethodInvokeHandler(Object realInstance) {
		this.realInstance=realInstance;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//just printing the proxy
		//no need to calculate time as of now
		System.out.println("invoking method "+method.getName()+" in proxy for instance "+realInstance );
		
		return method.invoke(realInstance, args);
	}

}
