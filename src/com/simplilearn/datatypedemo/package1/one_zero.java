package com.simplilearn.datatypedemo.package1;

public class one_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || i==3)
				{
					System.out.print("1");
					System.out.print(" ");
				}
				if(i==2 || i==4)
				{
					System.out.print("0");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
