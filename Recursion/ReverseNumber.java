package Recursion;

public class ReverseNumber {
  public static void main(String[] args) {
    int number = 4353;
    rev(number);
    System.out.println(sum);
  }

  static int sum = 0;

  static void rev(int number) {
    if (number == 0) {
      return;
    }

    int rem = number % 10;
    sum = sum * 10 + rem;
    rev(number / 10);
  }
}
