package com.dsa.recursion;

import java.util.Scanner;

public class nQueens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] chess = new int[n][n];
        NPrintQueens(chess,"",0);
    }

    public static void NPrintQueens(int[][] chess,String qsf,int row)
    {

        //level always in paramter in case of 2d matrix
        //option inside the for loop

        if(row== chess.length)
        {
            System.out.println(qsf);
            return;
        }

        for(int col=0;col<chess.length;col++)
        {
            chess[row][col]=1;
            NPrintQueens(chess,qsf + row+"-"+ col+",",row+1);
            chess[row][col]=0;
        }

    }
}
