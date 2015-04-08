public class Problem15
{
  final static int GRID_DIMENSIONS = 20;
  final static int ARRAY_DIMEN = (GRID_DIMENSIONS + 1);
  public static void main(String args[])
  {
    //creates a 2d array where each element is a point in grid
    long[][] grid = new long[ARRAY_DIMEN][ARRAY_DIMEN];
    
    //sets rightmost col and bottom most row to 1's
    for(int i = 0; i<ARRAY_DIMEN; i++)
    {
      grid[ARRAY_DIMEN-1][i] = 1;
      grid[i][ARRAY_DIMEN-1] = 1;
    }
    
    //starting from grid[ARRAY_DIMEN-2][ARRAY_DIMEN-2] 
    //calculates each element before it
    for(int r = ARRAY_DIMEN-2 ; r>=0; r--)
    {
      for(int c = ARRAY_DIMEN-2; c>=0; c--)
      {
        grid[r][c] = grid[r+1][c] + grid[r][c+1];
      }
    }
    
    /**
    //prints the grid that represents potential moves
    for(int r = 0; r<ARRAY_DIMEN; r++)
    {
      for(int c = 0; c<ARRAY_DIMEN; c++)
        System.out.print(String.format("%10d", grid[r][c]));
      System.out.println();
    }
    **/
    System.out.println(grid[0][0] + " is the amount of routes through a 20x20" +
                       " grid");
  }
}