package com.learning.streamsupgrade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DropWhileUSage {

	public static void main(String[] args) {
		List<Integer> numbers = IntStream.range(1, 11).collect(ArrayList::new, List::add, List::addAll);
		
		//old way ,lets say we want only first 7 items -> limit
		
		String numbersLimit = numbers
			.stream()
			.limit(7)
			.map(String::valueOf)
			.collect(Collectors.joining(","));
		
		System.out.println("old way limit "+numbersLimit);
		
		//new method -> based on condition 
		//keep on processing the item in stream until the condition is true
		
		String numbersTakeWhile = numbers
				.stream()
				//keep on taking until returns true, once false ignore other items-> short circuiting
				.takeWhile(num -> num < 8 ) // takes 7 items
				.map(String::valueOf)
				.collect(Collectors.joining(","));
		System.out.println("new way takewhile "+numbersTakeWhile);
		System.out.println(numbersTakeWhile.equals(numbersLimit));
	}
}
