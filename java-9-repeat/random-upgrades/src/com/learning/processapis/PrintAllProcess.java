package com.learning.processapis;

import java.io.IOException;

public class PrintAllProcess {
public static void main(String[] args) {
	
	System.out.println("chrome pcrocess count "+ProcessUtil.findProcessCountContainingName("notepad"));
	ProcessUtil.printAllProcessDetails();
	
	//open notepad file
	try {
		new ProcessBuilder("notepad","C:\\Kanishk\\learning\\java-9\\workpace\\java-9\\java-9-repeat\\random-upgrades\\readthis.txt")
		.start()
		;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
