package com.learning.interfaceupgrade;

public class User1 {
public static void main(String[] args) {
	SampleInterface type1 = new Implementor();
	type1.abstractMethod1();
	
	System.out.println("================");
	type1.abstractMethod2();
	
	System.out.println("================");
	type1.defaultMethod("direct main class");
	
	System.out.println("================");
	//object instance can not call static methods
	//type1.staticMethod("caller");
	
	//non static call
	SampleInterface.staticMethod("direct main class");
	
	//private method can not be claled here
	//type1.privateMethod();
	//SampleInterface.privateStaticMEthod();
}
}
