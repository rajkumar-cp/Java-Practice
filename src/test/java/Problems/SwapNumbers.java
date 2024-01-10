package Problems;

import java.util.Scanner;

public class SwapNumbers {

  /*2. How do you swap two numbers without using a third variable in Jav*/

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("First number");
    int a = scanner.nextInt();
    System.out.println("Second number");
    int b = scanner.nextInt();
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println("First number "+a+" Second number "+b);

  }
}
