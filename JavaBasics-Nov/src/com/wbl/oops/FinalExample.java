package com.wbl.oops;

//final class cannot be subclasses
public final class FinalExample {
	
	public final float PI;
	
	public FinalExample(){
		////final var can be given value in or before constructor.
		PI= 3.14f;
	}
	
	//final method cannot be overriden
	public final void test(){
		//final var cannot be reaasigned
		final int id =1;
	    
		System.out.println("Pi::"+PI);
	}
	
	public static void main(String args[]){
		FinalExample fe = new FinalExample();
		fe.test();
	}

}
