package com.learn.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Collection<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(40);
		list.add(null);

		System.out.println("ArrayList : "+list);
		list.remove(2);
		System.out.println("ArrayList : "+list);
		list.remove(2);
		System.out.println("ArrayList : "+list);
		
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(11);
		list1.add(25);
		list1.add(10);
		list1.add(30);
		list1.add(null);

		System.out.println("List : "+list1);
		list1.remove(2);
		System.out.println("List : "+list1);
		list1.remove(2);
		System.out.println("List : "+list1);
		list1.add(0, 50);
		System.out.println("List add: "+list1);
		list1.set(0, 13);
		System.out.println("List Set: "+list1);
		
		list.removeAll(list1);
		System.out.println("List RemoveAll: "+list);
		
		list.retainAll(list1);
		System.out.println("List RetainAll : "+list);
		
		list.addAll(list1);
		System.out.println("List AddAll: "+list);
		
		System.out.println("Contains 11: "+list1.contains(11));
		System.out.println("IndexOf 11: "+list1.indexOf(11));
		System.out.println("Last IndexOf 11: "+list1.lastIndexOf(11));
		
		System.out.println(list1);
		List<Integer> list2 = list1.subList(2, 3);
		System.out.println(list2);
		list2.set(0, 6);
		System.out.println(list1);
		list2.add(0, 7);	
		System.out.println(list1);
		
		for(int element : list2){
			System.out.println("Element: "+ element);
		}
		
	}
	
	

}
