package Week1.Day2;

public class PirntDuplicates {

	public static void main(String[] args) {


			int[] arr= {1,2,3,3,4,5,6,7,8,9,10,11,12,13,14,14};
		
		System.out.println("Length of the array is "+arr.length);
		int count;
		for (int i = 0; i < arr.length-1; i++) {
			count=0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]==arr[i]) {
					count=count+1;
				}
				
				
			}
			if(count>0) {
				System.out.println("Duplicate numbers are: " + (arr[i]));
			}
			
		}

	}

}
