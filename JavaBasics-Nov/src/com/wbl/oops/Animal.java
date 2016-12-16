package com.wbl.oops;

public class Animal{
	
	//properties - variables
		private String name;
		public String color;
		String breed;
		
	//default constructor
	public Animal(){
		System.out.println("In Constructor-This is first statement that gets executed for this class object");;
	}
	
	//parameterised constructor
	public Animal(String greet){
		System.out.println("Hello - " +greet);
	}
	
	//behaviour or actions - methods
	
	public void eat(){
		System.out.println("this is start of eat method");
		System.out.println("It eats food");
		System.out.println("this is end of eat method");
	}
	
	public void makeNoise(){
		System.out.println("It says bow");
	}
	
	public void setName(String inputName){
		name = inputName;
	}
	
	public void setColor(String inputColor){
		color = inputColor;
	}
	
	public void displayDetails(){
		System.out.println("this is start of display method");
		eat();
		System.out.println("Name is : "+ name);
		System.out.println("Color is : "+ color);
		System.out.println("Breed is : "+ breed);
		System.out.println("this is end of display method");
	}
	
	

}
