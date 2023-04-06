package org.tnsif.operatordemo;

public class BitwiseOperator {

	public static void main(String[] args) {
		int res1 = 10 & 7;
		int res2 = 10 | 7;
		int res3 = 10 ^ 7;  // (XOR) if both the inputs are same then 0, otherwise 1
		int res4 = 16 >> 2; //right shift a/2^b
		int res5 = 8 << 2; //left shift a*2^b
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);

	}

}
