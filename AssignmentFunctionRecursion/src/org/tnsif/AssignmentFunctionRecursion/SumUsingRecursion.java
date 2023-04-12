package org.tnsif.AssignmentFunctionRecursion;

public class SumUsingRecursion {

	public static void main(String[] args) {
	
	int num =123;
	int rem =0, sum =0;
	while(num>0) {
		rem = num % 10; //1
		sum = rem + sum; //6
		num = num /10; //0
	}System.out.println(sum);
	
	}
}
