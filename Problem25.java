import java.math.BigInteger;
import java.util.ArrayList;
public class Problem25
{
  public static void main(String[] args)
  {
    ArrayList<BigInteger> fibbonacci = fibonacci(1000);
    System.out.println(fibbonacci.size()-1 + " is the first term in the Fibon" +
                       "acci sequence to contain 1000 digits");
  }
  /**private static BigInteger fibonacci(int i)
  {
    BigInteger num = new BigInteger("1");
    if (i == 1 || i == 2)
      return num;
    else
      return fibonacci(i-1).add(fibonacci(i-2));
  }**/
  
  private static ArrayList<BigInteger> fibonacci(int len)
  {
    ArrayList<BigInteger> nums = new ArrayList<BigInteger>();
    nums.add(0,new BigInteger("0"));
    nums.add(1,new BigInteger("1"));
    nums.add(2,new BigInteger("1"));
    
    for (int i = 3; bigIntLength(nums.get(i-1))<len; i++)
      nums.add(i,nums.get(i-1).add(nums.get(i-2)));  
    return nums;
  }
  
  private static int bigIntLength(BigInteger n)
  {
    String s = n.toString();
    return s.length();
  }
      
}