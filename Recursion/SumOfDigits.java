
package Recursion;

public class SumOfDigits {

  public static void main(String[] args) {
    int number = 1234;
    int sumOfResult = sumDigits(number);
    System.out.println("Sum of the digits are : " + sumOfResult);
  }

  private static int sumDigits(int number) {
    if (number == 0) {
      return 0;
    }
    return (number % 10) + sumDigits(number / 10);
  }
}