package org.system;

public class Desktop extends Computer {
	
	public static void desktopSize() {
		System.out.println("DesktopSize=100%");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

Desktop desk = new Desktop();

Desktop.desktopSize();

Computer.computerModel();
	}
	
	

}
