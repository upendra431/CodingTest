package com.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoDebugg {

	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(2);
		
		for(Integer num:list)
		{
			System.out.println(num);
		}
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		list.forEach(i->{
			System.out.println(i);
		});
		List<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(9);
		list1.add(2);
		list.addAll(list1);
		list.forEach(i->{
			System.out.println(i);
		});
		
		

	}

}
