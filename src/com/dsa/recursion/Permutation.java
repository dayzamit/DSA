package com.dsa.recursion;

public class Permutation {


    public static void main(String[] args) {

String inputString ="acbcde";

     char fchar=inputString.charAt(3);

     String lString=inputString.substring(0,3);
     String rString=inputString.substring(4);

        System.out.println("fchar" + fchar);
        System.out.println("lString" + lString);
        System.out.println("rstring" + rString);



        //printPermutations("abc","");
    }

    public static void printPermutations(String str, String asf) {

        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }


        for(int i=0;i<str.length();i++)
        {

            char ch=str.charAt(i);
            String lp=str.substring(0,i);
            String rp=str.substring(i+1);
            String ros=lp+rp;
            printPermutations(ros,asf+ch);
        }

    }




}
