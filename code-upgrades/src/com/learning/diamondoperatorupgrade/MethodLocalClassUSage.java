package com.learning.diamondoperatorupgrade;

public class MethodLocalClassUSage {
public static void main(String[] args) {
	class UpdatedGenericClass<T> extends GenericClassFordiamondOperator<T> {
		//overriding feature
		@Override
		public void method1() {
			internalPrint();
		}
		//can create new methods but wont be callable from object refernece
		public void internalPrint() {
			System.out.println("jai radha damodar says "+getT());
		}
		public UpdatedGenericClass(T t) {
			super(t);
		}
	};
	UpdatedGenericClass<String> item1 = new UpdatedGenericClass<>("jdk king");
	item1.method1();
	//wont be visible in anoinymous inner class-> for this feature use method local class
	item1.internalPrint();
}
}
