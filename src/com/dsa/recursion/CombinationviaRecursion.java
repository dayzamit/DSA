package com.dsa.recursion;

public class CombinationviaRecursion {

    public static void main(String[] args) {

        int nboxes=3;
        int ritems=2;
        combinations(0,nboxes,0,ritems,"");
    }


    static int count=0;
    public static void combinations(int cb,int tb,int ssf, int ti,String asf)
    {

          if(cb>tb)
          {
               if(ssf==ti)
               {
                   System.out.println(asf);
               }

               count++;
              System.out.println("Base call = > " + count );
              return;
          }


         //put item on level,able to select a box
        combinations(cb+1,tb,ssf+1,ti,asf+"i");
        //put itm on level, not able to intrested select box
        combinations(cb+1,tb,ssf,ti,asf+"-");

    }
}
