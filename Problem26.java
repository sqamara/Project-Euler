import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.math.BigDecimal;


public class Problem26
{
  public static void main(String args[])
  {
    String[] fractions = new String[1000];
    BigDecimal one = new BigDecimal(1.0);
    for (int i = 1; i<1000; i++)
      fractions[i] = String.valueOf(one.divide( new BigDecimal(i), 2010, 4)).substring(12);
    //saves the decimals as a string and removes the first ten decimal places
    //kept increasing the size of the strings till recieving the correct answer
    /**
    for (int i = 1; i<1000; i++)
      System.out.println(fractions[i].length());
    **/
    

    int largestD = 0;
    int largestPat = 0;
    
    Pattern pat = null;
    Matcher m = null;
    for(int i = 1; i<1000; i++)
    {
        for (int j = 0; j<1000; j++)
        {
          pat = Pattern.compile(fractions[i].substring(0,1+j));
          m = pat.matcher(fractions[i]);
          m.find();
          if (!m.find() || m.start() == 1+j)
          {
            if (j+1 > largestPat)
            {
              largestPat = j+1;
              largestD = i;
            }
            
            break;
          }
        }
    }
    System.out.println(largestD + " is the value of d < 1000 for which 1/d co" +
                       "ntains the longest recurring cycle in its decimal fra" +
                       "ction part");
            
    
  }
}