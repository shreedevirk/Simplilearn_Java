package com.simplilearn.datatypedemo.package1;

public class Program9 {

	public static void main(String[] args) {
		int count=25;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++) 
			{
				if((count)<10) 
				{
					System.out.print("0");
					System.out.print(count);
					System.out.print(" ");
					count--;
				}
				else
				{
					System.out.print(count);
					System.out.print(" ");
					count--;
				}
			}
			System.out.println();
		}

	}

}
