public class Problem17
{
  public static void main(String[] args)
  {
    /**int n = 100;
    System.out.println(writeNumber(n)+ " : " + countChars(writeNumber(n)));**/
    String s = ""; 
    for (int i = 1; i<=1000; i++)
      //System.out.print(writeNumber(i)+ ",");
      s += writeNumber(i) + " ";
    System.out.println(countChars(s) + " is the amount of characters needed t" +
                       "o write all the numbers from 1 to 1000, inclusive, ou" +
                       "t in words");
  }
  
  private static String writeNumber(int i)
  {
    String s = "";
    if (i== 1000)
      return " one thousand";
    if (i>99)
    {
      s = s + specificNum(i/100) + " hundred";
      if (i%100 > 0)
        s += " and";
    }
    if (i%100 > 19)
    {
      s = s + specificNum(i%100-i%10);
      s = s + specificNum(i%10);
    }
    else
      s = s + specificNum(i%100);
      
    return s;
  }
  
  private static String specificNum(int i)
  {
    String s = "";
    
    switch (i){
      case 1: 
        s += " one";
        break;
      case 2: 
        s += " two";
        break;
      case 3: 
        s += " three";
        break;
      case 4: 
        s += " four";
        break;
      case 5: 
        s += " five";
        break;
      case 6: 
        s += " six";
        break;
      case 7: 
        s += " seven";
        break;
      case 8: 
        s += " eight";
        break;
      case 9: 
        s += " nine";
        break;
      case 10: 
        s += " ten";
        break;
      case 11: 
        s += " eleven";
        break;
      case 12:
        s += " twelve";
        break;
      case 13:
        s += " thirteen";
        break;
      case 14:
        s += " fourteen";
        break;
      case 15:
        s += " fifteen";
        break;
      case 16:
        s += " sixteen";
        break;
      case 17: 
        s += " seventeen";
        break;
      case 18:
        s += " eighteen";
        break;
      case 19: 
        s += " nineteen";
        break;
      case 20:
        s += " twenty";
        break;
      case 30:
        s += " thirty";
        break;
      case 40:
        s += " forty";
        break;
      case 50:
        s += " fifty";
        break;
      case 60:
        s += " sixty";
        break;
      case 70:
        s += " seventy";
        break;
      case 80:
        s += " eighty";
        break;
      case 90:
        s += " ninety";
        break;
    }
      
      return s;
  }
  
  
  private static int countChars(String s)
  {
    int count = 0;
    for (int i = 0; i < s.length(); i++)
    {
      if (s.charAt(i) != ' ' && s.charAt(i) != '-')
        count++;
    }
    return count;
  }
}