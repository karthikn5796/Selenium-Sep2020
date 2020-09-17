package Week1.Day2;


import java. util. Arrays;

public class MissingElement {

	public static void main(String[] args) {

		
		int[] arr = {1,2,3,5,6};
		Arrays.sort(arr);
			
			for (int i = 0; i < arr.length; i++) {
				if((i+1)!=arr[i]) {
					System.out.println("missing element is "+ (i+1));
					break;
		}
		}
	}

}
