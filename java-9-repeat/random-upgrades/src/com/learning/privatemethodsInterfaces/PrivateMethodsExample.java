package com.learning.privatemethodsInterfaces;
@FunctionalInterface
public interface PrivateMethodsExample {

	void maipulate();
	
	default String defaultString() {
		String str= "jai shree ram";
		//can use both static and default(aka instance) private methods
		return toUppperCaseDefault(str);
		//return toUppperCaseStatic(str);
	}
	
	static String staticString() {
		String str="jai shree krishna";
		//wont work -> unale to call default private method
		//return toUppperCaseDefault(str);
		
		return toUppperCaseStatic(str);
	}
	//can only be used within interface only
	//and onlu default method cna use this form interface and not static
	private String toUppperCaseDefault(String str) {
		return str.toUpperCase();
	}
	
	private static String toUppperCaseStatic(String str) {
		return str.toUpperCase();
	}
}
