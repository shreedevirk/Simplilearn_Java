package com.simplilearn.datatypedemo.package1;

public class Doll_star {
	public static void main(String args[]){
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(i<=5 && j<=5) 
				{
					System.out.print("$");
					System.out.print(" ");
				}
				else
				{
					System.out.print("#");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
