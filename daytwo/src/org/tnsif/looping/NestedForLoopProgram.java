package org.tnsif.looping;

public class NestedForLoopProgram {

	public static void main(String[] args) {
		int rows=4, cols =4;
		for(int i=1;i<=rows;i++) 
		{
			for(int j=1;j<=cols;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
