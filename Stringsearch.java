package com.simplilearn.datatypedemo.package1;

import java.util.Scanner;
import java.util.regex.*;
public class Stringsearch {
public static void main(String[] args) {
	int flag = 1;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string to be searched\n");
	String str = sc.nextLine();
	System.out.print("Enter an array of string\n");
	String arr = sc.nextLine();
    String pattern = str;
    String check = arr;
    Pattern p = Pattern.compile(pattern);
    Matcher c = p.matcher(check);
    
    while (c.find()) {
          System.out.println( check.substring( c.start(), c.end() ) );
          flag = 0;
    }
    
	if (flag ==0)
	{
		System.out.println("Given String found\n");
	}
	else
	{
		System.out.println("Given String not found\n");
	}
}
}

