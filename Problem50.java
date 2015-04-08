import java.util.Arrays;
public class Problem50
{
  private static int findPrimesBelow = 1000000, increment = 10000;
  private static int[] primes, temp;
  
  public static void main(String args[])
  {
    generatePrimes();
 
    int longestSum = 0, longestSumPrime = 0, tempSum;
    
    for (int i = 0; i<primes.length && primes[i] != 0; i++)
    {
      tempSum = generateLargestSum(i);
      if (tempSum > longestSum)
      {
        longestSum = tempSum; 
        longestSumPrime = primes[i];
      }
    }
    
    System.out.println( longestSumPrime + " is the longest sum of consecutive" +
                       " primes below " + findPrimesBelow +" that adds to a p" +
                       "rime and contains " + longestSum + " terms");

    
  }
  
  private static int generateLargestSum(int index)
  {
    int greatestSumLength = 0, tempSumLength = 0;
    int target = primes[index];
    int sum;
    for (int i = index; i>=0; i--)
    {
      sum = 0;
      for (int s = i; s>=0; s--)
      {
        sum += primes[s];
        if (sum == target)
        {
          tempSumLength = i-s+1;
          if (tempSumLength > greatestSumLength)
            greatestSumLength = tempSumLength;
        }
        else if (sum > target)
          break;
      }
      
    }
    return greatestSumLength;
  }
  
  
  
  private static void extendPrimes()
  {
    temp = primes;
    primes = new int[primes.length + increment];
    
    for (int i = 0; i<temp.length; i++)
      primes[i] = temp[i];
  }
  
  private static void generatePrimes()
  {
    primes = new int[increment];
    for (int n = 0, index = 0; n < findPrimesBelow; n++)
    {
      if(index == primes.length)
        extendPrimes();
      if(isPrime(n))
      {
        primes[index] = n;
        index++;
      }
    }
  }
  private static boolean isPrime(int n)
  {
    if (n == 2)
      return true;
    else if (n % 2 == 0 || n == 1)
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
}