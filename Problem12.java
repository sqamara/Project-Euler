import java.util.ArrayList;
public class Problem12
{
  public static void main(String[] args)
  {
    int i;
    for (i = 1; numOFFactors(triangleNum(i))<=500; i++);
   // System.out.println(triangleNum(i)+ ": "+ numOFFactors(triangleNum(i)) );
    System.out.println(triangleNum(i) + " is the first triangle number to hav" +
                       "e over five hundred divisors");
  }
  
  private static int triangleNum(int n)
  {
    int toReturn = n;
    for (int i = 0; i<n; i++)
      toReturn+=i;
    return toReturn;
  }
  
  private static int numOFFactors(int n)
  {
    int count = 0;
    int sqrt = (int) Math.sqrt(n);
    for (int i = 1; i<=sqrt; i++)
    {
      if (n%i==0)
        count+=2;
    }
    return count;
  }
}
