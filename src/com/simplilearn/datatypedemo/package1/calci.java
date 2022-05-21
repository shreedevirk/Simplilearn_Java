package com.simplilearn.datatypedemo.package1;

import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		
		for (int j=0;j<=11;j++) {
		System.out.println("Select the operation :\n" + "1. add\n" + "2. sub\n" + "3. mul\n" 
				+ "4. div\n" + "5. Modulus\n" + "6. Power\n" + "7. Square of number 1\n" + 
				"8. Square of number 2\n" +"9. Cube of number 1\n" +
				"10. Cube of number 2\n" + "11. Exit\n");
		int opt = sc.nextInt();
		
		switch(opt)
		{
				case 1:
				{
					int add = num1 + num2;
					System.out.println("Addition is : " + add);
					System.out.println("-----------------------------" + "\n");
					break;
				}
			
				case 2:
				{
					int sub = num1 - num2;
					System.out.println("Subtraction is :" + sub);
					System.out.println("-----------------------------" + "\n");
					break;
				}
				
				case 3:
				{
					int mul = num1 * num2;
					System.out.println("Multiplcation is :" + mul);
					System.out.println("-----------------------------" + "\n");
					break;
				}
				
				case 4:
				{
					int div = num1 / num2;
					System.out.println("Division is :" + div);
					System.out.println("-----------------------------" + "\n");
					break;
				}
				
				case 6:
				{
					double power = Math.pow(num1 , num2);
					System.out.println("Num1 Power Num2 is :" + power);
					System.out.println("-----------------------------" + "\n");
					break;
				}

				case 5:
				{
					int mod = num1 % num2;
					System.out.println("Modulus is :" + mod);
					System.out.println("-----------------------------" + "\n");
					break;
				}

				case 7:
				{
					double sqr1 = Math.pow(num1 ,2);
					System.out.println("Number 1 square is :" + sqr1);
					System.out.println("-----------------------------" + "\n");
					break;
				}

				case 8:
				{
					double sqr2 = Math.pow(num2,2);
					System.out.println("Number 2 square is :" + sqr2);
					System.out.println("-----------------------------" + "\n");
					break;
				}
				case 9:
				{
					double cub1 = Math.pow(num1 ,3);
					System.out.println("Number 1 Cube is :" + cub1);
					System.out.println("-----------------------------" + "\n");
					break;
				}

				case 10:
				{
					double cub2 = Math.pow(num2,3);
					System.out.println("Number 2 Cube is :" + cub2);
					System.out.println("-----------------------------" + "\n");
					break;
				}
				case 11:
				{
					System.out.println("Came out from Calci ");
					System.out.println("-----------------------------" + "\n");
					System.exit(0);
					
				}
		}
		}
	}
}