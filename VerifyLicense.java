package com.simplilearn.datatypedemo.package1;

import java.util.Scanner;
//custom exception
class UnderAgeException extends Exception{
  public String toString() {
      return "Customer Under age";
  }
}
class OverAgeException extends Exception{
	  public String toString() {
	      return "Customer Over age";
	  }
	}
class Customer{
  int age;
  
  void collectData() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the age:");
      age = sc.nextInt();
  }
  void verify() throws UnderAgeException{
      if(age < 18) {
          System.out.println("Customer Under age");
      }
      else {
          UnderAgeException ice = new UnderAgeException();
          System.out.println(ice.toString());
          throw ice;
      }
  }
  void verify1() throws OverAgeException{
      if(age > 65) {
          System.out.println("Customer Over age");
      }
      else {
          OverAgeException ice = new OverAgeException();
          System.out.println(ice.toString());
          throw ice;
      }
  }
}

class Customer{
    void customerCheck() {
        Customer c1 = new Customer();
        c1.collectData();
        try {
        c1.verify();
        }
        catch (UnderAgeException e) {
            // TODO: handle exception
            System.out.println(e.toString());
        }
    }
}
public class VerifyLicense 
{
    public static void main(String args[]) throws ArrayIndexOutOfBoundsException
    {
        License l = new License();
        l.customerCheck();
    }
}


