public class Problem31
{
  private static final double findWaysfor = 2;
  private static final int toGet = (int) ( findWaysfor*100);
  public static void main(String args[])
  {    
    int total = 0;
    for (int a = 0; a <= toGet; a+=200) //loop for 2pound piece
    {
      for (int b = 0; b <= toGet; b+=100) //loop for 1pound piece
      {
        if (a+b > 200) {break;}
        for (int c = 0; c <= toGet; c+=50) //loop for 50pence piece
        {
          if (a+b+c > 200) {break;}
          for (int d = 0; d <= toGet; d+=20) //loop for 20pence piece
          {
            if (a+b+c+d > 200) {break;}
            for (int e = 0; e <= toGet; e+=10) //loop for 10pence piece
            {
              if (a+b+c+d+e > 200) {break;}
              for (int f = 0; f <= toGet; f+=5) //loop for 5pence piece
              {
                if (a+b+c+d+e+f > 200) {break;}
                for (int g = 0; g <= toGet; g+=2) //loop for 2pence piece
                {
                  if (a+b+c+d+e+f+g > 200) {break;}
                  for (int h = 0; h <= toGet; h+=1) //loop for 1pence piece
                  {
                    if (a+b+c+d+e+f+g+h > 200) {break;}
                    if (a+b+c+d+e+f+g+h == toGet)
                      total++;
                  }
                }
              }
            }
          }
        }
      }
    }
    
    System.out.println(total + " is the amount of different ways to get " + 
                       findWaysfor + " pounds made using any number of Englis" +
                       "h coins");
  }
}