package com.logic;

import java.util.Scanner;

public class bigsmallarray {
	
	public static void main(String[] args) {
	 
		int a[],n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ARRAY SIZE");
		n=sc.nextInt();
		a=new int[n];
		
		System.out.println("ENTER ARRAY NUMBERS");
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
	}

}
