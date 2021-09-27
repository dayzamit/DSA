package com.dsa.BackTracking;

//Backtracking Algorithm

/*If destination is reached
        print the solution matrix
        Else
        a) Mark current cell in solution matrix as 1.
        b) Move forward in the horizontal direction and recursively check if this
        move leads to a solution.
        c) If the move chosen in the above step doesn't lead to a solution
        then move down and check if this move leads to a solution.
        d) If none of the above solutions works then unmark this cell as 0
        (BACKTRACK) and return false.*/
public class RateMaze {

    private static final int SIZE = 4;

    //the maze problem
    private static int[][] maze = {
            {0,1,0,1,1},
            {0,0,0,0,0},
            {1,0,1,0,1},
            {0,0,1,0,0},
            {1,0,0,1,0}
    };

    static int lengthpath=0;

    //matrix to store the solution
    private static int[][] solution = new int[SIZE][SIZE];

    //function to print the solution matrix
    private static void printSolution()
    {
        for(int i=0;i<SIZE;i++)
        {
            for(int j=0;j<SIZE;j++)
            {
                System.out.print(solution[i][j]+"\t");
            }
            System.out.print("\n\n");
        }
    }

    //function to solve the maze
    //using backtracking
    private static boolean solveMaze(int r, int c)
    {
        //if destination is reached, maze is solved
        //destination is the last cell(maze[SIZE-1][SIZE-1])
        if((r==SIZE-1) && (c==SIZE-1))
        {
            solution[r][c] = 1;
            lengthpath++;
            System.out.println("total path count" +lengthpath);

            return true;
        }
        //checking if we can visit in this cell or not
        //the indices of the cell must be in (0,SIZE-1)
        //and solution[r][c] == 0 is making sure that the cell is not already visited
        //maze[r][c] == 0 is making sure that the cell is not blocked
        if(r>=0 && c>=0 && r<SIZE && c<SIZE && solution[r][c] == 0 && maze[r][c] == 0)
        {
            //if safe to visit then visit the cell
            solution[r][c] = 1;
            lengthpath++;
            //going down
            if(solveMaze(r+1, c))
                return true;
            //going right
            if(solveMaze(r, c+1))
                return true;
            //going up
            if(solveMaze(r-1, c))
                return true;
            //going left
            if(solveMaze(r, c-1))
                return true;
            //backtracking
            solution[r][c] = 0;
            lengthpath--;

            return false;
        }
        return false;

    }


    public static void main(String args[])
    {


        if (solveMaze(0,0))
            printSolution();
        else
            System.out.println("No solution\n");

    }
}




