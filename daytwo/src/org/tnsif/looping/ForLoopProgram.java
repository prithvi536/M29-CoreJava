package org.tnsif.looping;

import java.util.Scanner;

public class ForLoopProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}

	}

}
