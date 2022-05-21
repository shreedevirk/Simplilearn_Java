package com.simplilearn.datatypedemo.package1;

	//blueprint of the object
	class Dog{
	    //properties of the dog
	    String name;
	    String color;
	    int cost;
	    String breed;
	    int age;
	    
	    //Behaviors of Dog
	    void eat() {
	        System.out.println("Dog eats");
	    }
	    
	    void run() {
	        System.out.println("Dog runs");
	    }
	    
	    void bark() {
	        System.out.println("Dog barks");
	    }
	} 
	public class Create_obj {
	    public void main(String[] args) {
	        Dog d = new Dog();
	        System.out.println("the address of the object d is "+d);
	        d.name = "Tommy";
	        d.color = "gold";
	        d.cost = 3000;
	        d.age = 2;
	        d.breed = "GR";
	        
	        System.out.println("Name of the dog is: "+d.name);
	        System.out.println("Color of the dog is: "+d.color);
	        System.out.println("Cost of the dog is: "+d.cost);
	        System.out.println("Age of the dog is: "+d.age);
	        System.out.println("Breed of the dog is: "+d.breed);
	        
	        d.eat();
	        d.run();
	        d.bark();
	        System.out.println("-------------------");

	    Dog d1 = new Dog();
	        System.out.println("the address of the object d1 is "+d1);
	        d1.name = "Rocky";
	        d1.color = "White";
	        d1.cost = 8000;
	        d1.age = 1;
	        d1.breed = "Pug";
	        
	        System.out.println("Name of the dog is: "+d1.name);
	        System.out.println("Color of the dog is: "+d1.color);
	        System.out.println("Cost of the dog is: "+d1.cost);
	        System.out.println("Age of the dog is: "+d1.age);
	        System.out.println("Breed of the dog is: "+d1.breed);
	        
	        d1.eat();
	        d1.run();
	        d1.bark();
	    }
	}
