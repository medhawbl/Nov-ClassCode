package com.wbl.opertorsLoops;

public class Loops {
	
	public void printMathsTable(int input, int end){
		
		int i=1;
		while(i>0 && i<10){
			System.out.println(i);
			i++;// i=i+1
		}
		
		/*int i=1;
		while(i>0){
			System.out.println(input+" * "+i+" = "+(input*i));
			i++;
		}*/
		/*
		select * from employees whose sal >10000- 15 rows
		while(rs.hasNext()){
			//do some logic
			rs.next();
		}*/
		
	}
	
	public void doWhile(){
		
		int i=1;
		do{
			//System.out.println("this do block executes atleast once even when while condition fails");
			System.out.println(i);
			i++;// i=i+1
		}while(i<10);
		
	}
	
	 public void forLoop(){
		/*int i;
		for(i=1; i<=10;i++){
			System.out.println(i);
			if(i%2==0){
				System.out.println("there is an even number in this loop:"+i);
				break;
			}
			System.out.println("end on for iteration");
		}
		System.out.println("end of for loop");*/
		 
		 int i;
			for(i=1; i<=10;i++){
				System.out.println(i);
				if(i%2!=0){
					continue;
				}
				System.out.println("there is an even number in this loop:"+i);
				System.out.println("end on for iteration");
			}
			System.out.println("end of for loop");
		
		// enhanced for loop
		String[] strArr = {"sanita", "blessy","kavitha"};
		for(String str : strArr){
			System.out.println(str);
		}
		
	}
	 
	 public void printStars(int input){		 
		 
		 for(int i=1; i<=input ; i++){
			 for(int j=1; j<=i; j++){
			   System.out.print("*");
			 }
			 System.out.println();
		 }
		 
	 }

	public static void main(String[] args) {
		Loops l = new Loops();
		//l.printMathsTable(9,20);
		//l.doWhile();
		l.forLoop();
		//l.printStars(5);
	}

}
