package com.learning.collectionupgrades;

import java.io.BufferedReader;
import java.io.FileReader;

public class AutocloseableUsage {
public static void main(String[] args) {
	
	try(BufferedReader reader = new BufferedReader(new FileReader("notexist.txt"))){
		System.out.println("file found");
	}catch (Exception e) {
		System.out.println("exception occured "+e);
	}
}
}
