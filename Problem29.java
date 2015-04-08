import java.util.*;
import java.math.BigInteger;
public class Problem29
{
  public static void main(String args[])
  {
    BigInteger[] nums = new BigInteger[99*99];
    int i = 0;
    
    //a^b for 2 <= a <= 100 and 2 <= b <= 100
    
    for (int a = 2; a <= 100; a++)
    {
      for (int b = 2; b <= 100; b++)
      {
        nums[i] = new BigInteger(String.valueOf(a)).pow(b);
        i++;
      }
    }
    
    Arrays.sort(nums);
    int repeats = 0;
    for ( i = 1; i < 99*99; i++ )
    {
      if (nums[i].equals(nums[i-1]))
        repeats++;
    }
    System.out.println(99*99-repeats + " is the amount of distinct terms are " +
                       "in the sequence generated by ab for 2 <= a <= 100 and" +
                       "2 <= b <= 100");
    
  }
}