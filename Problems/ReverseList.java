package Problems;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseList {

  /*13. How do you reverse a linked list in Java?*/

  public static void main(String[] args){

    LinkedList<Integer> l = new LinkedList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    System.out.println(l);
    Collections.reverse(l);
    System.out.println(l);
  }
}
