package com.learning.processapis;

import java.util.Arrays;

public class FindAllProcesses {
public static void main(String[] args) {
	ProcessHandle.allProcesses()
		.filter(process -> process.info().user().isPresent())
		.limit(10)
		.map(process -> {
			StringBuilder sb = new StringBuilder();
			sb.append(process.pid())
			  .append(" : ")
			  .append(process.info().user().orElse(" No User"))
			  .append(" : ")
			  .append(process.info().command().orElse("No Command"))
			  ;
			return sb.toString();
		})
		.forEach(System.out::println);
		
	;
}
}
