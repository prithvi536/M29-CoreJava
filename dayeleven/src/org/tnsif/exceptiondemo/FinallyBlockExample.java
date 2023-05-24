package org.tnsif.exceptiondemo;

public class FinallyBlockExample {

	public static void main(String[] args) {
		
		int arr[] = new int[] {101,33,78};
		System.out.println("Array is: ");
		try {
			System.out.println(arr[3]);
		}
		catch(Exception e) {
			System.out.println("Exception handeld" + e);
			//System.exit(0); //no further statements are executed
		}
		finally {
			System.out.println(13/0);
			System.out.println("Finally Block");
		}
		
	}

}
