package com.learning.streamsupgrade;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class InifinteStreamUsage {
public static void main(String[] args) {
	UnaryOperator<Integer> inifinteIteration = i ->{ 
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i+1;
		};
	Stream.iterate(1,  inifinteIteration)
	.limit(5) // good after 5 it stops producing more items of stream
	//.skip(5) // not good after 5 it keeps on producing and printing items
	 //.takeWhile(i -> i < 5) //good as once item incerease by 5 it shorcircuits
	  // .dropWhile( i -> i > 5) //not good as once condition returns flase it keeps on emiting inifinite strea
		.forEach(System.out::println);
	;
	System.out.println("=======good way==========");
	//new method to break inifinte stream
	//until preicate is true it keeps on sending item after false it breaks
	Stream.iterate(1,  i -> i  < 10, inifinteIteration)
		.forEach(System.out::println);
	;
}
}
