package com.learning.collectionupgrades;

import java.util.Set;
import java.util.stream.Collectors;

public class SetFactory {
public static void main(String[] args) {
	
	//null can not be allowed
	//Set<String> unmodifiableSet = Set.of( "sita-ram", "radhe-shyam", "uma-shankar", "ramaduta-hanuman" ,null );
	
	//duplicates not allowed
	//Set<String> unmodifiableSet = Set.of( "sita-ram", "radhe-shyam", "uma-shankar", "ramaduta-hanuman" ,"sita-ram" );
	
	Set<String> unmodifiableSet = Set.of( "sita-ram", "radhe-shyam", "uma-shankar", "ramaduta-hanuman"  );
	
	//not possible to mutate unmodifiable collection
	//unmodifiableSet.add("not possible");
	//unmodifiableSet.remove("sita-ram");
	
	System.out.println(unmodifiableSet.stream().collect(Collectors.joining(",")));
	
}
}
