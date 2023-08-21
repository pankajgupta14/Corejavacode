package com.oops;

import java.util.Scanner;

public class oops 
{
 
	void oop()
	{
		//System.out.println();
		oops op1=new oops(); 
		System.out.println("OBJECT ORIENTED PROGARMMING LANGUAGEN");
		System.out.println("FOUR MAIN PILLARS FOR OOPS GIVEN BELOW");
		System.out.println("1 = "+"INHERITANCE");
		System.out.println("2 = "+"POLYMORPHISM");
		System.out.println("3 = "+"ABSTARCTION");
		System.out.println("4 = "+"ENACAPSULATION");
		
		// NEED TOPIC THEN ENTER NUMBER
		System.out.println();
		System.out.println("SELECT TOPIC AND ENTER TOPIC NUMBER WHICH ONE YOU WANT TO LEARN");
		Scanner sc =new Scanner(System.in);
		int in1=sc.nextInt();
		 
		switch (in1) 
		{
		case 1: op1.inhertance();
		break;
		case 2: op1.polymor();
		break;
		case 3: op1.Abst();
		break;
		case 4: op1.Encapsulationnn();
		break;
		
		default:System.out.println(" ENTER NEW  NUMBER");
		
		}
	}
	
	 
	
	void inhertance() 
	{
		System.out.println("NOW WE LEARN ABOUT INHERITANCE");
		inheritan in4=new inheritan();
		in4.inheri();
		
	}
	
	void polymor()
	{
		System.out.println();
		System.out.println("TODAY WE WILL LEARN ABOUT POLYMORPHISM");	
		System.out.println();
		polyloadadnride p=new polyloadadnride();
		p.poly();
	}
	
	void Abst()
	{
		System.out.println("NOW WE LEARN ABOUT ABSTRACTION ");
		System.out.println("");
		abstr ab2= new abstr();
		ab2.abstrmain();
	}
	
	void Encapsulationnn()
	{
		System.out.println("sorry for delay guys");
		//System.out.println("now we learn about encapsulation");
		Encapsulationn en=new Encapsulationn();
		en.encap();
	}
}
