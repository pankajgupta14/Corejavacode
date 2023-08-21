package com.logic;

import java.util.Scanner;

import com.oops.main;

public class autmorphic {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Automorphic mean if u enter any number after multiplication last number is given no.");
		System.out.println("lets start the game ");
		System.out.println("enter rondom number");
		int n=obj.nextInt();
		
		int multi=n*n;
		int r=0,rem=0;
		for(int i=1;i<2;i++)
		{
			r=multi%100;
			//System.out.println("r"+r);
			rem=(rem*10)+r;
			//System.out.println("rem"+rem);
			multi=multi/10;
			//System.out.println("multi"+multi);
		}
		if(rem==n)
		{
			System.out.println("number is automorphic");
		}
		else
			System.out.println("number is not automorphic");
		
	}
}
