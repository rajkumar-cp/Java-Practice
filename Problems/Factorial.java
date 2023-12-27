package Problems;

import java.util.Scanner;

public class Factorial {

  /*12. How can you find the factorial of an integer in Java?*/

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int factorial = 1;
    for (int i=number;i>1;i--){
      factorial = factorial*i;
    }
    System.out.println(factorial);

    System.out.println(factorial(number));
  }

  public static long factorial(long n) {
    if (n == 1)
      return 1;
    else
      return (n * factorial(n - 1));
  }
}
