import java.math.BigInteger;
public class Problem16
{
  public static void main(String[] args)
  {
    BigInteger num = new BigInteger("2");
    num = num.pow(1000);
    String s = num.toString();
    System.out.println(sumString(s) + " is the sum of the digits of the numbe" +
                       "r 21000");
  }
  
  private static int sumString(String s)
  {
    int sum = 0;
    for (int i = 0; i<s.length(); i++)
      sum += (int)(s.charAt(i) - 48);
    return sum;
  }
}