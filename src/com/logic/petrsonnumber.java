package com.logic;

import java.util.Scanner;

import com.oops.main;

public class petrsonnumber {

	public static void main(String[] args) {
		
		Scanner obj= new Scanner(System.in);
		System.out.println("enter your number");
		int  n=obj.nextInt();
		
		int i,r,fact=0,sum,total=0;
		for(i=1;i<n;i++)
		{
			r=n%10;
			System.out.println(r);
			
			for(i=1;i<r;i++)
			{
				r=n%10;
				System.out.println(r);
				fact=r*i;
				//System.out.println(fact);
				System.out.println("fact"+fact);
				total=total+fact;
				System.out.println("total"+total);
				
				n=n/10;
				System.out.println(n);
			}	
		}
		System.out.println("after all Steps get "+total);	
	}
}
