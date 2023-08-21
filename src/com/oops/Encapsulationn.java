package com.oops;

import com.logic.primee;

public class Encapsulationn {
	
	private int id;
	private String name;

	public void  encap() {
		
		System.out.println("TODAY WE WILL LEARN ABOUT ENCAPSULATION");
		System.out.println("Encapsulation is defined is process of binding code and datd in single unit is called Encapsulation");
		System.out.println("here we make data member is private and pass vlaue by getter and setter method");
		System.out.println("in etter mehtod we pass a value and setter take output");
		System.out.println("");
		
		encapumethod();
		
		
	}
	
	void encapumethod()
	{
		System.out.println("IN THIS MEHTOD WE USE ENCAPSULATION  ");
		System.out.println("1st we make data member as private");
		System.out.println("her ewe use data member as private in other method");
		System.out.println("here we use data member as instance and private");
		System.out.println();
		System.out.println("now we calling setter method for set value ");
		System.out.println("void set(int id, String name)");
		set(23244, "Pankaj");
		System.out.println("set(23244, \"Pankaj\");");
		System.out.println("now vlaue is set");
		System.out.println();
		System.out.println("now we use getter method to Print  value ");
		System.err.println("get();");
		get();
	}
	
	void set(int id, String name)
	{
	this.id=id;
	this.name=name;
	}
	
	String get()
	{
		System.out.println("id "+id+" name "+name);
		System.out.println();
		return "p";
	}
	
	
}
