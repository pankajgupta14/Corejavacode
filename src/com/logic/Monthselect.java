package com.logic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Monthselect {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String[] a={"janurary","februray","march","april","may","june","july","august","september","october","november","december"};
		System.out.println("enter number");
		int n=sc.nextInt();
		
		for(int i=0;i<a.length;i++) 
		{
			String b=a[i];
			System.out.println(b);
		}
		
	}
}
