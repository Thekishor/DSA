package Recursion;

public class FactoricalNum {

  public static void main(String[] args) {
    int result = facNum(5);
    System.out.println(result);
  }

  public static int facNum(int num) {
    if (num == 1 || num == 0) {
      return 1;
    }
    int facNum = num * facNum(num - 1);
    return facNum;
  }
}
