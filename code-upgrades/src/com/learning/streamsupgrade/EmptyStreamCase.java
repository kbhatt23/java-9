package com.learning.streamsupgrade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmptyStreamCase {
	public static void main(String[] args) {
		List<Integer> numbers = IntStream.range(1, 11).collect(ArrayList::new, List::add, List::addAll);
		List<Integer> filteredList = numbers.stream()
			   .takeWhile(num -> num > 10) // condition will never met and henc empty stream
			   .collect(Collectors.toList())
			   
			   ;
		System.out.println(filteredList);
		
		List<Integer> filteredList2 = numbers.stream()
				   .dropWhile(num -> num < 11) // condition will never met and henc empty stream
				   .collect(Collectors.toList())
				   
				   ;
			System.out.println(filteredList2);
			
			//genrate infinite strea , for fixed lenght use of method of stream
			String inifiniteStreamFirst10=
			Stream.iterate(1, i -> i+1)
				  //.limit(10)
				  .map(String::valueOf)
				  .collect(Collectors.joining(","));
		System.out.println(inifiniteStreamFirst10);
		
	}
}
