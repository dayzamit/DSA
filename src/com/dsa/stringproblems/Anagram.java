package com.dsa.stringproblems;

import java.util.Arrays;
import java.util.HashSet;

public class Anagram {

    static int possibleNumOFChar=256;
    public static void main(String[] args)
    {
        System.out.println("isAnagram" + isWordAnagram("listen","slient"));
    }

    static boolean isWordAnagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())
            return false;
         // Create 2 count arrays and initialize
        // all values as 0
        int[] countArray1 =new int[possibleNumOFChar];
        int[] countArray2 =new int[possibleNumOFChar];
        Arrays.fill(countArray1,0);
        Arrays.fill(countArray2,0);
        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (int i=0;i<s1.length();i++)
        {
            countArray1[s1.charAt(i)]++;
            countArray2[s2.charAt(i)]++;
        }
        // Compare count arrays
        for(int j=0;j<possibleNumOFChar;j++)
        {
            if(countArray1[j]!=countArray2[j])
                return false;
        }
        return true;
    }
}
