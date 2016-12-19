package com.wbl.oops;

public class AnimalDemo {

	public static void main(String[] args){
		//object/instance of class
		/*System.out.println("this is start of main method");
		Animal animalObj1 = new Animal();
		animalObj1.breed = "pug";
		animalObj1.setName("punto");
		animalObj1.color = "white";
		animalObj1.displayDetails();
		
		System.out.println("this is end of main method");
		animalObj1.eat();
		
		Animal animalObj2 = new Animal();
		animalObj2.breed = "labrador";
		animalObj2.setName("rexy");
		animalObj2.setColor("white");
		animalObj2.displayDetails();
		animalObj2.eat();*/
		/*
		Dog dog = new Dog();
		dog.breed = "labrador";
		dog.setName("bittu");
		dog.setColor("black");
		dog.displayDetails();
		dog.eat();
		dog.makeNoise();
		dog.features();*/
		


		Animal dog = new Dog();// implicit casting or upcasting
		dog.makeNoise();/*
		
		Dog dog1 = (Dog)new Animal();// explicit casting or downcating
		dog.makeNoise();*/
		
	}
	
	public void display(Animal animal){
		System.out.println(animal.color+animal.breed);
	}
	

	public Animal getAnimalObj(String animalName){
		if(animalName=="dog")
		   return new Dog();
		else if(animalName=="cat")
			return new Cat();
		else
			return new Animal();
	}
	

}
