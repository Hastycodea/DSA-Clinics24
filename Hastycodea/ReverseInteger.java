import java.util.*;

public class ReverseInteger{

  public static void main(String[] args) {

    int num = -90;
    System.out.println(reverseInteger(num));
    System.out.println(reverseInteger(91));
    System.out.println(reverseInteger(500));
    System.out.println(reverseInteger(-56));

  }

  public static int reverseInteger(int num) {
    int absNum = Math.abs(num);
    String number = String.valueOf(absNum);
    StringBuilder sb = new StringBuilder(number);
    String numberReversed = sb.reverse().toString();
    int result = Integer.valueOf(numberReversed);

    return num > 0 ? result : -result;
  }
}
