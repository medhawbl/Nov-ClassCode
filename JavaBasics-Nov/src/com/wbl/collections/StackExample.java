package com.wbl.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();//LIFO
		//convert decimal to binary
		/*int i = 8;
		while(i>0){
		int rem = i%2;
		stack.push(rem);
		i=i/2;	
		}
		*/
		
		stack.push(456);
		stack.push(56);
		stack.push(56);
		stack.push(null);
		stack.push(467);
		Iterator<Integer> itr = stack.iterator();
		while(itr.hasNext()){
			System.out.println(stack.pop());//LIFO principle
		}
	}

}
