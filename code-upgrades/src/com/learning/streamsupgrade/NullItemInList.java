package com.learning.streamsupgrade;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NullItemInList {
public static void main(String[] args) {
		List<String> str = Arrays.asList("one", "two", "three", /* null, */ "four", "five");
	
	str.stream()
		//.map(String::toUpperCase)
		.flatMap(a -> Stream.of(a.toUpperCase()))
		.forEach(System.out::println);
	
List<String> nullableStr = Arrays.asList("one", "two", "three",  null,  "four", "five");
	System.out.println("new wala");
nullableStr.stream()
		//.map(String::toUpperCase)
//ofNullable is similar to optional of nullable -> null items are handled and returns empty stream, if item is not null then no issues
		.flatMap(a -> {
			if(a != null) {
				return Stream.ofNullable(a.toUpperCase());
			}
			return Stream.empty();
		})
		.forEach(System.out::println);
}
}
