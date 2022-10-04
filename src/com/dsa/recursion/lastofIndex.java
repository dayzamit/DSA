package com.dsa.recursion;

public class lastofIndex {

    public static void main(String[] args)
    {
         int indexOccurence=lastIndexOccurence(new int[] {3,3,6,5,4,5,6},0,5);

        System.out.println(indexOccurence);
    }


    public static int lastIndexOccurence(int[] array,int idx, int finelemtn)
    {
        if(idx==array.length)
        {
            return -1;
        }

                int lies =lastIndexOccurence(array,idx+1,finelemtn);

                if(lies==-1)
                {
                    if(array[idx]==finelemtn)
                    {
                        return idx;
                    }else{
                        return -1;
                    }
                }else{
                    return lies;
                }
    }
}
