package com.dsa.recursion;

public class AllIndicesUsingRecursion {


    public static void main(String args[]) {
        int[] arry = {2, 3, 6, 9, 8, 3, 2, 3, 6, 2, 4};
        displayElemnt(findAllIndices(arry, 0, 3, 0), 0);
    }

    public static void displayElemnt(int[] arry, int idx) {

        if (idx == arry.length)
            return;

        displayElemnt(arry, idx + 1);
        System.out.println("Element " + arry[idx]);
    }

    public static int[] findAllIndices(int[] arry, int idx, int targetData, int fsf) {
        //base case
        if (idx == arry.length - 1) {
            return new int[fsf];
        }

        if (arry[idx] == targetData) {
            int[] iArry = findAllIndices(arry, idx + 1, targetData, fsf + 1);
            iArry[fsf] = idx;
            return iArry;

        } else {
            int[] iArry = findAllIndices(arry, idx + 1, targetData, fsf);
            return iArry;

        }
    }

}
