package com.dsa.recursion;

import java.util.Arrays;

public class AllIndex {


    public static void main(String[] args)
    {

        System.out.println(Arrays.stream(allIndices(new int[]{5,7,5,6,7,2,4,7,5}, 5, 0,0)));
    }


   static int[] allIndices(int[] array, int x,int idx, int fsf)
   {
         if(idx==array.length)
         {
             return new int[fsf];
         }

               if(array[idx]==x) {
                   int[] idxarr = allIndices(array, x, idx + 1, fsf + 1);
                   idxarr[fsf]=idx;
                   return idxarr;
               }
               else {
                   return  allIndices(array, x, idx + 1, fsf + 1);
               }
   };


}
