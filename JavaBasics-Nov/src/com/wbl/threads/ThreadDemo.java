package com.wbl.threads;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th = new MyThread();
		th.start();// start wil invoke run method
		
		MyThread th1 = new MyThread();
		th1.start();

	}

}
