package com.dsa.array;

public class LiocusingRecursion {

    public static void main(String[] args)
    {

        int[] arry = {2, 3, 6, 9, 8, 3, 2, 3,6, 2, 4};
        System.out.println("last Occurence of Element" +findLioc(arry,0,3));
    }

    public static int findLioc(int[] arry,int idx,int searchData)
    {

        if(idx==arry.length)
            return -1;

        int lisia=findLioc(arry,idx+1,searchData);
        if(lisia==-1)
        {
            if(arry[idx]==searchData)
                return idx;
            else
                return -1;

        }else{
            return lisia;
        }


    }

}
