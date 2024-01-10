package Problems;

import java.util.Scanner;

public class PalindromeString {

  /*7. How do you check whether a string is a palindrome in Java?*/

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    String org = scanner.next();
    System.out.print(org.equals(new StringBuffer(org).reverse().toString())?"Palindrome":"Not Palindrome");
  }
}
