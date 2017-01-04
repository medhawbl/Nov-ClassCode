package com.wbl.collections;

public class Student {
	
	public int id;
	public String name;
	
	public Student(int id, String name){
		this.id = id;
		this.name= name;
	}
	
	@Override
	public int hashCode(){
		return id*7;
	}
	
	@Override
	public boolean equals(Object o1){
		boolean isEqual=false;
		if(o1 instanceof Student && ((Student)o1).id == this.id
				&& ((Student)o1).name == this.name){
			isEqual = true;
		}
		return isEqual;
	}

}
