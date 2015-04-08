public class Problem7
{
  public static void main(String args[])
  {
    int nTerm = 10001, i=1, num = 2;
    while (i<=nTerm)
    {
      if (isPrime(num))
      {
        //System.out.println(i+ " " + num);
        i++;
      }   
      num++;
    }
    System.out.println((num-1) + " is the 10001st prime number");
  }
   
  
  private static boolean isPrime(int n)
  {
    for (int i = 2; i<n; i++)
    {
      if (n%i == 0)
        return false;
    }
    return true;
  }
}
      