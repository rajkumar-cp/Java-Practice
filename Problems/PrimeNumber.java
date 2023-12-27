package Problems;

import java.util.Scanner;

public class PrimeNumber {

  /*4. Write a Java program to check if the given number is a prime number.*/

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    if (number == 0 || number == 1) System.out.println("Not Prime");
    else if(number == 2){
      System.out.println("Prime");
    } else {
      boolean prime = true;
      for (int i = 2; i < (number / 2); i++) {
        if (number % i == 0) {
          prime = false;
          break;
        }
      }
      System.out.println(prime ? "Prime" : "Not Prime");
    }
  }
}
