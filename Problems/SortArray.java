package Problems;

import java.util.Arrays;

public class SortArray {

  /*10. How do you sort an array in Java?*/

  public static void main(String[] args){

    int[] array = {1, 2, 3, -1, -2, 4};
    String[] sarray = {"asdas","sdfs","iouyu","trtyfg"};

    Arrays.sort(array);

    for (int i : array){
      System.out.print(i + ", ");
    }

    System.out.println();

    Arrays.sort(sarray);

    for (String i : sarray){
      System.out.print(i + ", ");
    }

  }
}
