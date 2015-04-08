public class Problem34
{
  private static int[] facts;
  public static void main(String args[])
  {
    facts = new int[10];
    for (int i = 0; i<10; i++)
      facts[i] = factorial(i);
    int sum = 0;
    for (int i = 10; i<2540161; i++)
    {
      if (i == sumFactorials(i))
        sum += sumFactorials(i);
    }    
    System.out.println(sum + " is the sum of all numbers which are equal to t" +
                       "he sum of the factorial of their digits");
}
  
  private static int sumFactorials(int n)
  {
    int sum = 0;
    while ( n > 0 )
    {
      int digit = n%10;
      n/=10;
      sum += facts[digit];
    }
    return sum;
  }
  
  private static int factorial(int a)
  {
    if ( a == 1 || a == 0)
      return 1;
    else
      return a*factorial(a-1);
  }
  }