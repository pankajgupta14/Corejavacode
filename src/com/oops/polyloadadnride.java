package com.oops;

import java.util.Scanner;

public class polyloadadnride {

	void poly()
	{
		System.out.println("Polymorphism  IS AQUIRE BY 2 METHODS");
		System.out.println("1 ="+"Method overloading");
		System.out.println("2 ="+"Method overriding");
		System.out.println("ENTER TOPIC NAME YOU WANT LEARN");
		Scanner sc =new Scanner(System.in);
		int in2=sc.nextInt();
		polyloadadnride po1=new polyloadadnride();
		
		
		switch (in2) 
		{
		case 1: po1.load();
		break;
		case 2: po1.riding();
		break;
		
		default:System.out.println("PLEASE ENTER CORRECT NUMBER");
		}
	}
	
	void load()
	{
		System.out.println("in method overloading we can make a same name method with different paramter");
		System.out.println("like void m(),and void m2()");
		System.out.println();
	}
	
	void riding() 
	{
		System.out.println(" NOW WE LEARN ABAOUT OVER RIDING");
		System.out.println(" IN METHOD OVERRIDING ISA-A RELATIONSHIP IS MUST");
		System.out.println("WE CAN ACHIVE OVERRIDING BY SAME NAME MEHTOD SAME PARAMETER BUT 1ST METHOD IN PARENT CLASS AND 2ND ONE IMPLEMEMNT IS CHILD CLASSS ");
	}
}
