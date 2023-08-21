package com.logic;

public class rectangle {
	public static void main(String[] args) {
//		
//		System.out.println("ENTER HOW MANY * NEED PLEASE INPUT NUMBER");
//		Scanner sc=new Scanner(System.in);
//		int num= sc.nextInt();
		int i,j,num=15;
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=num;j++) {			
				if(j==1||j==8||j==15||i==1||i==8||i==15)
				{
					 
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}	
			System.out.println();
		}
			
	}

}
