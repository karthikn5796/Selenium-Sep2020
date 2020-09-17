package Week1.Day2;

 import java.util.Arrays;


public class SecondLargest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {


		int[] data = {4,5,6,7,13,12};
			
		Arrays.sort(data);
		
		for (int i = data.length-2; i< data.length; i++) {   
			
			System.out.println("Second Largest Number is " + data[i]);  
			
			break;
		}
		

	}

}
