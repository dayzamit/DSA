package com.dsa.BackTracking;

public class Maze {


    int[][] matrix;
    int[][] visited;
    int length=0;

    public int getShortLengthPath() {
        return shortLengthPath;
    }

    int shortLengthPath=Integer.MAX_VALUE;
    int end[],start[];
    boolean hasPath=false;

    public Maze(int[][] grid,int start[],int end[])
    {
        matrix=grid;
        this.start=start;
        this.end=end;
        visited=new int[grid.length][grid[0].length];

    }

    //Function to initiate path search
    public void findPathInMaz()
    {
        visit(start[0],start[1]);
    }

    //Function to visit a cell and recursively move to next cell
    private void visit(int x, int y){

        //Base condition
        if(x==end[0] && y==end[1])
        {

            hasPath=true;
            //Update lenght with the minimum length
            if(length<shortLengthPath)
                shortLengthPath=length;
            //Return to explore more paths
            return;
        }


        //Marked visited cell
        visited[x][y]=1;
        length++;

        //Move Right
        if(canVisit(x,y+1))
            visit(x,y+1);
        //Move Left
        if(canVisit(x,y-1))
            visit(x,y-1);
        //moveUp
        if(canVisit(x-1,y))
            visit(x-1,y);
        //move Down
        if(canVisit(x+1,y))
            visit(x+1,y);

        //Backtracking start below
        //Backtrack - Unvisit the cell
        visited[x][y] = 0;
        //Decrement the current length path by 1
        length--;

    }

    //Function check if (x,y) is a valid cell
    private boolean canVisit(int x, int y){

        //Check boundaries
        if(x<0 || y<0 || x>=matrix.length || y>=matrix[0].length)
            return false;

        //Check for 0 within matrix and already visited cell i.e cellValue=1
        if(matrix[x][y] ==0 || visited[x][y]==1)
            return false;

        return true;
    }


}
