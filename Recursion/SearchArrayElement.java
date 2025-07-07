package Recursion;

public class SearchArrayElement {

  public static void main(String[] args) {

    int nums[] = { 10, 20, 30, 40, 50 };
    int index = 0;
    System.out.println(sort(nums, index));
  }

  static boolean sort(int array[], int index) {

    if (index == array.length - 1) {
      return true;
    }

    return array[index] < array[index + 1] && sort(array, index + 1);
  }
}
