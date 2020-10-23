package com.learning.streamsupgrade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TakeWhileUsage {

	public static void main(String[] args) {
		List<Integer> numbers = IntStream.range(1, 11).collect(ArrayList::new, List::add, List::addAll);
		
		//old way ,lets say we want to skip first 7 items and remaining items we need
		
		String numbersSkip = numbers
			.stream()
			.skip(7)
			.map(String::valueOf)
			.collect(Collectors.joining(","));
		
		System.out.println("old way skip "+numbersSkip);
		
		//new method -> based on condition 
		//keep on ignoring the item in stream until the condition is true, 
		//once condition returns false, that item and further till end of items are processed
		
		String numbersDropWhile = numbers
				.stream()
				//keep on skipping until returns true, once false items keep once processing
				.dropWhile(num -> num < 8 ) // takes 7 items
				.map(String::valueOf)
				.collect(Collectors.joining(","));
		System.out.println("new way dropWhile "+numbersDropWhile);
		System.out.println(numbersDropWhile.equals(numbersSkip));
	}
}
