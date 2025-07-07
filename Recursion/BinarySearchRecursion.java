package Recursion;

public class BinarySearchRecursion {
  public static void main(String[] args) {

    int arr[] = { 2, 3, 5, 7, 8, 9, 12, 13, 15, 16 };
    int target = 13;
    int result = serach(arr, target, 0, arr.length - 1);
    System.out.println(result);

  }

  static int serach(int arr[], int target, int start, int end) {

    if (start > end) {
      return -1;
    }

    int mid = start + (end - start) / 2;
    if (arr[mid] == target) {
      return mid;
    }

    if (target < arr[mid]) {
      return serach(arr, target, start, mid - 1);
    } else {
      return serach(arr, target, mid + 1, end);
    }
  }
}
