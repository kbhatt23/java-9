package com.learning.collectionupgrade;

import java.util.List;

public class ListPropertiesFactory {
public static void main(String[] args) {
	//we can not insert null in any factory method
	//List<String> strs = List.of("sita ram", null);
	List<String> strs = List.of("sita ram", "radhe shyam");
	System.out.println(strs);
	
	//can not modify/remove/add
	//strs.add("not possible");
	//strs.set(0, "not possible");
	//strs.remove(0);
}
}
