package Recursion;

public class Test {

  public static void main(String[] args) {

    int num[] = { 9 };
    int result[] = plusOne(num);
    for (int nums : result) {
      System.out.print(nums);
    }
  }

  public static int[] plusOne(int[] digits) {

    int n = digits.length;
    for (int i = n - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }

      digits[i] = 0;
    }

    int[] newNumber = new int[n + 1];
    newNumber[0] = 1;

    return newNumber;
  }
}
