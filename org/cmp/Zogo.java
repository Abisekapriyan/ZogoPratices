package org.cmp;

import java.util.Random;
import java.util.Scanner;

public class Zogo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" enter ya random number :");
		int n = input.nextInt();
		System.out.print("enter a last number : ");
		int y = input.nextInt();
		Random r = new Random();
		int number = 0;
		while (number!=n) {
			number=r.nextInt(y);
			System.out.println(number);
			
		}
	}

}
