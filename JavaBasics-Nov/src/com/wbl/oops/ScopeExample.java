package com.wbl.oops;

public class ScopeExample {
	
	public int id=1;//global scope
	
	
	public void test(){
		id=5;
		String name= "ahad";// local/method level scope
		{
			System.out.println(name);
			String name1="Savita";// block level scope
		}
		
		System.out.println("id::"+id);
	}
	
	public void test1(){
		System.out.println("id::"+id);
	}
	
	
	public static void main(String args[]){
		ScopeExample fe = new ScopeExample();
		fe.test();
		fe.test1();
		System.out.println(fe.id);
	}

}
