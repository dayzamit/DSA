package com.dsa.stringproblems;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    public static void main(String args[])
    {
        System.out.println("isMorphic " + validateMorphicString("paper","title"));
    }

    static boolean validateMorphicString(String source, String target)
    {
        Map<Character,Character> charMap= new HashMap<>();
        Map<Character,Boolean> unusedCharmap= new HashMap<>();

        for (int i=0;i<source.length();i++)
        {
            char ch1=source.charAt(i);
            char ch2=target.charAt(i);

            if(charMap.containsKey(ch1)==true)
            {
                if(charMap.get(ch1)!= ch2)
                {
                    return false;
                }
            }else{
                 if(unusedCharmap.containsKey(ch2)==true)
                 {
                     return  false;
                 }else{
                     charMap.put(ch1,ch2);
                     unusedCharmap.put(ch2,true);
                 }
            }
        }

        return true;
    }
}
