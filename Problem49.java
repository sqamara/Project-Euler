public class Problem49
{
  public static void main(String args[])
  {
    int count = 0;
    for (int i = 1001; i<9999; i+=2)
    {
      if ( isPrime(i))
        count++;
    }
    int[] primes = new int[count];
    for (int i = 1001, index = 0; i<9999; i+=2)
    {
      if ( isPrime(i))
      {
        primes[index] = i;
        index++;
      }
    }
    
    for (int i = 0; i<primes.length; i++)
    {
      for ( int j = i+1; j<primes.length; j++)
      {
        if (arePermutations(primes[i],primes[j]))
        {
          int k = primes[j] + primes[j]-primes[i];
          if (isPrime( k ))
          {
            if (arePermutations(primes[i],k) && primes[i] != 1487)
              System.out.println( primes[i]+ "" + primes[j] + "" + k + " is t" +
                                 "he 12-digit number formed by concatenating " +
                                 "the three terms in arithemtic sequence in w" +
                                 "hich each term increases equally, are prime" +
                                 " and arepermutations of one another, other " +
                                 "than 148748178147");
          }
        }
      }
    }
  }
  private static boolean isPrime(int n)
  {
    if (n == 2)
      return true;
    else if (n % 2 == 0)
      return false;
    else 
    {
      for (int i = 3; i*i <= n; i+=2) //just check next prime not every odd
      {
        if (n % i == 0)
          return false;
      }
    }
    return true;   
  }
  
  private static boolean arePermutations(int a, int b)
  { 
    
    int[] num1 = new int[4], num2 = new int[4];
    for ( int n = 1, i = 0; i<4 ; n*=10, i++ )
    {
      num1[i] = a/n%10;
      num2[i] = b/n%10; 
    }
    
    boolean numFoundInB;
    for (int num : num1)
    {
      numFoundInB = false;
      for ( int i = 0; i<num2.length; i++)
      {
        if (num == num2[i])
        {
          numFoundInB = true;
          num2[i] = -1;
          break;
        }
      }
      if ( !numFoundInB )
        return false;
    }
    return true;
  }
}


