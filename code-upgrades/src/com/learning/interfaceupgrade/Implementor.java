package com.learning.interfaceupgrade;

public class Implementor implements SampleInterface{

	@Override
	public void abstractMethod1() {
		System.out.println("abstract method 1 called");
		//all the defualt methods can still be called and also static
		defaultMethod("abstractMEthod1");
		//can not call static methoids of interface
		//private method of intercae can only be alled by interface default methods
		//private static methods of interface can be called by static and default methods of interface opnly
		//privateMethod("abstractMEthod1");
	}

	@Override
	public void abstractMethod2() {
		System.out.println("abstract method 2 called");
		defaultMethod("abstractMEthod2");
	}

}
