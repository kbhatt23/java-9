package com.learning.tryresourceupgrade;

import java.util.Arrays;

public class JDK9USage {
	public static void main(String[] args) {
		// jdk -9 : we can define or consumer resource created outside the try block
		// but danger is that since it will get closed
		// if another method try to use same resource object it will fail
		// the resource has to be final/effecively final
		/* final */ MyResource resource = new MyResource(1);
		
		// resource is defined outside , and is final

		// compiler will cry just like labda -> has to be final/effectively fina;
		// resource = new MyResource(1);

		executeProcess(resource);
		//danger -> if this is closed but refernce is still there m it can fail second time
		executeProcess(resource);
	}

	private static void executeProcess(MyResource resource) {
		try (resource) {
			resource.process();
			// close call before cath call
		} catch (Exception e) {
			System.out.println("Excpetion occured while processing " + e);
			Throwable[] suppressed = e.getSuppressed();
			if (suppressed != null && suppressed.length > 0)
				Arrays.stream(e.getSuppressed()).forEach(a -> System.out.println("suppresed excpetion " + a));
		}
	}
}
