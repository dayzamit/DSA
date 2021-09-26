package com.dsa.BackTracking;

public class MazeFinderUsingBacktraing {

    public static void main(String[] args)
    {
        //Matrix in Binary Format
        int matrix[][] =
                {
                        { 1, 1, 0, 0, 0, 1, 1},
                        { 0, 1, 1, 1, 1, 1, 1},
                        { 1, 0, 0, 1, 0, 1, 1},
                        { 0, 1, 1, 1, 0, 0, 1},
                        { 0, 1, 0, 1, 1, 1, 1},
                        { 0, 1, 0, 0, 1, 0, 0},
                        { 1, 0, 1, 1, 1, 1, 1}
                };

        //Start and End cell
        int[] start={0,0};
        int[] end={6,6};
        //Driver code
        Maze maze = new Maze(matrix, start, end);
        maze.findPathInMaz();

        //Output the shortest length if the maze have any
        if(maze.hasPath)
            System.out.println("Shortest Path Length: "+maze.shortLengthPath);
        else
            System.out.println("No Path Possible");
    }
}
