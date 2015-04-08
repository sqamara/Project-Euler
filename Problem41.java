public class Problem41
{
  public static void main(String args[])
  {
    String calc = "";
    search: for (int digits = 9; digits>0; digits--)
    {
      for (int a = digits; digits>0 && a>0; a--)
      {
        
        if ( digits == 1 )
        {
          calc = String.format("%d", a);
          if ( isPrime(Integer.valueOf(calc)) )
            break search;
          
        }
        for (int b = digits; digits>1 && b>0; b--)
        {
          if (b == a)
            continue;
          if ( digits == 2 )
          {
            calc = String.format("%d%d", a,b);
            if ( isPrime(Integer.valueOf(calc)) )
              break search;
            
          }
          for (int c = digits; digits> 2 && c>0; c--)
          {
            if (c == a || c == b)
              continue;
            
            if ( digits == 3 )
            {
              calc = String.format("%d%d%d", a,b,c);
              if ( isPrime(Integer.valueOf(calc)) )
                break search;
              
            }
            
            for (int d = digits; digits>3 && d>0; d--)
            {
              if (d == a || d == b || d == c)
                continue;
              
              if ( digits == 4 )
              {
                calc = String.format("%d%d%d%d", a,b,c,d);
                if ( isPrime(Integer.valueOf(calc)) )
                  break search;
                
              }
              
              for (int e = digits; digits>4 && e>0; e--)
              {
                if (e == a || e == b || e == c || e == d)
                  continue;
                
                if ( digits == 5 )
                {
                  calc = String.format("%d%d%d%d%d", a,b,c,d,
                                       e);
                  if ( isPrime(Integer.valueOf(calc)) )
                    break search;
                  
                  
                }
                
                for (int f = digits; digits>5 && f>0; f--)
                {
                  if (f == a || f == b || f == c || f == d || f == e)
                    continue;
                  
                  if ( digits == 6 )
                  {
                    calc = String.format("%d%d%d%d%d%d", a,b,c,d,
                                         e,f);
                    if ( isPrime(Integer.valueOf(calc)) )
                      break search;
                    
                  }
                  
                  for (int g = digits; digits>6  && g>0; g--)
                  {
                    if (g == a || g == b || g == c || g == d || g == e ||
                        g == f)
                      continue;
                    
                    if ( digits == 7 )
                    {
                      calc = String.format("%d%d%d%d%d%d%d", a,b,c,d,
                                           e,f,g);
                      if ( isPrime(Integer.valueOf(calc)) )
                        break search;
                      
                    }
                    
                    for (int h = digits; digits>7 && h>0; h--)
                    {
                      if (h == a || h == b || h == c || h == d || h == e ||
                          h == f || h == g)
                        continue;
                      
                      if ( digits == 8 )
                      {
                        calc = String.format("%d%d%d%d%d%d%d%d", a,b,c,d,
                                             e,f,g,h);
                        if ( isPrime(Integer.valueOf(calc)) )
                          break search;
                        
                      }
                      
                      for (int i = digits; digits>8 && i>0; i--)
                      {
                        if (i == a || i == b || i == c || i == d || i == e ||
                            i == f || i == g || i == h)
                          continue;
                        
                        calc = String.format("%d%d%d%d%d%d%d%d%d", a,b,c,d,
                                             e,f,g,h,i);
                        if ( isPrime(Integer.valueOf(calc)) )
                          break search;
                        
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
    System.out.println(calc + " is the largest n-digit pandigital prime that " +
                       "exists");
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
}