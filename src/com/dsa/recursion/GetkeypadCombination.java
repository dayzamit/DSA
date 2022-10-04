package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class GetkeypadCombination {


    public static void main(String[] args)
    {
        System.out.println(getKeyPad("678").size());
    }

    static String[] mapping = new String[] {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static List<String> getKeyPad(String inputString)
    {
         if(inputString.length()==0)
         {
             List<String> baseresult= new ArrayList<>();
             baseresult.add("");
             return baseresult;
         }
           char firstChar=inputString.charAt(0);
           String ros=inputString.substring(1);
           List<String> recurResultList =getKeyPad(ros);
           List<String> myresultList= new ArrayList<>();

        String codeForeach=mapping[firstChar-'0'];
        for (int i=0;i<codeForeach.length();i++)
        {
            char chcode=codeForeach.charAt(i);
            for (String rstr:recurResultList)
            {
                myresultList.add(chcode+rstr);
            }
        }
        return myresultList;
    }
}

