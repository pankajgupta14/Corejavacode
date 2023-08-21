package com.object;

public class charger {
	
	final String name="one plus";
	static int price = 2000;
	String colour = "white";
	
	{
		System.out.println(name);
	}
	static {
		System.out.println(price);
	}
	 void charging()
	 {
		 System.out.println("charging phone ");
	 }
	
	public static void main(String[] args) {
	charger ob=new  charger();
	System.out.println(ob.colour);
	ob.charging();
	ob.support(32);
	}
	
	void support(int a)
	{
		if(a==65)
		{
			System.out.println("phone is secure");
		}
		else
		{
			System.out.println("please connect less watt charger");
		}
	}
}
