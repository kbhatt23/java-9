package com.learning.streamsupgrade;

import java.util.Arrays;
import java.util.List;

public class SortedListFindItemsTillChars {
public static void main(String[] args) {
	List<String> names = Arrays.asList("messi","zidane","xavi","kaka","alex","grimaldo","cafu");
	names.stream()
		 .sorted()
		 .takeWhile(a -> a.charAt(0) <= 'm')
		 .forEach(System.out::println);

}
}
