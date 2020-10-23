package com.learning.collectionupgrade;

import java.util.Set;

public class SetFactoryProperties {
	public static void main(String[] args) {
		//nul can not be inserted in any of factory methods of collection
		//Set<String> setItems = Set.of("sita ram", null);
		Set<String> setItems = Set.of("sita ram", "radhe shyam");
		System.out.println(setItems);
		
		//duplicate not allwoed, throws runtime expection
		//Set<String> setItemsDuplicates = Set.of("sita ram", "sita ram");
		
		//both addition/remove update not possible
		//setItems.add("not possible");
		//setItems.remove("sita ram");
	}
}
