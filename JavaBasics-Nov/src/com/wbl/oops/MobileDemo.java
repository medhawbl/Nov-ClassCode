package com.wbl.oops;

public class MobileDemo {

	public static void main(String[] args) {
		
		AndroidMobile mobile = new AndroidMobile(5);//constructor is called
	 
		mobile.getVersion();
		
		
		
		//TypeCasting
		Mobile m1 = new Mobile();
		
		AndroidMobile a1 = new AndroidMobile();
		
		m1 = a1;// implicit casting or upcasting- child to parent

		
		Mobile m2 = new AndroidMobile();
		
		AndroidMobile a2 = new AndroidMobile();
		m2=a2;// implicit casting or upcasting- child to parent
		//AndrioidMobile is a Mobile
		a2=(AndroidMobile)m2;// explicit casting or downcasting- parent to child
		
		Mobile m3 = new Mobile();		
		AndroidMobile a3 = new AndroidMobile();
		m3=a3;// implicit casting or upcasting- child to parent
		//Mobile is a AndroidMobile-  wrong , Mobile can IOs or windows or any
		a3=(AndroidMobile)m3;//this is wrong bcz downcasting is done only when object satisfies is a relation	
		System.out.println(a3.toString());
		System.out.println(a3.hashCode());
	}

}
