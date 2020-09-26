package week3.day1;

public class AxisBank extends BankInfo {
	
	public static void deposit() {
		System.out.println("AxiBank-deposit");
	}

	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String[] args) {
     
		AxisBank ax = new AxisBank();
		ax.deposit();
	
	
	}
	

}
