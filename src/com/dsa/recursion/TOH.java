package com.dsa.recursion;

public class TOH {

     public static void main(String[] args)
     {

           TOH(3,1,2,3);
     }

     static void TOH(int n,int td1,int td2,int td3)
     {

          if(n==0)
          {
               return;
          }

          TOH(n-1,td1,td3,td2);
          System.out.println(n+"[ "+td1+"->"+td2+" ]");
          TOH(n-1,td3,td2,td1);
     }
}
