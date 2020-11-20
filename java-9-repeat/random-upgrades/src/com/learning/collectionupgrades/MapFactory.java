package com.learning.collectionupgrades;

import java.util.Map;

public class MapFactory {
public static void main(String[] args) {
	
	Map<Integer, String> mapFactory = Map.of(1,"one",2,"two");
	
	//can nmot duplicate key
	//Map<Integer, String> mapFactory = Map.of(1,"one",2,"two",1,"oneupdated");
	System.out.println(mapFactory.getClass());
	
	
	//can not mutate
	//mapFactory.remove(1);
	//mapFactory.put(3, "three");
	
	System.out.println(mapFactory.get(2));
}
}
