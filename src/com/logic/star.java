package com.logic;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
//		
//		System.out.println("ENTER HOW MANY * NEED PLEASE INPUT NUMBER");
//		Scanner sc=new Scanner(System.in);
//		int num= sc.nextInt();
		int i,j,num=5;
		for(i=0;i<=num;i++)
		{
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
			
	}
}
