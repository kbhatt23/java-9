package com.learning.streamupgrades;

import java.util.stream.Stream;

public class StreamIterateLimitUpgrade {
public static void main(String[] args) {
	//first item itslef is not follwing the predicate condition
	//nothing will print
	Stream.iterate(10, i -> i < 10, i -> i+1)
			.forEach(System.out::println);
			;
			
	Stream.iterate(1, i -> i < 10, i -> i+1)
	.forEach(System.out::println);
	;
}
}
