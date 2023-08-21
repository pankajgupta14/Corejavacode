package com.oops;

import java.util.Scanner;

public class main {
	
	static String subject="java";
	float fees=40000.0f;
	
	public static void main(String[] args) {
		
		main m1=new main();  // main class object 
		
		Scanner sc =new Scanner(System.in);
		System.out.println("PLEASE ENETER YOUR NAME ");
		String Stuname=sc.nextLine();
		System.out.println("WHAT IS YOUR QUALIFICATION");
		String stucourse=sc.nextLine();
		System.out.println("COURSE NAME");
		System.out.println("1 "+"C");
		System.out.println("2 "+"C++");
		System.out.println("3 "+"JAVA");
		System.out.println("4 "+"PYTHON");
		System.out.println("5 "+"MYSQL");
		System.out.println("");
		System.out.println("ENTER  COURSE NUMBER YOU WANT TO LEARN");
		String coursenum1=sc.nextLine();
		
		int coursenum = Integer.parseInt(coursenum1);
		
		switch (coursenum)
		{
		case 1: System.out.println(" C THIS COURSE IS NOT AVAILBLE");
		break;
		case 2: System.out.println("C++ THIS COURSE IS NOT AVAILBLE");
		break;
		case 3: System.out.println("JAVA THIS COURSE IS AVAILBLE");
		break;
		case 4: System.out.println("PYTHON THIS COURSE IS NOT AVAILBLE");
		break;
		case 5: System.out.println("MYSQL THIS COURSE IS NOT AVAILBLE");
		break;
		
		default:
			throw new IllegalArgumentException("SORRY SIR "
					+ "  ONLY JAVA IS AVAILABLE PLEASE PRESS 3 FOR JAVA"+"");
		}
		
		//
		System.out.println("");
		// for static and non static 
		//System.out.println();
		
		// FOR JAVA REGISTRATION
		if(coursenum==3)
		{
			System.out.println(Stuname+"  CONGRATULATION YOU ARE SELECTED FOR JAVA COURSE");
			System.out.println("YOU ARE SELECTED FOR COURSE");
			System.out.println();
			//System.out.println("java material ");
			 //java material
			
			System.out.println("NOW WE START FROM OOPS AND STATIC AND OBJECT BASE");
			System.out.println();
			//System.out.println();
			System.out.println("TOPIC DETAILS");
			System.out.println();
			System.out.println("1 "+"== STATIC AND NON STATIC ");
			System.out.println("2 "+"== OOPS ");
			System.out.println("3 "+"== WRAPPER CLASS ");
			
			
			// all abaout topics
			System.out.println();
			System.out.println("ENTER NUMBER WHICH TOPIC YOU WANT TO LEARN");
			int topicint=sc.nextInt();
			System.out.println();
				switch (topicint)
				{
				case 1: m1.static1();
				break;
				case 2: m1.oopss();
				break;
				default:System.out.println("PLEASE ENTER CORRECT NUMBER");
			    }
		}
		 		
	}
	
	void static1()
	{
		staticc st=new staticc();
	    int d=st.f;
	}
	
	void oopss()
	{
		oops st1=new oops();
		st1.oop();
	}

}
