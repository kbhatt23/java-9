package sample;

import java.util.List;

import sampleinternal.InternalListSupplier;

public class HelloList {
	public static List<String> getNames(){
		System.out.println("hello list calling supplier to get list");
		return InternalListSupplier.supplyList();
	}
}
