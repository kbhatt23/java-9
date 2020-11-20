package com.learning.processapis;

public class PrintCurrentDetails {
public static void main(String[] args) {
	ProcessUtil.printCurrentProcessdetails();
	
	//print process with pid
	ProcessUtil.printPRocessWithId(10272);
}
}
