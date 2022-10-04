package com.dsa.recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class GetStairpath {

    public static void main(String[] args) {
        List<String> allpathFind = getPathViaLoop(5);
        System.out.println(allpathFind.stream().collect(Collectors.toList()));

        List<String> allpathFind1 = getPath(5);
        System.out.println(allpathFind1.stream().collect(Collectors.toList()));


    }


    public static List<String> getPathViaLoop(int n) {

        if (n == 0) {
            List<String> recpathold = new ArrayList<>();
            recpathold.add("");
            return recpathold;
        } else if (n < 0) {
            List<String> recpatholdemty = new ArrayList<>();

            return recpatholdemty;
        }


        List<String> allpath = new ArrayList<>();

        for (int i = 1; i <=3; i++) {
            List<String> recPath1 = getPath(n-i);

            for (String path : recPath1) {

                allpath.add(i + path);

            }
        }


        return allpath;
    }

    public static List<String> getPath(int n) {

        if (n == 0) {
            List<String> recpathold = new ArrayList<>();
            recpathold.add("");
            return recpathold;
        } else if (n < 0) {
            List<String> recpatholdemty = new ArrayList<>();

            return recpatholdemty;
        }

        List<String> recPath1 = getPath(n - 1);
        List<String> recPath2 = getPath(n - 2);
        List<String> recPath3 = getPath(n - 3);

        List<String> allpath = new ArrayList<>();

        for (String path : recPath1) {
            allpath.add(1 + path);
        }


        for (String path2 : recPath2) {
            allpath.add(2 + path2);
        }


        for (String path3 : recPath3) {
            allpath.add(3 + path3);
        }
        return allpath;
    }
}
