package com.learning.optionalupgrade;

import java.util.List;
import java.util.Optional;

public class OptionalOrUsage {

	public static void main(String[] args) {
		List<Integer> findIntegers = OptionalDataUtil.findIntegers();
		Optional<Integer> findFirst = findIntegers
			.stream()
			.filter(a -> a >5)
			//is optional as all might get filketeed or collection be empty
			.findFirst();
		
		//old way of gettin value -> returns value not optional
		//Integer valFound = findFirst.orElse(-1);
		//System.out.println("val found "+valFound);
		
		//we can even thro exception if optional is mepoty
		//Integer valFound = findFirst.orElseThrow(RuntimeException::new);
		//System.out.println("val found "+valFound);
		
		//new way -> allow us to continue the piplein of mapping
		//helps a lot in not writing imperative code
		
		Optional<Integer> orOptional = findFirst.or(() -> Optional.of(-1));
		
		orOptional.map( i -> i*2).ifPresentOrElse(a -> System.out.println("val found and updated "+a), () -> System.out.println("nothing found"));
		
	}

}
