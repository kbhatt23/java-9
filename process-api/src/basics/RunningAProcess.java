package basics;

import java.io.IOException;

public class RunningAProcess {
public static void main(String[] args) {
	ProcessBuilder processBuilder = new  ProcessBuilder("java","-jar" , "hello-world-0.0.1-SNAPSHOT.jar");

	try {
		Process processCreated = processBuilder.start();
		System.out.println("started process with pid "+processCreated.pid());
		//processCreated.destroy();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
