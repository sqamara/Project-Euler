public class Problem14
{
  public static void main(String[] args)
  {
    long startNum = 0l;
    int largestChain = 0, chainSize = 0;
    for (long i = 1l; i<1000000; i++)
    {
      chainSize = generateCollatzLength(i);
      if (chainSize > largestChain)
      {
       largestChain =  chainSize;
       startNum = i;
      }
    }
    System.out.println(startNum + " is the starting number, under one million" +
                       ", that produces the longest Collatz sequence chain");
  }
  private static int generateCollatzLength(long n)
  {
    int count = 1;
    while (n!=1)
    {
      if (n%2==0)
        n/=2;
      else
        n = 3*n+1;
      count++;
    }
    return count;
  }
}