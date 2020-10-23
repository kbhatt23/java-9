package sampleinternal;

import java.util.List;

public class InternalListSupplier {

	public static List<String> supplyList(){
		System.out.println("supplier providing the list");
		return List.of("sita-ram","radhe-shyam");
	}
}
