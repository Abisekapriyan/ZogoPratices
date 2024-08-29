package org.cmp;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			
			for (int player = 1; player <=n; player++) {
				System.out.print("*");
				
				}
			System.out.println();
			
		}

	}

}
