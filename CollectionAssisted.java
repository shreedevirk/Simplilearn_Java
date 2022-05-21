package com.simplilearn.datatypedemo.package1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

public class CollectionAssisted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arraylist for mixed data");
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Shree");
		al.add("$");
		al.add(1908.52);
		al.add("%");
		
		System.out.println(al);
		System.out.println("Array lost for specific data");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Bgm");
		city.add("hvr");
		
		System.out.println(city);
			
		System.out.println("Vector");
		Vector vec = new Vector();
		vec.addElement(15);
		vec.addElement(150);
		vec.addElement("srk");
		System.out.println(vec);
		
		System.out.println("LinedList");
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		list.add("15");
		list.add("150");
		list.add("srk");
		System.out.println(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Hashset");
		HashSet<Integer> hsh = new HashSet<Integer>()
				;
		hsh.add(15);
		hsh.add(150);
		hsh.add(200);
		System.out.println(hsh);
			
		

		
	}

}
