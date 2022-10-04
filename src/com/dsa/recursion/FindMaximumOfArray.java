package com.dsa.recursion;

public class FindMaximumOfArray {

    public static void main(String[] args) {
        int[] arry = {12, 2, 33, 7, 19};

        System.out.println("Max element" + maxDisplay(arry, 0));
    }

    public static int maxDisplay(int[] arry, int idx) {

        //Base condition
        if (idx == arry.length - 1)
            return arry[idx];

        int misa = maxDisplay(arry, idx + 1);
        if (misa > arry[idx])
            return misa;
        else
            return arry[idx];
    }
}
