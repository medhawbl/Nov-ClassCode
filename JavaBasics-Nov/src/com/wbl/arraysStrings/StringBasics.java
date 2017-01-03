package com.wbl.arraysStrings;

public class StringBasics {

	
	public void stringBasics(){
		/*String str = new String("hello");//string object is immutable
		String str1 = new String("hello");// it creates another string object with hello
		String str1 = str.concat("world");
		System.out.println(str);
		System.out.println(str1);
		
		String s = "hello";//String literals
		String s1 = "hello";//it just points s1 to prev hello object
		
		s.concat("world");
		System.out.println(s);
		
		*/
		/*
		String s1 = new String("java");
		String s2 = new String("java");
		
		if(s1.equals(s2)){
			System.out.println("Both are equal");
		}else{
			System.out.println("Both are not equal");
		}*/

		String s1 = "java";
		String s2 = "java";
		
		if(s1==s2){
			System.out.println("Both are equal");
		}else{
			System.out.println("Both are not equal");
		}
	}
	
	public void stringMethods(){
		String greet = "hello Java";
		char[] chars = greet.toCharArray();
		for(char ch : chars){
			System.out.println(ch);
		}
		
		System.out.println("length of string:"+greet.length());
		System.out.println("sub string :"+ greet.substring(6, 10));// start index, end index
		System.out.println("sub string :"+ greet.substring(4));// start index
		
		System.out.println("Char At :"+ greet.charAt(2));// charcter at goiven postion
		
		String s1 = "  hi   ";
		System.out.println("s1 length:"+s1.length());
		s1 = s1.trim();
		System.out.println("After trim- s1 length:"+s1.length());
		
		String s2= "apple";
		String s3= "ball";
		System.out.println("s1 compare s2::"+s3.compareTo(s2));// lexographic comaprision
		
		System.out.println("position of char:"+s3.indexOf('l'));// position of given character
		
		System.out.println("replace:"+ s3.replace('b', 'h'));
		
		
		
		//String to integer and integer to string
		
	}
	
	public void stringBufferAndStringBuilder(){
		StringBuffer sb = new StringBuffer("today");
		sb.append(" class");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("today");
		sb1.append(" class");
		System.out.println(sb1);
	}
	
	public String reverseString(String input){
		StringBuilder sb = new StringBuilder();
		for(int i = input.length()-1; i>=0; i--){
			sb.append(input.charAt(i));
		}
		return sb.toString();
	}
	
	
	public void fileNameAndExtension(String input){
		//inut = c:/usr/home/java.docx
		int slashLastIndex = input.lastIndexOf('/');
		int dotIndex= input.lastIndexOf('.');
		
		String fileName = input.substring(slashLastIndex+1, dotIndex);
		String extn = input.substring(dotIndex+1);
		System.out.println("fileName:"+fileName);
		System.out.println("extn:"+extn);
		
		System.out.println(input.toString());
		System.out.println(input.hashCode());
		
	}
	
	public static void main(String[] args) {
		StringBasics sb = new StringBasics();
		sb.fileNameAndExtension("c:/usr/home/java.docx");
        System.out.println("reverse of string is "+sb.reverseString("technology"));
	}

}
