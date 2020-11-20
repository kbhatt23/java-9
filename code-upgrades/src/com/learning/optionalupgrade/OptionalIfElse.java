package com.learning.optionalupgrade;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class OptionalIfElse {

	public static void main(String[] args) {
		List<Integer> findIntegers = OptionalDataUtil.findIntegers();
		Optional<Integer> findFirst = findIntegers
			.stream()
			.filter(a -> a >50)
			//is optional as all might get filketeed or collection be empty
			.findFirst();
		
		//old way -> will consume only if optional is not empty
		//if empty nothing happens
		//findFirst.ifPresent(System.out::println);
		
		//we cna have if and else case of optional beeing valued or empty
		findFirst.ifPresentOrElse(a -> System.out.println("Value found "+a), () -> System.out.println("nothing found"));
		System.out.println("task done");
		
	}

}

class OptionalDataUtil{
	
	public static List<Integer> findIntegers(){
		return IntStream.iterate(1, i -> i <= 10, i -> i+1)
		.collect(ArrayList::new, List::add, List::addAll)
		;
	}
}
