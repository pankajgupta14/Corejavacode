package com.logic;

import java.util.Iterator;

public class arrayevenodd {
	
	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,6,7,8,9};
	
		for(int i=0;i<a.length;i++)
		{
			//int r=a[i];
			
			if(a[i]%2==0)
			{
				System.out.println(a[i]+"number is even");
			}
			else 
			{
				System.out.println(a[i]+"odd number");
			}
		}
	}

}
