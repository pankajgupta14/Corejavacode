package com.oops;

public class staticc {
	
	static String a="static is load at classload time";
	String b=" non static is get memory at object creation ";
	
	static {
		System.out.println("static block"+a);
	}
	
	{
		System.out.println("non static block"+b);
	}
	
	 int f=st1();
	
	int  st1()
	{
		System.out.println("when we called any method in "
				+ "insance and local varaible its run");
		System.out.println("and its run step by step ");
		return 2;
		
	}
}
