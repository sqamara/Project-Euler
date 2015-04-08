import java.util.ArrayList;
public class Problem19
{
  public static void main(String args[])
  {
    int dayOfWeek = 1; //0 = Sunday, 1 = Monday, 2=Tuesday etc
    int count = 0; //sundays on firsts of months
    
    //year 1901 is represented by years index 1
    for(int year = 0; year<101; year++)//for each year
    {
      //for logs
      //System.out.println("year 1900 + " + year);
      
      for(int month = 0; month<12; month++)//for each month
      {
        //for logs
        //System.out.print("month " + month + ": ");
        
        if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7
              || month == 9 || month == 11) //months with 31 days
        {
          for(int day = 0; day<31; day++)//for each day
          {
            //for logs
            //System.out.print(day+"/" + dayOfWeek%7+" ");
            
            if (day == 0 && dayOfWeek%7 == 0 && year > 0)
              count++;
            dayOfWeek++;
          }
        }
        if (month == 3 || month == 5 || month == 8 || 
            month == 10) //months with 30 days
        {
          for(int day = 0; day<30; day++)//for each day
          {
            //for logs
            //System.out.print(day+"/" + dayOfWeek%7+" ");
            
            if (day == 0 && dayOfWeek%7 == 0 && year > 0)
              count++;
            dayOfWeek++;
          }
        }
        if (month == 1) //february
        {
          for(int day = 0; day<29; day++)//for each day
          {
            //does not apply rule for century rule b/c not relevant to problem
            if (day == 28 && year%4 != 0) 
              break;
            //for logs
            //System.out.print(day+"/" + dayOfWeek%7+" ");
            
            if (day == 0 && dayOfWeek%7 == 0 && year > 0)
              count++;
            dayOfWeek++;
          }
        }
        //for logs
        //System.out.println();
        
      }
    }
    System.out.println(count + " Sundays fell on the first of the month " +
                       "during the twentieth century "+
                       "(1 Jan 1901 to 31 Dec 2000)");
  }
}