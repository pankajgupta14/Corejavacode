package com.logic;

import java.util.Scanner;

// 545 
public class palindrome {
	
	static void palindrome()
	{
		
	Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	
	 int sum=0,rem;
	 int temp=n;
	 
	 while (n>0)
	 {
		 rem=n%10;
		 sum=(sum*10)+rem;
		 n=n/10;
		 
	 }
	 if(temp==sum)
	 {
		 System.out.println("entered number is palindrome ");
	 }
	 else 
	 {
		 System.out.println("number is not plaindrome");
		 System.out.println("try one more time ");
		 palindrome();
	 }
	}

	public static void main(String[] args) {
		
	  palindrome();
	}
	
	
}
