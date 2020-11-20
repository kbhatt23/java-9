package com.learning.collectionupgrades;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListFacotry {
	public static void main(String[] args) {
		
		String[] array = new String[] { "sita-ram", "radhe-shyam", "uma-shankar", "ramaduta-hanuman"/* ,null */};
	
		//different class based on size
		//for one and two different class -> for more than 2 till nth it is list$n -> for space efficiency
		System.out.println(List.of("one","two","three").getClass());
		
		//nulls are allowed in old way of unmodifiable collections
		String[] arrayWithNull = new String[] { "sita-ram", "radhe-shyam", "uma-shankar", "ramaduta-hanuman" ,null };
		List<String> unmodifiableList = Collections.unmodifiableList(Arrays.asList(arrayWithNull));
		System.out.println(unmodifiableList.stream().collect(Collectors.joining(",")));
		
		//creates fixed size array list -> viewed collection
		List<String> asList = Arrays.asList(array);
		difference1(array, asList,List.of(array));
		
	}

	private static void difference1(String[] array, List<String> asList,List<String> unmodifiableList) {
		//fixed size and hence can not add or remove item
		//but can update
		asList.set(3, "ramduta-hanuman");
		array[0] = "jai "+array[0];
		
		//as it is fixed size array we can not insert/remove
		//asList.add("wont insert");
		//asList.remove(0);
		
		System.out.println(Arrays.stream(array).collect(Collectors.joining(",")));
		System.out.println(asList.stream().collect(Collectors.joining(",")));
		
		//can not inser/reomve/modify index
		//unmodifiableList.add("wont insert");
		//unmodifiableList.remove(0);
		//unmodifiableList.set(3, "ramduta-hanuman");
	}
}
