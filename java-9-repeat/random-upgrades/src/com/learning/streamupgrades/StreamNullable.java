package com.learning.streamupgrades;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamNullable {
public static void main(String[] args) {
	List<String> names = Arrays.asList("sita-ram", "radhe-krishna","uma-shankar",null,"ramaduta-hanuman");
	
	//unabletohandlenulls(null);
	//unabletohandlenulls(names);
	
	List<String> nullNames = null;
	
	//handleNullsinListJava8(nullNames, String::toUpperCase);
	//way one bubt we are wiring a lot of code here
	//better use filters
	//Function<String, String> transforamtion = str -> str == null ? "" : str;
	//handleNullsinListJava8(names, String::toUpperCase);
	
	//handleNullsinListJava8(nullNames, String::toUpperCase);
	handleNullsinListJava8(names, String::toUpperCase);
}

private static void unabletohandlenulls(List<String> names) {
	names.stream()
		 .map(String::toUpperCase)
		 .forEach(System.out::println);
} 

//method handle null list or even null element in collection
public static <T,R> void handleNullsinListJava8(List<T> listItem , Function<T, R> transformation) {
	//list itself can also be null
	Stream<T> itemStream = listItem == null ? Stream.empty() : listItem.stream();
	
	itemStream
			.filter(item -> item != null)
			.map(transformation)
			.forEach(System.out::println);
}

public static <T,R> void handleNullsinListJava9(List<T> listItem , Function<T, R> transformation) {
	Stream<T> itemStream = listItem == null ? Stream.empty() : listItem.stream();
		itemStream
		.flatMap(Stream::ofNullable)
		.forEach(System.out::println);
}

}
