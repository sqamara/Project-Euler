public class Problem27
{
  public static void main(String args[])
  {
    // n? + an + b, where |a| < 1000 and |b| < 1000
    
    int finalA = 0, finalB = 0, greatestN = 0;
    for (int a = -999; a < 1000; a++)
    {
      for (int b = -999; b < 1000; b++)
      {
        for (int n = 0, output = 1; isPrime(Math.abs(output)); n++)
        {
          if (n > greatestN)
          {
            greatestN = n;
            finalA = a;
            finalB = b;
          }
          output = n*n + a*n + b;
        }
      }
    }
    
    System.out.println( finalA * finalB + " is the product of the coefficient" +
                       "s, a and b, for the quadratic expression, n? + an + b" +
                       ", where |a| < 1000 and |b| < 1000, that produces the " +
                       "maximum number of primes for consecutive values of n," +
                       "starting with n = 0");
  
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