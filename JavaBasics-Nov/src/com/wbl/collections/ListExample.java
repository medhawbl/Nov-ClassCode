package com.wbl.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
	
	public void listBasics(){
		
		List<String> firstList = new ArrayList<String>();
		
		firstList.add("one");
		firstList.add("two");
		firstList.add("abc");
		firstList.add("abc");
		firstList.add(null);
		firstList.add(null);
		
		for(int i=0;i<firstList.size(); i++){
			System.out.println(firstList.get(i));
		}
		
		for(String fl: firstList){
			System.out.println(fl);
		}
		
		Iterator<String> itr = firstList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	
	public void list2(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(55);
		list.add(35);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(45);
		list2.add(55);
		list.add(4, 879898);
		list.addAll(list2);
		System.out.println("size of arraylist::"+list.size());
		
		if(list.contains(55)){
			System.out.println(list.remove(new Integer(55)));
		}
		
		System.out.println("size after removing the data:"+list.size());
		
	}
	
	public void vectorExample(){
		Vector<String> vector = new Vector<String>(5, 3);
		System.out.println("capacity intially::"+vector.capacity());
		vector.add("one1");
		vector.add("one2");
		vector.add("one3");
		vector.add("one4");
		vector.add("one5");
		vector.add("one6");
		vector.add("one7");
		vector.add("one8");
		vector.add("one9");
		vector.add("one10");
		vector.add("one11");
		vector.add("one12");
		System.out.println("capacity at the end::"+vector.capacity());
		for(String vec : vector){
			System.out.println(vec);
		}
	}
	
	public void linkedListExample(){
		LinkedList<String> firstList = new LinkedList<String>();
		
		firstList.add("one");
		firstList.add("two");
		firstList.add("abc");
		firstList.add("abc");
		firstList.add(null);
		firstList.add(null);
		
		for(int i=0;i<firstList.size(); i++){
			System.out.println(firstList.get(i));
		}
		System.out.println("peek gives head element:"+firstList.peek());
		System.out.println("poll gives and removes head element:"+firstList.poll());
		System.out.println("size after pol:"+firstList.size());
		
	}

	public static void main(String[] args) {
		ListExample le = new ListExample();
		le.linkedListExample();

	}

}
