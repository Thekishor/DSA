
package LinearSearch;

import java.util.Scanner;

public class LinearSearch {

  public static void main(String[] args) {

    int nums[] = { 5, 7, 9, 11, 13, 15 };

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter the number:");

      int target = scanner.nextInt();

      int result = linearSearch(nums, target);

      if (result != -1) {
        System.out.println("The index of the value is: " + result);
      } else {
        System.out.println("Element Not Found");
      }
    }
  }

  private static int linearSearch(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i;
      }
    }
    return -1;
  }
}