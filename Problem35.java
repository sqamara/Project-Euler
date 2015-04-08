public class Problem35
{
  public static void main(String args[])
  {
    int count = 1; //starts at 1 b/c 2 is a circular prime
    for (int i = 3; i<1000000; i++)
    {
      if (isRotationalPrime(i))
        count++;
    }
      System.out.println(count + " is the amount of circular primes below one" +
                         " million");
  }
  
  private static boolean isRotationalPrime(int n)
  {
    String num = String.valueOf(n);
    for (int i = 0; i < num.length(); i++)
    {
      if (!isPrime(Integer.valueOf(num)))
        return false;
      num = (num + num.substring(0,1)).substring(1);
    }
    return true;
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