package com.collectionproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class collectionmain {
	
	public static void main(String[] args) {
		
//		System.out.println("TODAY WE WILL LEARN COLLECTION TOPIC ADN MAKINGA CODE ");
//		System.out.println();
//		System.out.println("FIRST WE KNOW IN ARRAY LIST WE CAN DO STORE DUPLICATE VALUE AND AND NLL VALUE ALSO");
//		System.out.println("AND ARRAYLIST IS MAINY USE FOR INSERTION AND RANDOM ACCESSS MEMMORY");
//		System.out.println("ENTER NUMBER FOR STRORING IN ARRAY LIST ");
		Scanner sc=new Scanner(System.in);
//		ArrayList al= new ArrayList();
//		for(int i=1;i<6;i++)
//		{
//			String a=sc.nextLine();
//	     	System.out.println(al.add(a));
//		}
//		System.out.println(al);
//		System.out.println();
//		System.out.println(al.toArray());
//		System.out.println("size of array "+al.size());
//		
//		Collections.sort(al);
//		//for(String st1:al)
//		
//		System.out.println(al);
//		
//		al.add("pankaj");
//		al.set(0, "arraylistttt");
//		
//		System.out.println(al);
//		
//		al.add("");
//		al.add("");
//		System.out.println(al);
//		System.out.println("leet seee");
//		System.out.println(al.get(4));
		
		System.out.println("now we see linked list");
		System.out.println("this is mainly use for insertion and deletion");
		System.out.println("lets tryt this is all the fucnttion");
		
		LinkedList ll=new LinkedList();
		System.out.println("enter a linked list number ");
		for(int i=1;i<5;i++)
		{
			String st=sc.next();
			System.out.println(ll.add(st));
		}
		System.out.println("hash code of ll"+ll.hashCode());
		System.out.println(ll);
		
		ll.add( "Gopiganj");
		ll.add(2332);
		ll.add(2332);
		ll.add(2332);
		ll.add(2332);
		ll.add(2332);
		ll.add(2332);
		
		System.out.println(ll);
		ll.add(0, "panjkaj");
		
	//	Collections.sort(ll);
		System.out.println(ll);
		System.out.println();
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
