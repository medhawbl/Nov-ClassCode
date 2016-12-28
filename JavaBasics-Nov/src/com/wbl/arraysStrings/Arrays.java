package com.wbl.arraysStrings;

import com.wbl.oops.Mobile;

public class Arrays {
	
	
	public void arrays(){
		//method -1
		//declaration of arrays and creating the array object
		int[] studentIds = new int[5];
		
		//assign data to array
		studentIds[0]= 100;
		studentIds[1]= 101;
		studentIds[2]= 102;
		studentIds[3]= 103;
		studentIds[4]= 104;
		
		//iterate array data
		for(int i=0; i<studentIds.length ; i++){
			System.out.println("doing logic on array data::"+studentIds[i]);
		}
		
		//method 2
		int[] empIds = {23,24,25,26,28};// declaration and initialisation
		//iterate array data
		for(int i=0; i<empIds.length ; i++){
			System.out.println("emp id::"+empIds[i]);
		}
		
		//method 3 - anonymous array 
		int[] ids = new int[]{45,47,49,51,53};// declaration and initialisation
		//iterate array data- by enhanced for loop
		for(int myId : ids){
			System.out.println("id::"+myId);
		}
		
		//string array
		String[] strArr = {"sanita", "blessy","kavitha"};
		for(String str: strArr){
			System.out.println(str);
		}
		
		//USerDefinedObject array
		Mobile[] mobiles = new Mobile[3];
		Mobile m1 = new Mobile();
		m1.version=5;
		m1.name="samsung";
		
		Mobile m2 = new Mobile();
		m2.version=7;
		m2.name="apple";
		
		Mobile m3 = new Mobile();
		m3.version=6;
		m3.name="nexus";
		
		mobiles[0]= m1;
		mobiles[1]= m2;
		mobiles[2]= m3;
		
		for(Mobile mob : mobiles){
			System.out.println(mob.name + "::"+mob.version);
		}
		
		
	}
	
	public void twoDimensionalArray(){
		
		int[][] codes = new int[2][3];
		
		
		codes[0][0] = 10;
		codes[0][1] = 20;
		codes[0][2] = 30;
		
		codes[1][0] = 40;
		codes[1][1] = 50;
		
		//for loop

		int[][] codes1 = {{10,20,30},{40,50}};
		
		for(int i =0; i<codes.length;i++){
			for(int j=0;j<codes[i].length;j++){
				System.out.println(codes[i][j]);
			}
		}
		
	}

	public static void main(String[] args) {
		Arrays arr = new Arrays();
		//arr.arrays();
		arr.twoDimensionalArray();
	}

}
