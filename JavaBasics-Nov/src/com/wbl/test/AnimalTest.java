package com.wbl.test;

import com.wbl.oops.Animal;

public class AnimalTest {

	public static void main(String[] args){
		//object/instance of class
		Animal animalObj1 = new Animal();
		//animalObj1.breed = "pug";
		animalObj1.setName("punto");
		animalObj1.color = "white";
		animalObj1.displayDetails();
		animalObj1.eat();
		
		Animal animalObj2 = new Animal();
		//animalObj2.breed = "labrador";
		animalObj2.setName("rexy");
		animalObj2.setColor("white");
		animalObj2.displayDetails();
		animalObj2.eat();
		
	}
	
}
