
package Recursion;

public class Print5Numbers {

  public static void main(String[] args) {
    int number = 1;
    print(number);
  }

  private static void print(int number) {

    if (number == 5) {
      System.out.println(number);
      return;
    }
    System.out.println(number);
    print(number + 1);
    System.out.println(number);
  }
}