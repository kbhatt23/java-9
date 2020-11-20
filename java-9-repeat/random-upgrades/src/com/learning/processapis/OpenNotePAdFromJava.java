package com.learning.processapis;

import java.io.IOException;

public class OpenNotePAdFromJava {
public static void main(String[] args) throws InterruptedException {
	ProcessBuilder builder = new ProcessBuilder("C:\\Program Files\\Notepad++\\notepad++.exe");
	
	try {
		Process processCreated = builder.start();
		System.out.println("started process with pid "+processCreated.pid() + " with command "+
				processCreated.info().command().orElse("No Command") + " by user "+processCreated.info().user().orElse("No User")
				);
		
		//removing it after sleep
		
		Thread.sleep(2000);
		
		processCreated.destroy();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
