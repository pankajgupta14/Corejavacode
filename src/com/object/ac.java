package com.object;

abstract class bac

	{
		static final String brand="blue star";
		int price=12200;
		static 
		{
			System.out.println(brand);
		}
		
		{
			System.out.println(price);
		}	
		void rpm(int w)
		{
			System.out.println("this fan support "+w+" rpm and enough for cool ");
		}	
		
		abstract void cool();
		bac()
		{
			System.out.println("helllo fan lover ");
			this.rpm(23044);
			this.cool();
		}
	}


public class ac extends bac {

	@Override
	void cool() {
		// TODO Auto-generated method stub
		System.out.println("this is ac bro always cooling ");
	}
	
	public static void main(String[] args) {
		ac ob=new ac();
	}	
}
