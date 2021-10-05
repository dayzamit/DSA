package com.dsa.recursion;

public class FiocUsingImproveVersionRecursion {

    public static void main(String[] args) {
        int[] arry = {2, 3, 6, 9, 8, 3, 2, 6, 2, 4};
        System.out.println("first Occurence of Element" + findFirstOccrence(arry, 0, 3));

    }

    public static int findFirstOccrence(int[] arry, int idx, int targetData) {

        if (idx == arry.length - 1)
            return -1;

        if (targetData == arry[idx])
            return idx;
        else {
            int fiisa = findFirstOccrence(arry, idx + 1, targetData);

            return fiisa;
        }


    }
}
