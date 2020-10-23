package com.learning.varargsupgrade;

import java.util.ArrayList;
import java.util.List;

public class VarArgsGeneric {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	copyItemsToList(list, "sita","ram","radhe","shyam");
	System.out.println(list);
}
//forcing Number -> as int,double,float,all are subtypes of number
//@SafeVarargs
public static <T>  void copyItemsToList(List<T> list , T... items) {
	
	for(T t: items) {
		list.add(t);
	}
}
}
