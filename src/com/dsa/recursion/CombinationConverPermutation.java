package com.dsa.recursion;

public class CombinationConverPermutation {

    public static void main(String[] args) {

        int totalspots=3;
        int totalitemsneedtoselect=2;
        //to check items used or not
        int[] itemsarry=new int[totalitemsneedtoselect];

        comtopermutation(1,totalspots,itemsarry,totalitemsneedtoselect,0,"");
    }

    //box put on lavel then box have ablitity to discard on item i.e not selected
    public  static void comtopermutation(int cb,int tb,int[] items,int ti,int sfs, String asf)
    {

        if(cb>tb)
        {
            if(sfs==ti)
            {
                System.out.println(asf);
            }
            return;
        }


        //when selection and arrengement happen
        //ti is options i.e edges and
        //cb on lavel
         for (int i=0 ;i<ti;i++)
         {
             if(items[i]==0)
             {

                 items[i]=1;
                 comtopermutation(cb+1,tb,items,ti,sfs+1,asf+(i+1));
                 items[i]=0;
             }
         }

         //not selection
         comtopermutation(cb+1,tb,items,ti,sfs,asf+0);

    }
}
