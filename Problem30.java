
public class Problem30
{
  public static void main(String args[])
  {
    int sum = 0;
    for ( int i = 2; i<500000 ;i++ )
    {
      if (isASumOfFifthPower(i))
        sum+=i;
    }
    System.out.println(sum + " is the sum of all the numbers that can be writ" +
                       "ten as the sum of fifth powers of their digits");
  }
  public static boolean isASumOfFifthPower(int n)
  {
    int sum = 0;
    for (int i = 10; (n%(i+1)) !=0; i*=10)
    {
      sum += Math.pow((n%(i)) / (i/10), 5);
    }
    if (sum == n)
      return true;
    else
      return false;
  }
  
}