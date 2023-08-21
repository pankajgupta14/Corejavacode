package com.logic;

public class primenumberarray {

	public static void main(String[] args) 
	{
		int a[]= {3,23,45,642,56,76,87,3,5,7,19,2};
		for(int a1 = 0 ; a1 <= a.length-1 ; a1++) {
			for(int b = 2 ; b <=10 ; b++)
			{
				if(a[a1]%2==0)
				{
					System.out.println(a[a1]+" is not a prime number");
					break;
				}
				else
				{
					System.out.println(a[a1]+" is a prime number");
					break;
				}
				
			}
		}
	}
}
