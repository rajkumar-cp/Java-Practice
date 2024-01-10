package Problems;

import java.util.Scanner;

public class StringReverse {

  /*1. How do you reverse a string in Java? */

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string to be reversed");
    String name = scanner.next();
    System.out.println("Using StringBuilder: " + new StringBuilder(name).reverse());
    System.out.println("Using StringBuffer: " + new StringBuffer(name).reverse());
  }

}
