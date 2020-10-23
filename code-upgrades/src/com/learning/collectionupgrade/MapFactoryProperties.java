package com.learning.collectionupgrade;

import java.util.Map;

public class MapFactoryProperties {
public static void main(String[] args) {
	Map<Integer, String> mapGood = Map.of(1,"one",2,"two",3,"three");
	System.out.println(mapGood);
	
	//can not insert null in map -> neither key nor value
	//Map<Integer, String> mapProps  =Map.of(1,"one",2,"two",3,null);
	
	//duplicate key will give runtime exception
	//Map<Integer, String> mapProps  =Map.of(1,"one",2,"two",3,"three", 3,"four");
	
	//can not modify/remove the map
	Map<Integer, String> mapProps  =Map.of(1,"one",2,"two",3,"three", 4,"four");
	
	//mapProps.put(1, "one updated");
	//mapProps.remove(1);
	System.out.println(mapProps);
}
}
