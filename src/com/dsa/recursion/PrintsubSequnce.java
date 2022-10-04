package com.dsa.recursion;

public class PrintsubSequnce {


    public static void main(String[] args) {

        getPrintSequance("abc","");
    }




    public static void getPrintSequance(String str,String sans)
    {

        if(str.length()==0)
        {
            System.out.println(sans);
            return;
        }


        char ch=str.charAt(0);
        String ros=str.substring(1);

        getPrintSequance(ros,sans+"");
        getPrintSequance(ros,sans+ch);

    }
}
;