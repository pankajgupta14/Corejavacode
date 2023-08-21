package com.object;

public class airplane {
	final static String name ="kingfisheer";
	final static int price=4000;
	final int ll=2300;
	String day="mon to friday";
	
	static {
		System.out.println(name);
		System.out.println("tikect price :"+price);
	}
	
	{
		System.out.println("date schdeule "+day);
		this.fuel(3000);
		this.fly();
	}
	
	public static void main(String[] args) {
		airplane a=new airplane();
		
	}
	
	void fly()
	{
		System.out.println("fuel volume "+ll);
		System.out.println("fly in sky and ready to die");
	}
	
	
	int fuel(int l)
	{
		System.out.println(l);
		if(l<this.ll)
		{
			System.out.println("please fill more fuel");
		}
		else
		{
			System.out.println("ready to flight guys");
		}
		return l;
		
	}

}
