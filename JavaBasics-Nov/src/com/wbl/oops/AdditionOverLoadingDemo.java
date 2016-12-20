package com.wbl.oops;

public class AdditionOverLoadingDemo {
	


	public static void main(String[] args) {
		
		Addition addObj = new Addition();
		System.out.println("result is ::"+addObj.add(5, 56));
		System.out.println("result is ::"+addObj.add(5, 56, 10));
		System.out.println("result is ::"+addObj.add(5, 56.78f));
		System.out.println("result is ::"+addObj.add(50.5f, 56.5f));

	}

}
