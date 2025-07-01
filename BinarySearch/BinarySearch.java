package BinarySearch;

import java.util.Scanner;

class BinarySearch {
  public static void main(String[] args) {

    int nums[] = { 5, 7, 9, 11, 13, 15 };

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter the number:");

      int target = scanner.nextInt();

      int result = binarySearch(nums, target);

      System.out.println("The index of the value is: " + result);
    }
  }

  private static int binarySearch(int[] nums, int target) {

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {

      int mid = (left + right) / 2;

      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
}