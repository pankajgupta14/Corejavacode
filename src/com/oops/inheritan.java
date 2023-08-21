package com.oops;

import java.util.Scanner;

public class inheritan {
	
	void inheri()
	{
		inheritan in3=new inheritan();
		System.out.println("INHERITANCE  IS AQUIRE BY 2 METHODS");
		System.out.println("1 ="+"ISA-A relationship");
		System.out.println("2 ="+"HAS-A relationship");
		System.out.println("ENTER TOPIC NAME YOU WMAT LEARN");
		Scanner sc =new Scanner(System.in);
		int in2=sc.nextInt();
		
		
		switch (in2) 
		{
		case 1: in3.is();
		break;
		
		default:System.out.println("PLEASE ENTER CORRECT NUMBER");
					}
	}
	
	void is()
	{
		ischild is3=new ischild();
		is3.isa();
	}
	
}
