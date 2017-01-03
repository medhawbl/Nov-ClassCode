package com.wbl.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("this is my thread::"+ this.getName());
		accountWithDraw();
	}
	
	
	public synchronized void accountWithDraw(){
		System.out.println("execution of account logic");
	}

}
