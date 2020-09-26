package org.system;

public class Computer {
	
	
	public static void computerModel() {
		
		System.out.println("HP--->Windows 10");
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Computer com = new Computer();
		
	com.computerModel();
	}

}
