package com.learning.collectionupgrade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OldWayOfImmutableList {
public static void main(String[] args) {
	List<String> mutableList = new ArrayList<String>();
	mutableList.add("sita");
	mutableList.add("ram");
	mutableList.add("radhe");
	mutableList.add("shyam");
	System.out.println("inittal list "+mutableList);

	List<String> unmodifiableList = Collections.unmodifiableList(mutableList);
	
	//unmodifiableList.add("added not posible");
	//unmodifiableList.remove(0);
	//unmodifiableList.set(0, "sita ram");
	System.out.println("unmodifiableList "+unmodifiableList);
	}
}
