package com.logic;

import java.util.Scanner;

public class factorial {
	
	public static void main(String[] args) {
		
		System.out.println("ENTER FACTORIAL NUMBER");
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int i,fact=1;
		  
			  for( i=1;i<=n;i++)
			  {
				 fact=fact*i;
			  }
			  
			  {
				 System.out.println(fact);
			  }
	}

}
