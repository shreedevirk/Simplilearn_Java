package com.simplilearn.datatypedemo.package1;

import java.util.regex.*;
public class RegularExp {
public static void main(String[] args) {
    String pattern = "[a-z]+";
    String check = "Bheem Expressions";
    Pattern p = Pattern.compile(pattern);
    Matcher c = p.matcher(check);
    
    while (c.find())
          System.out.println( check.substring( c.start(), c.end() ) );
    }
}

