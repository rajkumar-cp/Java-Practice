package Problems;

import java.util.Arrays;
import java.util.HashSet;

public class CheckTwoArrays {

  /*17. Write Java program that checks if two arrays contain the same elements.*/

  public static void main(String[] args){

    Integer[] a1 = {1,2,3,2,1};
    Integer[] a2 = {1,2,3,3};
   // Integer[] a3 = {1,2,3,4};

    //Convert array to set

    HashSet<Integer> set1 = new HashSet<>(Arrays.asList(a1));
    HashSet<Integer> set2 = new HashSet<>(Arrays.asList(a2));
    //HashSet<> set3 = new HashSet(Arrays.asList(a3));

    if (set1.size() == set2.size()){
      for (Integer i: set1)
        if (set2.contains(i))
          ;
        else {
          System.out.println(" two arrays doesn't contain the same elements.");
          return;
        }
      System.out.println(" two arrays contain the same elements.");
      return;
      }
    System.out.println(" two arrays doesn't contain the same elements.");
  }
}
