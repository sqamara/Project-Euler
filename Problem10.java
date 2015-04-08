public class Problem10
{
  public static void main(String[] args)
  {
    long sum = 0l;
    for (int i = 2; i< 2000000; i++)
    {
      if ( isPrime(i) )
        sum+=i;
    }
    System.out.println(sum + " is the sum of all the primes below two million");
  }
 
  private static boolean isPrime(int n)
  {
    if (n == 2)
      return true;
    else if (n % 2 == 0)
      return false;
    else 
    {
      for (int i = 3; i <= Math.sqrt(n); i+=2)
      {
        if (n % i == 0)
          return false;
      }
    }
    return true;   
  }
}