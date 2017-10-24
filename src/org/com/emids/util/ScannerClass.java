package org.com.emids.util;

import java.util.Scanner;

public class ScannerClass {
	
	static Scanner scanner = new Scanner(System.in);
	
	static public int nextInt() {
		return scanner.nextInt();
	}
	
	static public String nextLine() {
		return scanner.nextLine();
	}
	
	static public double nextDouble() {
		return scanner.nextDouble();
	}

}
