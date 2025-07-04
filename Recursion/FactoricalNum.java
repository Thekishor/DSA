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
    int fac_num = facNum(num - 1);
    int factorical = num * fac_num;
    return factorical;
  }
}
