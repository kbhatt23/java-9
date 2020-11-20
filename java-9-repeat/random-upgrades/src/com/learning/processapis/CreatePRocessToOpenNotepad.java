package com.learning.processapis;

import java.io.IOException;

public class CreatePRocessToOpenNotepad {
public static void main(String[] args) {
	String commandApplication = "C:\\\\Program Files\\\\Notepad++\\\\notepad++.exe";
	//String commandApplication = "C:\\Windows\\System32\\notepad.exe";
	String commandArgument = "C:\\Kanishk\\learning\\java-9\\workpace\\java-9\\java-9-repeat\\random-upgrades\\readthis.txt";
	try {
		ProcessUtil.createProcess(commandApplication,commandArgument);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
