package org.cmp;

import java.util.Scanner;

public class Functions {
	 static void addtion() {
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter a First number");
		int a = input.nextInt();
		System.out.println("Enter a Second number");
		int b = input.nextInt();
		int c = a+b;
		System.out.println(" Add Two umbers :"+c);

	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a password : ");
		String s1 = input.next();
		System.out.print(" Enter a Repassword :");
		String s2 = input.next();
		if (s1.charAt(0)==s2.charAt(0)) {
			
			s2=s2.replaceFirst(" "+s1.charAt(0), "");
			
			System.out.println(" good try but must more effect mind it : ");
			addtion();
			
		}
		else {
			System.out.println(" Please Check tha password");
		}
		
			
	}

}
