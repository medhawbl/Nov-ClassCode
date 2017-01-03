package com.wbl.wrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {

	public static void main(String[] args) {
		int i = 30; // primitive int
		Integer i1 = 30; // wrapper class 
		Integer i3=i;// autoboxing
		
		String str = "30";
		int i2 = Integer.parseInt(str);
		
		System.out.println(Integer.toString(10));
		String str1 = i1.toString();
		
		Float f = new Float(56.5);
		Float f1 = 56.7f;
		
		float f2 = f;// autoboxing
		
		
		/*int j = 10;
		short s = 5;
		j = s;*/
		Integer j = 10;
		Short s = 5;
		//j = s; in wrapper class we cannot typecast between different datatypes
		
	/*	
		long h = 56;
		
		Long l = h;*/
		
		int h = 56;
		
		//Long l = h;// we cannot widen and box together
		
		int[] ints = new int[5];
		Integer[] ints1 = new Integer[5];
		
		
	}

}
