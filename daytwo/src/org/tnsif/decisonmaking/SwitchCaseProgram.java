package org.tnsif.decisonmaking;

import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your song code");
		String songInput = s.nextLine();
		
		//switch-case statement
		switch(songInput) {
		case "cd":
			System.out.println("calm down");
			break;
		case "s":
			System.out.println("shakira");
			break;
		case "nl":
			System.out.println("no lies");
			break;
		default:
			System.out.println("Invalid Input");
			
		}

	}

}
