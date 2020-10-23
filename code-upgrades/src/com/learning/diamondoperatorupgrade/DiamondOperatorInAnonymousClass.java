package com.learning.diamondoperatorupgrade;

public class DiamondOperatorInAnonymousClass {
public static void main(String[] args) {
	//before jdk7
	GenericClassFordiamondOperator<String> item1 = new GenericClassFordiamondOperator<String>("jdk6");
	item1.method1();
	
	//jdk7
	GenericClassFordiamondOperator<String> item2 = new GenericClassFordiamondOperator<>("jdk7");
	item2.method1();
	
	//anonoymousinner clas - >extend /override the class without giving new name
	//before jdk9

	GenericClassFordiamondOperator<String> item3 = new GenericClassFordiamondOperator<String>("jdk7") {
		//overriding feature
		@Override
		public void method1() {
			internalPrint();
		}
		//can create new methods but wont be callable from object refernece
		public void internalPrint() {
			System.out.println("jai radha damodar says "+getT());
		}
	};
	
	item3.method1();
	//wont be visible -> for this feature use method local class
	//item3.internalPrint();
	
	
	//jdk 9
	
	GenericClassFordiamondOperator<String> item33 = new GenericClassFordiamondOperator<>("jdk9") {
		//overriding feature
		@Override
		public void method1() {
			System.out.println("jai radha damodar says "+getT());
		}
	};
	
	item33.method1();
	
}
}
