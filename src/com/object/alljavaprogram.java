package com.object;

import com.oops.main;

public class alljavaprogram {

	static int a;  // static variable
	// varieble is defiend as the where we hold the value
	
	int b ;
	
	static {
		System.out.println( " this is static blockand its specail type of method ");
		a=12; // satic variable is intiliaze in static block
		System.out.println(a+"static varieble");
	}
	
	
	{
		System.out.println("when any iib created aaaaaaaat this time all na non instance varibke is intialize");
		b=23;  // non instance varible is intialize at iib time all the blockadn mehto dare intilize
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
	}

}
