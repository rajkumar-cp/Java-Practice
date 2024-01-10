package Problems;

import java.util.Scanner;

public class Fibonacci {

  /*5. Write a Java program to print a Fibonacci sequence using recursion.*/

  public static void main(String[] args){

    Scanner scanner = new  Scanner(System.in);
    int number = scanner.nextInt();
    for (int i =0;i<number;i++){
    System.out.print(fibonacci(i)+",");
    }
  }
  public static int fibonacci(int number){
    if (number<=1) return number;
    else
      return fibonacci(number-1)+fibonacci(number-2);
  }
}
