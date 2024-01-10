package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEven {
  /*6. How do you check if a list of integers contains only odd numbers in Java?*/

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    for (int i =0;i<10;i++){
      list.add(scanner.nextInt());
    }
    boolean odd = true;
    for (Integer no : list) {
        if (no%2 == 0){
          odd = false;
          break;
        }
    }
    System.out.print(odd?"Only Odd":"Not only odd");
  }
}
