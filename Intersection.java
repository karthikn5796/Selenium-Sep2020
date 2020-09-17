package Week1.Day2;

public class Intersection {

	public static void main(String[] args) {
		

		
				int[] arr1 = {1,4,5,7,8,9};
				int[] arr2 = {9,5,7,4,2,3};
				
				for (int i = 0; i < arr1.length; i++) {
					
					for (int j = 0; j < arr2.length; j++) {
						
						while(arr1[i]==arr2[j]) {
							System.out.println(arr2[j]);
							break;
						}

					}
				}
				
				

			}


	}


