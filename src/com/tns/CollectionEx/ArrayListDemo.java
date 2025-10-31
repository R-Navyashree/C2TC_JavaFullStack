package com.tns.CollectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//heterogenous elements
		List list1= new ArrayList();//dynamic binding
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.78);
		list1.add(20);
		list1.add('A');
		list1.add(5, "Hi");
		list1.add(20);
System.out.println("List is "+list1);
		System.out.println("Is list conatins 15? "+list1.contains(15));
		list1.remove(false);
		System.out.println(list1);
		System.out.println(list1.get(6));
		
		System.out.println("Element removed : "+list1.remove(list1));
list1.clear();
		System.out.println("List is "+list1);
		
		// Using Generic we can create Homogeneous List
		List<String> names= new ArrayList<String>();
		names.add("Amit");
		names.add("Sumit");
		names.add("Ankit");
		names.add("Rohit");
		names.add("Likshit");
//names.add(10);
		System.out.println("Name List is "+names);
		System.out.println("Is \'Ankit\' contains in name list? "+names.contains("Ankit"));
		Collections.reverse(names);
		//names.reverse();
		System.out.println("Reverse Name List is "+names);
		// Traversing a list
				System.out.println("--------------- Traversing a list ---------------");
		Iterator<String> i=names.iterator();
		while(i.hasNext())
		{
			String nm=i.next();
			System.out.println(nm);
			if(nm.equals("Ankit"))
				i.remove();
		}
		System.out.println("Name list is "+names);


	}
	

}
