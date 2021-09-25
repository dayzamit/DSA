package com.dsa.dfsmatrix;

import java.util.Stack;

public class NumOFFindPaths {

    public static void findPath(int[][] mat, Stack<Integer> pathStore, int row, int col) {

        if (mat == null || mat.length == 0)
            return;

        int M = mat.length;
        int N = mat[0].length;

        //if the last cell is reached, print the route
        if (row == M - 1 && col == N - 1) {

            pathStore.push(mat[row][col]);
            System.out.println(pathStore);
            pathStore.pop();

            return;
        }

        //the current cell in the path
        pathStore.push(mat[row][col]);
        //move right i.e col icrement by one from each cell(i,j)
        if ((row >= 0 && row < M && col + 1 >= 0 && col + 1 < N)) {
            findPath(mat, pathStore, row, col + 1);
        }

        //move down i.e row icrement by one from each cell(i,j)

        if ((row + 1 >= 0 && row + 1 < M && col >= 0 && col < N)) {
            findPath(mat, pathStore, row + 1, col);
        }

        // backtrack: remove the current cell from the path
        pathStore.pop();

    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2},
                       {4, 5}
                       };
        Stack<Integer> initialPath= new Stack<>();

        // start from `(0, 0)` cell
        int x=0,y=0;
        findPath(mat,initialPath,x,y);

    }

}
