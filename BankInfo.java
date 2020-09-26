package week3.day1;

public class BankInfo {

	public static void  saving() {
		System.out.println("SA AC = 8%");
	}
	
	public static void fixed() {
		System.out.println("Fix AC = 9%");
	}
	public static void deposit() {
		System.out.println("Dep Ac = 6%");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BankInfo bi = new BankInfo();
		BankInfo.saving();
		BankInfo.fixed();
		BankInfo.deposit();
		
	}

}
