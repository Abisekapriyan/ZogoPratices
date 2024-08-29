package org.cmp;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter a Last Rank :");
		int y = input.nextInt();
		do {
			
			System.out.println(" enter ya rank :");
			int n = input.nextInt();
			
			count = n;
			
		} while (count < y);
		System.out.println("****** please check tha Last  input*******");
	}


}
