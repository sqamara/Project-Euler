public class Problem3
{
  public static void main(String args[])
  {
    long n;
    for (n = 600851475143L; factor(n)!=0; n/=factor(n));
    System.out.println(n + " is the largest prime factor of the number 600851475143");
    
  }
  
  /** returns the lowest factor of n
    * @param the number in question
    * @retrun the lowest factor
    * */
  private static int factor(long n)
  {
    for (int i=2; i<n; i++)
    {
      if (n%i==0)
        return i;
    }
    return 0;
  }
}