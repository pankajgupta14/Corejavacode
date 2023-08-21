package com.oops;

public class isparent {

	static {
		System.out.println(" HERE WE LEARN ABOUT ISA-A RELATIONSHIP");
		System.out.println("i am parent static block");
		System.out.println();
	}

	 {
		System.out.println("i am parent non-static block");
	}
	
	void p1() 
	{
		System.out.println("this is 1 part 1 over loading");
		System.out.println("void p1() ");
	}
	
	void p1(int a) {
		System.out.println("we can create same method name but diff parameter");
		System.out.println("void p1(int a)");
	}
	
	void overrid()
	{
		System.out.println("1st class for overriding");
	}
}
