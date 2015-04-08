public class Problem37
{
  public static void main(String args[])
  {
    int sum = 0;
    for (int i = 10, count = 0; count < 11; i++)
    {
      if ( isTruncatablePrime(i) )
      {
        sum+=i;
        count++;
      }
    }
    System.out.println(sum + " is the sum of the only eleven primes that are " +
                       "both truncatable from left to right and right to left");
  }
  
  private static boolean isTruncatablePrime(int n)
  {
    String numL = String.valueOf(n), numR = numL;
    
    while (numL.length() > 0)
    {   
      if ( !isPrime(Integer.valueOf(numL)) || !isPrime(Integer.valueOf(numR) ))
        return false;
      // truncating from L
      numL = numL.substring(1);
      // truncating from R
      numR = numR.substring(0, numR.length()-1);
      
    }
    return true;
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