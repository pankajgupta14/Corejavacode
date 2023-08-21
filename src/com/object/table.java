package com.object;

public class table {
	String table="ikea";
	int price=3000;
	final int  height=12;
	final int width=34;
	
	static {
		table t=new table();
		System.out.println("table property : name "+t.table+" price "+t.price+" height "+t.height+" width "+t.width);
	}
	
	{
		System.out.println("property is given in starting");
	}
	public table() {
		 System.out.println("table constructor");
	}
	
	public static void main(String[] args) 
	{
		table obj=new table();
	}
	
	void place()
	{
		System.out.println("tbale place ");
	}
	
}
