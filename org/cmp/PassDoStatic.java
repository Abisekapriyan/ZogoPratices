package org.cmp;

import java.util.Scanner;

public class PassDoStatic {
	
	private static void Login() {
		
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter A First Number : ");
		int a = input.nextInt();
		System.out.println(" enter a Second number : ");
		int b = input.nextInt();
		int c = a+b;
		System.out.println("You get : "+c);
		

	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Pass : ");
		String s1 = input.next();
		String count = "";
		do {
			System.out.println(" Enter a RePass : ");
			String s2 = input.next();
			count = s2;
			
			
			
		} while (count.charAt(0) == s1.charAt(0));
		
		count=count.replaceFirst(""+ s1.charAt(0), "");
		System.out.println(" Good Try ples more Effect and wiil be win One Day :");
		
		
		Login();
		 
		
	}
	

}
