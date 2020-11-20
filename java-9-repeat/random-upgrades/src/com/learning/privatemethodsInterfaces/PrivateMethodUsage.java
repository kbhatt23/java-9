package com.learning.privatemethodsInterfaces;

import java.util.Arrays;
import java.util.List;

public class PrivateMethodUsage {
public static void main(String[] args) {
	PrivateMethodsExample usingAnaonymousinnerClass =
			() -> System.out.println("instantiated using anonymous class");

	usingAnaonymousinnerClass.maipulate();
	System.out.println("calling default method returns "+usingAnaonymousinnerClass.defaultString());
	
	//can not use static method, in interfaces both types are compeltely sperated
	//usingAnaonymousinnerClass.staticString();
	
	System.out.println(PrivateMethodsExample.staticString());
	
}
}
