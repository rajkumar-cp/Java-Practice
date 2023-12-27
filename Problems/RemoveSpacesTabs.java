package Problems;


public class RemoveSpacesTabs {

  /*8. How do you remove spaces from a string in Java?*/

  public static void main(String[] args){

    String s = "Hello   World!    How are you?";
    System.out.print(s.replaceAll("[\\s\\t]+",""));
  }
}
