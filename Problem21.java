public class Problem21
{
  public static void main(String[] args)
  {
    
    /**for(int n = 1;n<10000;n++)
    {
      if ( n == sumDivisors(sumDivisors(n)))
        System.out.println(n+" : "+sumDivisors(n)+" : "+sumDivisors(sumDivisors(n)));
    }**/
    int sum = 0;
    for (int i = 1; i<10000; i++)
    {
      if ( i!=sumDivisors(i) && i == sumDivisors(sumDivisors(i)))
        sum += i;
    }
    System.out.println(sum + " is the sum of all the amicable numbers under 10000");
  }
  
  private static int sumDivisors(int n)
  {
    int sum = -n;
    if (n%Math.sqrt(n) == 0)
      sum+= Math.sqrt(n);
    for (int i = 1; i<Math.sqrt(n); i++)
    {
      if (n%i == 0)
      {
        sum+=i;
        //System.out.println(i);
        sum+=n/i;
        //System.out.println(n/i);
      }
    }
    return sum;
  }
}