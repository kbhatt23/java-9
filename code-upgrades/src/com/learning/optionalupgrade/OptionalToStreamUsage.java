package com.learning.optionalupgrade;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalToStreamUsage {
public static void main(String[] args) {
	List<Integer> findIntegers = OptionalDataUtil.findIntegers();
	Optional<Integer> findFirst = findIntegers
		.stream()
		.filter(a -> a >5)
		//is optional as all might get filketeed or collection be empty
		.findFirst();
	
	//empty stream will print nothing
	//printStream(Stream.empty());
	
	// 0 - n items can be printed one by one
	//printStream(findIntegers.stream());
	
	//for optional we can print 0 or 1 item
	printStream(findFirst.stream());
} 

public static void printStream(Stream<Integer> stream) {
	stream.forEach(System.out::println);
}

}
