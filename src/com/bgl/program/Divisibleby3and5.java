package com.bgl.program;

import java.util.Scanner;

public class Divisibleby3and5 {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
			System.out.println("\n\nDivided by 3 & 5: ");			
			for (int i=1; i<n; i++) {
				if (i%3==0 && i%5==0) System.out.print(i +", ");			
			}
			System.out.println("\n");
	  }

	

}
