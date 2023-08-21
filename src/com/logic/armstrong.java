package com.logic;
import java.util.Scanner;
//153: 1**3 + 5**3 + 3**3 = 1 + 125+ 27 = 153

public class armstrong {

	public static void main(String[] args) {
		
		System.out.println("ENTER FACTORIAL NUMBER");
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		int arm,rem=0,sum=0,bal ;
		arm=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=(rem*rem*rem)+sum;
			num=num/10;
		}
		System.out.println("armStrong number "+sum);
//		if(arm==num)
//		{
//			System.out.println("number is armstrng number");
//		}
//		else
//		{
//			System.out.println("number is not armstrong number");
//		}
//		
	}
}
