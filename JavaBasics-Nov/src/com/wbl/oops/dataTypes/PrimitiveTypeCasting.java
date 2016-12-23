package com.wbl.oops.dataTypes;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
		
		 byte b=6;
		 short s=8;
		 int i = 67;
		 long l = 2372800;
		 float f= 56.7f;		 
		 double d = 346378.488;
		 
		 char c='B';
		 i = c;
		 System.out.println("char to int::"+i);
		 
		 //implicit cast or upcast
		 i = b;// lower range datatype to higher range datatype
		 b = (byte)i;//higher range to lower range - explicit or downcast
		 System.out.println("i:"+i);
		 System.out.println("b:"+b);
		 
		 i=s;
		 l=i;
		 i= (int)l;
		 f = i;
		 i = (int)f;//56.7 - 56
		 d= f;
		 f = (float)d;
		 
		 int idiv = 7/2;
		 System.out.println("quotient::"+idiv);
	}

}
