package com.dsa.dfsmatrix;

public class NoOfIslandsRecursion {

    public static int numIslands(char[][] grid)
    {
        int numRows=grid.length;
        int totalNumOfresult=0;

        if(numRows==0)
            return 0;

        int numCols=grid[0].length;

        for (int i=0;i<numRows;i++)
        {
            for (int j=0;j<numCols;j++)
            {
                if(grid[i][j]=='1')
                {
                    DFSUtil(grid,i,j);
                    totalNumOfresult++;
                }
            }
        }


        return totalNumOfresult;

    }

    public static void DFSUtil(char[][] isLandgrid, int row, int col) {



        int H = isLandgrid.length;
        int L = isLandgrid[0].length;

        if (row < 0 || col < 0 || row >= H || col >= L || isLandgrid[row][col]!='1')
            return;
        //mark the cell visited
        isLandgrid[row][col] = '2';
        DFSUtil(isLandgrid, row+ 1, col); // go down
        DFSUtil(isLandgrid, row- 1, col); //go  up
        DFSUtil(isLandgrid, row, col + 1); //go right
        DFSUtil(isLandgrid, row, col - 1); // go left

    }

    public static void main(String[] args) {

        char [][] islandGrid = new char[][] {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};

        System.out.println("No of Islands: " + numIslands(islandGrid));

        islandGrid = new char[][] {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        System.out.println("No of Islands: " + numIslands(islandGrid));
    }
}
