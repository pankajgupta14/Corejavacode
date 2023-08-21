package com.logic;

import java.util.Scanner;

public class math2550 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" ENETER YOUR AMOUNT");
		int a=sc.nextInt();
		
//		System.out.println("WHICH NOTE YOU WANT PLEASE ENTER");
//		double b=sc.nextDouble();
//		double c =a/b;
//		System.out.println("THE "+b+" NO NOTE / COIN IS  :"+c);
		int c=0;
		System.out.println("2000 ki note   "+ a/2000);
		System.out.println("500 ki note   "+ a/500);
		System.out.println("100 ki note   "+ a/100);
		System.out.println("50 ki note   "+ a/50);
		System.out.println("20 ki note   "+ a/20);
		System.out.println("10 ki note   "+ a/10);
		System.out.println("5 ki note   "+ a/5);

	}
}
