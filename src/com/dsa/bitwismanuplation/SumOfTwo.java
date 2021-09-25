package com.dsa.bitwismanuplation;

public class SumOfTwo {
    //Step 1 − Find XOR of a and b i.e. a^b and store it in the result variable.

    //Step 2 − Check if {(a & b) << 1} == 0

    //Step 2.1 − If it is equal to 0, then print the result, it is the final result.

   //Step 2.2 − If it is not equal to 0, then go to step 1, with a = {(a & b) << 1} and b = result.


    public static void main(String[] args)
    {
        int a=20; int b=20;

        addwithoutAOP(a,b);
    }

    public static void addwithoutAOP(int a, int b)
    {
        int result=a^b;
        int carry=(a & b) << 1;

        if(carry==0)
            System.out.print("Sum is" + result);
        else
            addwithoutAOP(result,carry);

    }

}
