package com.wbl.oops.dataTypes;

public class PrimitiveDataTypes {
	
	byte b;
	short s1;
	String greet;
	
	
	public void test(){
		 byte b=6;
		 short s=8;
		 int i = -67;
		 long l = 2372800;
		 float f= 56.7f;		 
		 double d = 346378.488;
		 boolean bool = true;
		 char ch = 'h';
		 
		//method var should be intialised before using the variable in method
		System.out.println("b:"+b);
		System.out.println("b:"+this.b);
		System.out.println("s:"+s);
		System.out.println("s1:"+s1);
		System.out.println("greet:"+greet);
	}
	
	public static void main(String args[]){
		PrimitiveDataTypes p = new PrimitiveDataTypes();
		p.test();
	}

}
