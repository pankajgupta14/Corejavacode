package com.logic;

public class Astar {
	public static void main(String[] args) {
	a();
	System.out.println("");
	b();
	System.out.println("");
	c();
	System.out.println("");
	d();
	System.out.println("");
	e();
	System.out.println("");
	f();
	System.out.println("");
	System.out.println("");
	g();
	System.out.println("");
	System.out.println("");
	h();
	System.out.println("");
	System.out.println("");
	i();
	System.out.println("");
	System.out.println("");
	i();
	System.out.println("");
	System.out.println("");
	j();
	System.out.println("");
	System.out.println("");
	k();
	
	}
	
	static void a()
	{
	int i,j,num=10;
		
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(j==1|| i==1|| j==10||i==10/2)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	static void b()
	{
		
	int i,j,num=10;
		
		for(i=1;i<=10;i++)
		{
		;	for(j=1;j<=10;j++)
			{
				if(j==1|| i==1|| j==10||i==10/2||i==10)
				{
					System.out.print("B");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	static void c()
	{
		
	int i,j,num=10;
		
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(j==1||i==1||i==10)
				{
					System.out.print("C");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	static void d()
	{
		
	int i,j,num=10;
		
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(j==1|| i==1||j==10||i==10)
				{
					System.out.print("D");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

	static void e()
	{
		
	int i,j,num=10;
		
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(j==1|| i==1||i==5||i==10)
				{
					System.out.print("E");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

	static void f()
	{
		
	int i,j,num=10;
		
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(j==1|| i==1||i==10/2)
				{
					System.out.print("F");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

	static void g()
	{
		
	int i,j,num=10;
		
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(j==1|| i==1||i==10||i==5&&j>=5||j==10&&i>=5)
				{
					System.out.print("G");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	static void h()
	{
		
	int i,j,num=10;
		
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(j==1|| j==10||i==5)
				{
					System.out.print("H");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	

	static void i()
	{
		
	int i,j,num=10;
		
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(i==1|| i==10||j==5)
				{
					System.out.print("I");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
		

	static void j()
	{
		
	int i,j,num=10;
		
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(i==1||j==8||i>=10&&j<=8||j==1&&i>=5)
				{
					System.out.print("H");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	static void k()
	{
		
	int i,j,num=10;
		
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(j==1)
				{
					System.out.print("H");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
