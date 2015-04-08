import java.util.Arrays;

public class Problem46
{
  private static int primesIncrement = 100, startSearch = 0;
  private static int[] primes = new int[100],
    temp;
  
  public static void main(String args[])
  {
    generatePrimes(0);
    
    compositeSearch: for (int compositeOdd = 9; ; compositeOdd+=2)
    {
      if (isPrime(compositeOdd))
        continue;
      sumSearch: for (int i = compositeOdd - 2; i>=0; i--)
      {
        for (int j = 0; j<=primes.length; j ++)
        {
          if ( j == primes.length)
            extendPrimes();
          if( 2*i*i + primes[j] > compositeOdd)
            break;
          else if ( 2*i*i + primes[j] == compositeOdd )
          {
            //System.out.println( compositeOdd );
            break sumSearch;
          }
        }
        if (i == 0)
        {
          System.out.println(compositeOdd + " is the smallest odd composite t" +
                             "hat cannot be written as the sum of a prime and" +
                             " twice a square");
          break compositeSearch;
        }
      }
    }
  }
  
  private static void generatePrimes(int startIndex)
  {
    for (int i = startIndex; i < primes.length; startSearch++)
    {
      if (isPrime(startSearch))
      {
        primes[i] = startSearch;
        i++;
      }
    }
  }
  private static void extendPrimes()
  {
    temp = primes;
    primes = new int[primes.length + primesIncrement];
    
    for (int i = 0; i<temp.length; i++)
      primes[i] = temp[i];
    generatePrimes(temp.length);
  }
  
  
  
  private static boolean isPrime(int n)
  {
    if (n == 1)
      return false;
    else if (n == 2)
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
