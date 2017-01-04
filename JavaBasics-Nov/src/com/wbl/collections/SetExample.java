package com.wbl.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	
	public void setBasics(){		
		
		Set<String> firstSet = new HashSet<String>();
		firstSet.add("one");
		firstSet.add("abc");
		firstSet.add("hello");
		firstSet.add("cat");
		firstSet.add("doll");
		firstSet.add("cat");
		firstSet.add("cat");
		firstSet.add(null);
		
		firstSet.remove("abc");
		
		for(String fs: firstSet){
			System.out.println(fs);
		}
		
	}
	
	public void linkedHashSetBasics(){		
		
		Set<String> firstSet = new LinkedHashSet<String>();
		firstSet.add("one");
		firstSet.add("abc");
		firstSet.add("hello");
		firstSet.add("cat");
		firstSet.add("doll");
		firstSet.add("cat");
		firstSet.add("cat");
		firstSet.add(null);
		
		for(String fs: firstSet){
			System.out.println(fs);
		}
		
	}	
	
	public void treeSetBasics(){		
		
		Set<String> firstSet = new TreeSet<String>();
		firstSet.add("one");
		firstSet.add("abc");
		firstSet.add("hello");
		firstSet.add("cat");
		firstSet.add("doll");
		firstSet.add("cat");
		firstSet.add("cat");
		
		for(String fs: firstSet){
			System.out.println(fs);
		}
		
	}	
	
	public void setHashCodeImp(){
		Set<Student> set = new HashSet<Student>();
		Student s1 = new Student(1,"rohan");
		Student s2 = new Student(1,"rohan");		
		
		
		if(s1.equals(s2)){
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		set.add(s1);
		set.add(s2);
		
		System.out.println("size of set::"+ set.size());
		for(Student std : set){
			System.out.println(std.id +"::"+std.name+"::" +std.hashCode());
		}
	}
	
	
	public static void main(String[] args) {
		SetExample se = new SetExample();
		se.setHashCodeImp();
		
		
	}

}
