package com.simplilearn.datatypedemo.package1;

public class hollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5 || j==3) 
				{
					System.out.print("#");
					System.out.print(" ");
				}
				else {
					System.out.print(" ");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
