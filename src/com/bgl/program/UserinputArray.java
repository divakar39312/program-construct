package com.bgl.program;

import java.util.Scanner;

public class UserinputArray {

	
	public static void main(String[] args) {
		
		System.out.println("Enter array size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("elements are: ");
		for(int i=0;i<n;i++) {
			System.out.println(" "+arr[i]+" ");
		}
	}
}
