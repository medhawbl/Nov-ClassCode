package com.wbl.main;

public class PrimeNumber {

	public boolean isPrime(int input) {
		System.out.println("in prime method");
		if(input==1){
			return false;
		}
		
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}

}
