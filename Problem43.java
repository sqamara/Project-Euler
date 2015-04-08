public class Problem43
{
  public static void main(String args[])
  {
    long sum = 0;
    //generates every pandigital 9 digit number in the form "abcdefghi"
    for (int a = 0; a<=9; a++)
    {
      for (int b = 0; b<=9; b++)
      {
        if (b == a)
          continue;
        for (int c = 0; c<=9; c++)
        {
          if (c == a || c == b)
            continue;
          for (int d = 0; d<=9; d++)
          {
            if (d == a || d == b || d == c)
              continue;
            for (int e = 0; e<=9; e++)
            {
              if (e == a || e == b || e == c || e == d)
                continue;
              for (int f = 0; f<=9; f++)
              {
                if (f == a || f == b || f == c || f == d || f == e)
                  continue;
                for (int g = 0; g<=9; g++)
                {
                  if (g == a || g == b || g == c || g == d || g == e ||
                      g == f)
                    continue;
                  for (int h = 0; h<=9; h++)
                  {
                    if (h == a || h == b || h == c || h == d || h == e ||
                        h == f || h == g)
                      continue;
                    for (int i = 0; i<=9; i++)
                    {
                      if (i == a || i == b || i == c || i == d || i == e ||
                          i == f || i == g || i == h)
                        continue;
                      for (int j = 0; j<=9; j++)
                      {
                        if (j == a || j == b || j == c || j == d || j == d ||
                            j == f || j == g || j == h || j == i)
                          continue;
                        
                        String calc = String.format("%d%d%d%d%d%d%d%d%d%d", a,b,c,d,
                                                    e,f,g,h,i,j);
                        if (hasDivisibilityProperty(calc))
                        {
                          //System.out.println(calc);
                          sum += Long.valueOf(calc);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    System.out.println(sum + " is the sum of all 0 to 9 pandigital numbers wi" +
                       "th the \"interesting sub-string divisibility property" +
                       "\"");
  }
  
  /** checks if a pandigital number made of digits 0 to 9
    * has the "interesting sub-string property
    * */
  private static boolean hasDivisibilityProperty(String input)
  {
    if(Integer.valueOf(input.substring(7)) % 17 == 0 &&
       Integer.valueOf(input.substring(6,9)) % 13 == 0 &&
       Integer.valueOf(input.substring(5,8)) % 11 == 0 &&
       Integer.valueOf(input.substring(4,7)) % 7 == 0 &&
       Integer.valueOf(input.substring(3,6)) % 5 == 0 &&
       Integer.valueOf(input.substring(2,5)) % 3 == 0 &&
       Integer.valueOf(input.substring(1,4)) % 2 == 0)
      return true;
    return false;
  }  
  
}