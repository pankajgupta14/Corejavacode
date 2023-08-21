package com.logic;

public class evenoffarray {

	public static void main(String[] args) {
		
		int a []= {2,4,4,2,1,6,321,23,4,6,7,8,9,6,42,1,1,2,4,56,};
		int i=0;
		for(i=0;i<=a.length-1;i++)
			if(a[i]%2==0)
			{
				System.out.println("number is even :"+a[i]);
			}
			else
				System.out.println("number is odd :"+a[i]);
	}
}
