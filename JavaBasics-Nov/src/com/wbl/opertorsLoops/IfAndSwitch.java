package com.wbl.opertorsLoops;

public class IfAndSwitch {
	
	
	public void multipleOfFive(int input){
		
		if(input%5==0){
			System.out.println(input+" is divisible by 5");
		}else{
			System.out.println("It is not divisible by 5");
		}
		
		System.out.println("end of program");
		
		
	}
	
	public void multipleOfThreeAndFive(int input){
		
		if(input%3==0 && input%5==0){
			System.out.println(input+" is divisible by  3 and 5");
		}else if(input%3==0){
			System.out.println(input+" is  divisible by 3");
		}else if(input%5==0){
			System.out.println(input+" is  divisible by 5");
		}else{
			System.out.println(input+" is not divisible by 3 or 5");
		}
		
		System.out.println("end of program");				
	}
	
	
	public void switchCase(int input){
		
		switch(input){
		    case 1 :
		    	System.out.println("It is monday");
		    	break;
		    case 2 :
		    	System.out.println("It is tuesday");
		    	break;
		    case 3 :
		    	System.out.println("It is wednesday");
		    	break;
		    case 4 :
		    	System.out.println("It is thursday");
		    	break;
		    case 5 :
		    	System.out.println("It is friday");
		    	break;
		    case 6 :
		    	System.out.println("It is saturday");
		    	break;
		    case 7 :
		    	System.out.println("It is sunday");
		    	break;
		    default:
		    	System.out.println("none of the conditions matched");
		}
		
		System.out.println("end of switch case...");
		
	}
	
	
	
	public static void main(String[] args){
		IfAndSwitch ifs = new IfAndSwitch();
		//ifs.multipleOfFive(51);
		//ifs.multipleOfThreeAndFive(56);
		ifs.switchCase(4);
	}

}
