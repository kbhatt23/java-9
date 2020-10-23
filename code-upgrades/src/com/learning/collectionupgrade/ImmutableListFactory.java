package com.learning.collectionupgrade;

import java.util.Arrays;
import java.util.List;

public class ImmutableListFactory {
public static void main(String[] args) {
	List<String> immutableStirngs = List.of("sita","ram","radhe","shyam");
	//i think we can not do this
	//in arrays.as list it was possible
	//immutableStirngs.set(0, "mata sita");
	//immutableStirngs.add("ram lala");
	
	List<String> asList = Arrays.asList("sita","ram","radhe","shyam");
	//adding or removing item not possible for viewed collection
	//asList.add("not possible");
	//asList.remove(0);

	//however setting is possible
	asList.set(0, "sita ram");
	System.out.println(asList);
	System.out.println(immutableStirngs);
	
}
}
