package com.wbl.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	
	public void mapBasics(){
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(3634300, "Sunil");
		map.put(106, "ahad");
		map.put(1546505, "harini");
		map.put(106, "harsha");
		map.put(1056878, "sudeer");
		map.put(null, "sudeer");
		map.put(289392183, "sudeer");
		
		/*
		for(Map.Entry<Integer, String>  mapEntry :  map.entrySet()){
			System.out.println("key::"+mapEntry.getKey() + "::value::"+ mapEntry.getValue());
		}*/
		
		Set<Integer> keys = map.keySet();
		for(Integer key: keys){
			System.out.println("key::"+key + "::value::"+ map.get(key));
		}
		
		//System.out.println(map.get(new Integer(106)));
		
		Map<Student,Integer> map1 = new HashMap<Student,Integer>();
		Student s1 = new Student(1,"rohan");//643847
		System.out.println(s1.hashCode());
		Student s2 = new Student(2,"hema");		
		map1.put(s1, 500);
		map1.put(s2, 600);
		
		Student key = new Student(1,"rohan");//373879
		System.out.println(key.hashCode()+ ":"+s1.equals(key));
		System.out.println(map1.get(key));//500
	}
	
	public void hashTable(){
		Map<Integer,String> map = new Hashtable<Integer,String>();
		map.put(3634300, "Sunil");
		map.put(106, "ahad");
		map.put(1546505, "harini");
		map.put(106, "harsha");
		map.put(1056878, "sudeer");
		map.put(289392183, "sudeer");
		Set<Integer> keys = map.keySet();
		for(Integer key: keys){
			System.out.println("key::"+key + "::value::"+ map.get(key));
		}
	}
	
	public void linkedHashMap(){
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(3634300, "Sunil");
		map.put(106, "ahad");
		map.put(1546505, "harini");
		map.put(106, "harsha");
		map.put(1056878, "sudeer");
		map.put(null, "sudeer");
		map.put(289392183, "sudeer");
		
		
		for(Map.Entry<Integer, String>  mapEntry :  map.entrySet()){
			System.out.println("key::"+mapEntry.getKey() + "::value::"+ mapEntry.getValue());
		}
		
		
	}
	
	public void treeMap(){
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(3634300, "Sunil");
		map.put(106, "ahad");
		map.put(1546505, "harini");
		map.put(106, "harsha");
		map.put(1056878, "sudeer");
		//map.put(null, "sudeer");//null is not allowed in tree map
		map.put(289392183, "sudeer");
		
		
		/*for(Map.Entry<Integer, String>  mapEntry :  map.entrySet()){
			System.out.println("key::"+mapEntry.getKey() + "::value::"+ mapEntry.getValue());
		}*/
		
		Set<Integer> keys = map.keySet();
		for(Integer key: keys){
			System.out.println("key::"+key + "::value::"+ map.get(key));
		}
		
		
	}
	
	
	public void treeMapWithStudentObjects(){
		Map<Student,Integer> map1 = new TreeMap<Student,Integer>(new StudentComparator());
		Student s1 = new Student(1233849398,"rohan");//643847
		Student s2 = new Student(2362223,"hema");	
		Student s3 = new Student(13212412,"ahad");	
		Student s4 = new Student(34325232,"beena");		
		map1.put(s1, 500);
		map1.put(s2, 600);
		map1.put(s3, 454);
		map1.put(s4, 567);
		
		Set<Student> keys = map1.keySet();
		for(Student key: keys){
			System.out.println("key::id:"+key.id +":name:"+key.name+ "::value::"+ map1.get(key));
		}
	}
	
	public static void main(String args[]){
		MapExample mp = new MapExample();
		mp.hashTable();
	}

}
