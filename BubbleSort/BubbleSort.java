package BubbleSort;

public class BubbleSort {

  public static void main(String[] args) {

    int nums[] = { 8, 6, 4, 2, 9, 3 };
    int temp = 0;
    int size = nums.length;

    System.out.println("Before Sort");
    for (int num : nums) {
      System.out.print(num + " ");
    }

    System.out.println();
    System.out.println("After Sort");

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
      System.out.println();
      for (int num : nums) {
        System.out.print(num + " ");
      }
    }
  }
}
