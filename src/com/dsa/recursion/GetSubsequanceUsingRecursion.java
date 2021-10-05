package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class GetSubsequanceUsingRecursion {



    public static void main(String[] args) {

        System.out.println("Subsequance" + getSubString("äbc"));

    }

    //faith
    //bc->[--,-c,b-,bc]

    //expection
    //abc->[---,--c,-b-,-bc,a--,a-c,ab-,abc]

    public static List<String> getSubString(String str) {
        //Passed parameter str="abc"

        //base condition
        if (str.length() == 0) {
            List<String> bal = new ArrayList<>();
            bal.add("");

            return bal;
        }

        char fc = str.charAt(0); //a
        String ros = str.substring(1); //bc

        List<String> ras = getSubString(ros); //bc

        List mres = new ArrayList();

        for (String rstrfa : ras) {
            mres.add("" + rstrfa);
        }

        for (String rstrfa : ras) {
            mres.add(fc + rstrfa);
        }

        return mres;
    }
}
