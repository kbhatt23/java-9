package com.learning.interfaceupgrade;

public interface SampleInterface {

	public void abstractMethod1();
	
	public void abstractMethod2();
	
	//default method can call static method
	default void defaultMethod(String caller) {
		System.out.println("calling default method called by "+caller);
		staticMethod("defaultMethod");
		privateMethod("defaultMethod");
	}
	static void staticMethod(String caller) {
		System.out.println("calling static method by "+caller);
		//staic method can call only static methods
		//defaultMethod("staticMethod");
		//can not call private istance method
		//privateMethod("defaultMethod");
		privatestaticMethod("staticMethod");
	}
	//private instance ,method -> can be called only by default methods
	private void privateMethod(String caller) {
		System.out.println("private method called by "+caller);
	}
	
	private static void privatestaticMethod(String caller) {
		System.out.println("private method called by "+caller);
	}
}
