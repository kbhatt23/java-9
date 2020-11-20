package com.learning.optionalupgrades;

import java.util.List;
import java.util.Optional;

public class OptionalUpgradesPart1 {
	public static void main(String[] args) {
		
		List<Integer> numbers  = List.of(1,2,3,4,5);
		//List<Integer> numbers  = List.of(1,2,3,4,5,6);
		//find first element greater than 5
		//multiple that with 2
		
		java8limitation(numbers);
		java9ifOrElse(numbers);
		java9orDefault(numbers);
		
		java9OptionalToStream(numbers);
	}

	private static void java8limitation(List<Integer> numbers) {
		numbers.stream()
			   .filter(a -> a>5)
			   .findFirst()
			   .map(i -> i*2)
			   .ifPresent(System.out::println);
	}
	private static void java9ifOrElse(List<Integer> numbers) {
		numbers.stream()
			   .filter(a -> a>5)
			   .findFirst()
			   .map(i -> i*2)
			   .ifPresentOrElse(System.out::println, () -> System.out.println("None numbers greater thatn 5"));
	}
	
	//if no elment is present take 1 as default number and transofrm it to 2*1 rule as usual
	private static void java9orDefault(List<Integer> numbers) {
		numbers.stream()
			   .filter(a -> a>5)
			   .findFirst()
			   .or(() -> Optional.of(1))
			   .map(i -> i*2)
			   .ifPresent(System.out::println);
	}
	
	private static void java9OptionalToStream(List<Integer> numbers) {
		numbers.stream()
			   .filter(a -> a>5)
			   .findFirst()
			   .stream()
			   .map(i -> i*2)
			   .forEach(System.out::println);
	}
}
