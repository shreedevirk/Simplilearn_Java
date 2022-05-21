package com.simplilearn.datatypedemo.package1;

public class Down_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(count);
				System.out.print("	");
				count++;
			}
			System.out.println();
		}
	}
}
