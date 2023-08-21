package com.object;

abstract class fany
{
	static final String brand="usha";
	int price=1200;
	static 
	{
		System.out.println(brand);
	}
	
	{
		System.out.println(price);
	}	
	void rpm()
	{
		System.out.println("this fan support 3600 rpm and enough for cool ");
	}	
	abstract void cool();
	fany ()
	{
		System.out.println("helllo fan lover ");
		this.rpm();
		this.cool();
	}
}
public class fan extends fany{

	@Override
	void cool() {
		// TODO Auto-generated method stub
		System.out.println("hawa hawaii");
	}
	
	
	public static void main(String[] args) {
		fan f=new fan();
	}

}
