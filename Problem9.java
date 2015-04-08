public class Problem9
{
  public static void main(String args[])
  {
    int[] nums = new int[3];
    search:
    for (int a = 1; a<1000; a++)
    {
      for (int b = 1; b<1000; b++)
      {
        for (int c = 1; c<1000; c++)
        {
          if (isPythagoreanTriplet(a,b,c) && a+b+c == 1000)
          {
            nums[0] = a;
            nums[1] = b;
            nums[2] = c;
            break search;
          }
        }
      }
    }
    System.out.println( nums[0]*nums[1]*nums[2] + " is the product, a*b*c, of" +
                       " the Pythagorean triplet in which a+b+c = 1000");
  }
  private static boolean isPythagoreanTriplet(int a,int b, int c)
  {
    if (a*a + b*b == c*c)
      return true;
    return false;
  }
}