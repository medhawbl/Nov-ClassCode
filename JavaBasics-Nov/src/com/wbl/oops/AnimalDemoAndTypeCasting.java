package com.wbl.oops;

public class AnimalDemoAndTypeCasting {

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
		

/*
		Animal dog = new Dog();
		dog.makeNoise();
		*/
		//TypeCasting 
		Dog d1 = new Dog();		
		Animal a1 = d1;// implicit casting or upcasting
		a1.makeNoise();
		
		Animal a2 = new Dog();
		Dog d2 = (Dog)a2;//// explicit casting or downcasting
		d2.makeNoise();
		
		Animal a3 = new Animal();
		Dog d3 = (Dog)a3; //fails at runtime- cannot assign parent class object to child class reference
		d3.makeNoise();
		
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
