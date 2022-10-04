package com.dsa.recursion;

public class PrintTargetSumSubset {

    public static void main(String[] args) {


        printTargetSumSubsets(new int[] {10,29,40,50},0,"",0,30);
    }

    public static void printTargetSumSubsets(int[] array,int idx,String set,int sos,int tar)
    {

         if(idx==array.length)
         {
             if(tar==sos)
             {
                 System.out.println(set);
             }
           return;
         }

        printTargetSumSubsets(array,idx+1,set+array[idx]+",",sos+array[idx],tar);
        printTargetSumSubsets(array,idx+1,set,sos,tar);

    }

}
