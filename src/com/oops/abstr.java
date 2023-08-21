package com.oops;

abstract class abst1
{
	static {
		System.out.println("now we seee abstract  and this is abstract class  ");
		System.out.println("abstraction defination is hiding implementation and showing only functionlity");
		System.out.println("abstraction we use with class name then jvm knownthis is abstraction class");
		System.out.println("using this abstract we achive security");
		System.out.println("abstarction is give 0 to 100% security");
		System.out.println("let see how abstractio is achive");
		System.out.println();
	}
	
	{
		System.out.println("this is abstract class non--static block  ");
	}
	
	void see()
	{
		System.out.println("this is normal method");
	}
	
	 abstract void unseen();

}

public class abstr extends abst1 {
	
	static {
		System.out.println("this is child class");
	}
	
	{
		System.out.println("child class non static block");
	}

	@Override
	void unseen() {
		 System.out.println("this is abstract method its declare in parent and implement in child class ");		
	}
	
	void childm() {
		 System.out.println("this is abstract method its declare in parent and implement in child class ");		
	}
	
	
	void abstrmain ()
	{
		System.out.println("this is child class method");
		System.out.println("");
		System.out.println();
		System.out.println("here we making a child class object and holding in parent class variable");
		abst1 ab1=new abstr();
		System.out.println("abst1 ab1=new abstr();");
		System.out.println("calling parent class method");
		ab1.unseen();
		ab1.see();
		System.out.println("now we create child class object");
		abstr ab=new abstr();
		ab.childm();
	}

}
