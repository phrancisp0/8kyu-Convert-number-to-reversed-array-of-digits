import java.lang.Math;
public class Kata {
  public static int[] digitize(long n) {
    String s = String.valueOf(n);
    int length = s.length();
    int[] array = new int[length];
    for ( int i = 0; i < length; i++){
      array[i] = (int) (s.charAt(length - i - 1)) - 48;
    }
    return array;
  }
}

/*
Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]
*/