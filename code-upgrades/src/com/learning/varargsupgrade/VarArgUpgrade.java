package com.learning.varargsupgrade;

public class VarArgUpgrade {

	
	public static void main(String[] args) {
		varArgMethod(); //this will pass empty array, meaning size 0 but not null
		
		varArgMethod("one");
		varArgMethod("one", "two");
		varArgMethod(1);
		varArgMethod(1,"sita ram");
		varArgMethod(1,2);
		varArgMethod(1,2,"ram");
		varArgMethod(1,2,"sita", "ram");
	}
	//var arg is optional 0 to n
	//int/data tyupeis mandatory to call that method
	public static void varArgMethod(String... strings) {
		System.out.println(strings.length);
		for (String string : strings) {
			System.out.println("item added "+string);
		}
	}
	//var arg has to be last param
	public static void varArgMethod(int a, String... strings) {
		System.out.println(strings.length);
		for (String string : strings) {
			System.out.println("item added "+string);
		}
	}
	
	//var arg has to be last param , param before vararg canhappen but not after it
	public static void varArgMethod(int a, int b,String... strings/* ,int b */) {
			System.out.println(strings.length);
			for (String string : strings) {
				System.out.println("item added "+string);
			}
		}
}
