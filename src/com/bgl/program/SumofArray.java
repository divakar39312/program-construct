package com.bgl.program;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("addition is :"+sum);
	}
}
