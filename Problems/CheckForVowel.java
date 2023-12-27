package Problems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckForVowel {

  /*3. Write a Java program to check if a vowel is present in a string.*/

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string ");
    String s = scanner.next();
    Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
    System.out.println("Using Pattern Class Method: "+ pattern.matcher(s).find());
    System.out.println("Using String Class Method: "+ s.toLowerCase().matches(".*[aeiou].*"));
  }
}
