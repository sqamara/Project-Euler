import java.util.LinkedList;
public class Problem32
{
  private static LinkedList<Integer> products = new LinkedList<Integer>();
  public static void main(String args[])
  {
    //generates every pandigital 9 digit number in the form "abcdefghi"
    for (int a = 1; a<=9; a++)
    {
      for (int b = 1; b<=9; b++)
      {
        if (b == a)
          continue;
        for (int c = 1; c<=9; c++)
        {
          if (c == a || c == b)
            continue;
          for (int d = 1; d<=9; d++)
          {
            if (d == a || d == b || d == c)
              continue;
            for (int e = 1; e<=9; e++)
            {
              if (e == a || e == b || e == c || e == d)
                continue;
              for (int f = 1; f<=9; f++)
              {
                if (f == a || f == b || f == c || f == d || f == e)
                  continue;
                for (int g = 1; g<=9; g++)
                {
                  if (g == a || g == b || g == c || g == d || g == e ||
                      g == f)
                    continue;
                  for (int h = 1; h<=9; h++)
                  {
                    if (h == a || h == b || h == c || h == d || h == e ||
                        h == f || h == g)
                      continue;
                    for (int i = 1; i<=9; i++)
                    {
                      if (i == a || i == b || i == c || i == d || i == e ||
                          i == f || i == g || i == h)
                        continue;
                      String calc = String.format("%d%d%d%d%d%d%d%d%d", a,b,c,d,
                                                  e,f,g,h,i);
                      generatePotentialProducts(calc);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    System.out.println(sumProducts() + " is the sum of all products whose mul" +
                       "tiplicand/multiplier/product identity can be written " +
                       "as a 1 through 9 pandigital");
  }
  
  
  private static void generatePotentialProducts(String num)
  {
    for (int x = 1; x<=7; x++) //positions in string for multiplication sign
    {
      for (int e = x+1; e<=8; e++) //positions in string for equals sign
      {
        if (Integer.valueOf(num.substring(0,x)) * 
            Integer.valueOf(num.substring(x,e)) == 
            Integer.valueOf(num.substring(e)))
          addToProducts(Integer.valueOf(num.substring(e)));
      }
    }
  }
  private static void addToProducts(int num)
  {
    for (Integer i : products)
    {
      if (i == num)
        return;
    }
    products.add(num);
  }
  private static int sumProducts()
  {
    int sum = 0;
    for (Integer i : products)
      sum+=i;
    return sum;
  }
}


