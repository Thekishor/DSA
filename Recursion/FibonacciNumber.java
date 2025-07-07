
package Recursion;

public class FibonacciNumber {

  public static void main(String[] args) {
    int number = 4;
    int result = Fib(number);
    System.out.println(result);
  }

  static int Fib(int num) {
    if (num < 2) {
      return num;
    }
    return Fib(num - 2) + Fib(num - 1);
  }
}