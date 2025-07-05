package Recursion;

public class SumOf5Number {

  public static void main(String[] args) {
    int num = 5;
    int sumOfNumber = sumOfNumbers(num);
    System.out.println("Sum of the five number is : " + sumOfNumber);
  }

  static int sumOfNumbers(int num) {
    if (num == 1) {
      return 1;
    }

    int sumResult = num + sumOfNumbers(num - 1);
    return sumResult;
  }
}
