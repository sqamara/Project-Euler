import java.math.BigInteger;

public class Problem20
{
  public static void main(String[] args)
  {
    BigInteger num = new BigInteger("100");
    num = factorial(num);
    String s = num.toString();
    System.out.println(sumString(s) + " is the sum of the digits in the number 100!");
  }
  
  private static BigInteger factorial(BigInteger n)
  {
    if (n.intValue() == 1)
      return new BigInteger("1");
    else 
      return n.multiply(factorial(n.subtract(new BigInteger("1"))));
  }
  
  private static int sumString(String s)
  {
    int sum = 0;
    for (int i = 0; i<s.length(); i++)
      sum += (int)(s.charAt(i) - 48);
    return sum;
  }
}