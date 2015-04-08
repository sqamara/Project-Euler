import java.util.*;
import java.io.*;
public class Problem11
{
  public static void main(String args[]) throws IOException
  {
   java.io.File in = new java.io.File("20x20grid.txt");
   Scanner input = new Scanner(in);
   
   String s = "";
   
   int[][] grid = new int[20][20];
   
   for (int r =0; r<20; r++)
   {
     for (int c=0; c<20; c++)
     {
       grid[r][c] = input.nextInt();
     }
   }
   /**
   System.out.println("Horizaontal: " +greatestHorizontalProduct(grid));
   System.out.println("Vertical: " + greatestVerticalProduct(grid));
   System.out.println("NW to SE: " + greatestNWToSEProduct(grid));
   System.out.println("NE to SW: " + greatestNEToSWProduct(grid));
   **/
   
   int greatest = 0;
   int[] highestDirectionalSums = new int[4];
   highestDirectionalSums[0] = greatestHorizontalProduct(grid);
   highestDirectionalSums[1] = greatestVerticalProduct(grid);
   highestDirectionalSums[2] = greatestNWToSEProduct(grid);
   highestDirectionalSums[3] = greatestNEToSWProduct(grid);
   
   for (int i = 0; i < 4; i++)
   {
     if (highestDirectionalSums[i] > greatest)
       greatest = highestDirectionalSums[i];
   }
   System.out.println(greatest + " is the greatest product of four adjacent n" +
                      "umbers in the same direction (up, down, left, right, or" +
                      "diagonally) in the 20x20 grid");
   
  }
  
  private static int greatestHorizontalProduct( int[][] grid )
  {
    int greatest=0, product;
    for (int r =0; r<20; r++)
    {
     for (int c=0; c<20-3; c++)
     {
       product = grid[r][c] * grid[r][c+1] * grid[r][c+2] *grid[r][c+3];
       if (product > greatest)
         greatest = product;
     }
    }
    return greatest;
  }
  private static int greatestVerticalProduct( int[][] grid )
  {
    int greatest=0, product;
    for (int r =0; r<20-3; r++)
    {
     for (int c=0; c<20; c++)
     {
       product = grid[r][c] * grid[r+1][c] * grid[r+2][c] *grid[r+3][c];
       if (product > greatest)
         greatest = product;
     }
    }
    return greatest;
  } 
  
  private static int greatestNWToSEProduct( int[][] grid )
  {
    int greatest=0, product;
    for (int r =0; r<20-3; r++)
    {
     for (int c=0; c<20-3; c++)
     {
       product = grid[r][c] * grid[r+1][c+1] * grid[r+2][c+2] *grid[r+3][c+3];
       if (product > greatest)
         greatest = product;
     }
    }
    return greatest;
  }
  
   private static int greatestNEToSWProduct( int[][] grid )
  {
    int greatest=0, product;
    for (int r =19; r>=3; r--)
    {
     for (int c=0; c<20-3; c++)
     {
       product = grid[r][c] * grid[r-1][c+1] * grid[r-2][c+2] *grid[r-3][c+3];
       if (product > greatest)
         greatest = product;
     }
    }
    return greatest;
  }
}