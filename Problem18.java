import java.io.*;
import java.util.*;
public class Problem18
{
  public static void main(String args[]) throws IOException
  {
    File in = new File("Problem18Triangle.txt");
    Scanner input = new Scanner(in);
    
    final int LINES = 15; 
    //note Problem18Triangle.txt is 15 lines and
    //Problem18TriangleSample.txt is 4 lines and
    //Problem67Triangle.txt has 100 lines
    
    int[][] triangleDS = new int[LINES][LINES]; 
   //l is based on the nuber of lines in pyramid
    for (int l = 0; l<LINES; l++)
    {
      for (int r = l, c = 0; r>=0 && c<=l; r--,c++)
        triangleDS[r][c] = input.nextInt();
    }
    
    /**
    //Prints the pyramid sideways in the 2d array
    for (int r = 0; r<LINES; r++)
    {
      for (int c = 0; c<LINES; c++)
        System.out.print(String.format("%5d",triangleDS[r][c]));
      System.out.println();
    }
    **/
    
    
    //evaluates the highest possible route from each position
    //starts at LINES-2 bc last line (LINES-1) doesnt need to be evaluated
    for (int l = LINES-2; l>=0; l--) 
    {
      for (int r = l, c = 0; r>=0 && c<=l; r--,c++)
        //evaluate the largest route possible from this spot
        triangleDS[r][c] += (triangleDS[r+1][c] > triangleDS[r][c+1] ? 
                               triangleDS[r+1][c] : triangleDS[r][c+1]);
    }
    System.out.println(triangleDS[0][0] + " is the maximum total from top to " +
                       "bottom of the triangle provided, by starting at the t" +
                       "op of the triangle below and moving to adjacent numbe" +
                       "rs on the row below");
  }
}