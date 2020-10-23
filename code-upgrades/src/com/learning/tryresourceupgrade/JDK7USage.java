package com.learning.tryresourceupgrade;

import java.util.Arrays;

public class JDK7USage {
public static void main(String[] args) {
	//try with resource
	
	//try(MyResource resource = new MyResource(1)){
	//try(MyResource resource = new MyResource(2)){
	try(MyResource resource = new MyResource(3)){
		resource.process();
		//close call before cath call
	}catch (Exception e) {
		System.out.println("Excpetion occured while processing " + e);
		Throwable[] suppressed = e.getSuppressed();
		if(suppressed != null && suppressed.length > 0)
			Arrays.stream(e.getSuppressed()).forEach(a -> System.out.println("suppresed excpetion " + a));
	}
}
}
