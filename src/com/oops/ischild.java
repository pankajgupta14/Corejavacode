package com.oops;

public class ischild extends isparent {

	static {
		System.out.println("we can call parent method by child object"); 
	}
	
	void overrid()
	{
		System.out.println("child class for overriding");
	}
	
	void isa()
	{
		System.out.println("now creating child class object and calling parent class method");
		ischild is1=new ischild();
		System.out.println("ischild is1=new ischild();");
		System.out.println();
		is1.p1();
		is1.p1(5);
		System.out.println("");
		is1.overrid();
		System.out.println();
		isparent p1=new isparent();
		p1.overrid();
	}
}
