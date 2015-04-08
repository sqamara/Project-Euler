import java.math.BigInteger;
public class Problem36
{
  public static void main(String args[])
  {
    
    int sum = 0;
    for (int i = 0; i<1000000; i++)
    {
      if (isPalindrome(String.valueOf(i)) && 
          isPalindrome(decimalToBinary(i).toString()))
      {
        //System.out.println(i + " " + decimalToBinary(i));
        sum+=i;
      }
    }
    System.out.println(sum + " is the sum of all numbers, less than one milli" +
                       "on, which are palindromic in base 10 and base 2");
  }
  
  private static BigInteger decimalToBinary(int n)
  {
    BigInteger power = new BigInteger("1");
    BigInteger binary = new BigInteger("0");
    
    do {
      binary = binary.add(power.multiply( new BigInteger( String.valueOf(n%2))));
      //binary += power*(n%2);
      power = power.multiply(new BigInteger("10"));
      //power*=10;
    } while ((n/=2) != 0);
    
    return binary;
  }
  
  public static boolean isPalindrome(String s)
  {
    for (int i = 0; i< s.length()/2; i++)
    {
      if (s.charAt(i) != s.charAt(s.length()-1-i))
        return false;
    }
    return true;
  }
}