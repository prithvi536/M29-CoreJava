package org.tnsif.exceptiondemo;

public class MutipleCatchDemo {

	public static void main(String[] args) {

		int arr[] = new int[] {101,33,78};
		System.out.println("Array is: ");
		try {
		System.out.println(arr[3]);
		}
		
		//we can use multiple catch blocks
		/* catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Handled"+e);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Handled"+e);
		} */
		
		//we can pass multiple exceptions inside the same catch block
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println(e);
		}
	}
		

}
