package com.dsa.recursion;

public class PermutaionConvertCombination {

    public static void main(String[] args) {

        int box=4;
        int cb=1;
        int ti=3;
        int llb=-1;
        PtoC(new boolean[box],cb,ti,llb);
    }

    public static void PtoC(boolean[] boxes,int cb,int ti,int llb)
    {
        if(cb>ti)
        {
             for(int i=0;i<boxes.length;i++)
             {
                 if(boxes[i])
                 {
                     System.out.print("i");
                 }else{
                     System.out.print("-");
                 }
             }
            System.out.println();
            return;
        }

        for(int b=llb+1;b<boxes.length;b++)
        {
            if(boxes[b]==false)
            {
                boxes[b]=true;
                PtoC(boxes,cb+1,ti,b);
                boxes[b]=false;
            }
        }
    }
}
