package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class GkpcUsingRecursion {


    public static void main(String[] args) {

        System.out.println(getKpCom("678"));
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};

    public static List<String> getKpCom(String str) {

        if (str.length() == 0) {
            List<String> bal = new ArrayList<>();
            bal.add("");
            return bal;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        List<String> rres = getKpCom(ros);
        List<String> finalcom=new ArrayList<>();

        String dkmap=codes[ch-'0'];

        for (int i=0;i<dkmap.length();i++)
        {
            for(int j=0;j<rres.size();j++)
            {
               finalcom.add(dkmap.charAt(i) +rres.get(j));
            }
        }

return finalcom;
    }
}

