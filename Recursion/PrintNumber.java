package Recursion;

public class PrintNumber {

  public static void main(String[] args) {
    int n = 10;
    printNum(n);
  }

  public static void printNum(int n) {

    if (n == 0) {
      return;
    }

    System.out.print(n + " ");
    printNum(n - 1);
  }
}
