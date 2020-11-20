package com.learning.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.List;

public class ProxyCreator {

	public static <T> T  createProxy(Class<T> clazz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		T realInstance = clazz.getDeclaredConstructor().newInstance();
		
		return (T)Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new ReflectionMethodInvokeHandler(realInstance));
	}
	
	public static <T> T  createProxy(Object realInstance) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		
		return (T)Proxy.newProxyInstance(realInstance.getClass().getClassLoader(), realInstance.getClass().getInterfaces(), new ReflectionMethodInvokeHandler(realInstance));
	}
	
	//@SafeVarargs
	public static <T> void populateList(List<T> itemsList,T... items){
		//below do not work, it has to be object[]
		//T[] array = new T[];
		for(T item:items) {
			itemsList.add(item);
		}
		System.out.println("generated list "+itemsList);
	}
}
