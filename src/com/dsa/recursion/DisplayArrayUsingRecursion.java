package com.dsa.recursion;

public class DisplayArrayUsingRecursion {

    public static void main(String[] args)
    {
        int[] array={10,20,30,40,50};
        displayArrayReverse(array,0);


    }

    //Ex =
    public static void displayArray(int[] arry, int idx)
    {
        //Base condition
        if(idx==arry.length)
        return;
        System.out.println(arry[idx]);
        displayArray(arry,idx); // Recursive call

    }

    public static void displayArrayReverse(int[] arry, int idx)
    {
        //Base conditiondisplayArray1
        if(idx==arry.length)
            return;
        displayArrayReverse(arry,idx+1); // Recursive call
        System.out.println(arry[idx]);


    }
}
