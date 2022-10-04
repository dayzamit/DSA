package com.dsa.recursion;

public class PrintZigZag {

    public static void main(String[] args)
    {
           print(3);
    }


    static void print(int n)
    {
        //base condition
        if(n==0)
        {
            return;
        }

        System.out.println("Pre Area" + n);  //Pre Area
        print(n-1); //Left call
        System.out.println("In Area" + n);  //In Area
        print(n-1); //Right call
        System.out.println("Post Area" + n); //Post Area

    }
}
