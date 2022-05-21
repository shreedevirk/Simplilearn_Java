package com.simplilearn.datatypedemo.package1;

class Bird extends Object
{
    //Properties
    String name;
    int cost;
    String color;
    String breed;
    public Bird() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Bird(String name) {
        super();
        this.name = name;
    }
    public Bird(String name,int cost) {
        super();
        this.name = name;
        this.cost = cost;
    }
    public Bird(String name, int cost, String color) {
        super();
        this.name = name;
        this.cost = cost;
        this.color = color;
    }
    public Bird(String name, int cost, String color,String breed) {
        super();
        this.name = name;
        this.cost = cost;
        this.color = color;
        this.breed = breed;
    }
    void run() {
        System.out.println("Dog runs");
    }
    void eat() {
        System.out.println("Dog eats");
    }
    void disp() {
        System.out.println(name);
        System.out.println(cost);
        System.out.println(color);
        System.out.println(breed);
    }
}
    public class LaunchBird {
        public static void main(String[] args) {
            Bird d1 = new Bird();
            d1.disp();
            System.out.println("-----------------");
            Bird d2 = new Bird("Pengwin");
            d2.disp();
            System.out.println("-----------------");
            Bird d3 = new Bird("Parrot",5000);
            d3.disp();
            System.out.println("-----------------");
            Bird d4 = new Bird("Crow", 7000, "white");
            d4.disp();
            System.out.println("-----------------");
            Bird d5 = new Bird("King Fisher", 8000, "Blue", "GR");
            d5.disp();
        }
    }


