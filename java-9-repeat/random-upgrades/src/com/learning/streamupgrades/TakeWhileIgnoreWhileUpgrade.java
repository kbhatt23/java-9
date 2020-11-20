package com.learning.streamupgrades;

import java.util.List;

public class TakeWhileIgnoreWhileUpgrade {
public static void main(String[] args) {
	List<String> namesSorted = List.of("ganesh","ram","ramduta","sitarama","umashankar");
	
	//take while is conditional based
	//keep on taking items until predicate is true
	//once for any elmeent it is false break the loop for that itema nd other ones after that
	
	//until each itm have first charachter before r or equal r it will iterate
	//once flase it ignores thaqt item and break the loop
	
	namesSorted.stream()
			   .takeWhile(str -> str.charAt(0) <= 'r')
			   //if first condition itslef is false then all items are ignored
				//.takeWhile(str -> str.charAt(0) == 'r')
				.forEach(System.out::println);
	
	//drop while 
	//keep on ignoring item until the predicate is true
	//once element return false ,take that elmenet and keep on iterating after that
	System.out.println("================");
	namesSorted.stream()
	   .dropWhile(str -> str.charAt(0) <= 'r')
	   
		//if first element itself return false then none item will be dropped
		//.dropWhile(str -> str.charAt(0) == 'r')
		.forEach(System.out::println);
	
	
	System.out.println("===========================");
	
	//below code acts same like filter and findfirst
	namesSorted.stream()
	   .takeWhile(str -> str.charAt(0) <= 'r')
	   //if first condition itslef is false then all items are ignored
		//.takeWhile(str -> str.charAt(0) == 'r')
	   .findFirst()
	   .ifPresent(e -> System.out.println("jai shree ram takewhile "+e));
	
}
}
