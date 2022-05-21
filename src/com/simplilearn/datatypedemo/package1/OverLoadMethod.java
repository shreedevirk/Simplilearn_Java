package com.simplilearn.datatypedemo.package1;

public class OverLoadMethod {
	// It means a method can have same name,same return_type, same access modifier, same number of parameter
	    // But it must have the parameters in different order 
	    public void area(int b,int h)
	    {
	        System.out.println("Area of Triangle : "+(0.5*b*h));
	    }
	    public void area(float b,int h)
	    {
	        System.out.println("Area of Triangle : "+(0.5*b*h));
	    }
	    public void area(int b,float h)
	    {
	        System.out.println("Area of Triangle : "+(0.5*b*h));
	    }
	    public void area(int r) 
	    {
	        System.out.println("Area of Circle : "+(3.14*r*r));
	    }
	    public static void main(String args[])
	    {
	        OverLoadMethod ob=new OverLoadMethod();
	        ob.area(10,12);
	        ob.area(5);  
	    }
	}

