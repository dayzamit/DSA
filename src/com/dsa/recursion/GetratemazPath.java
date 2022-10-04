package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class GetratemazPath {

    public static void main(String[] args) {

        System.out.println(getmazPath(1,1,3,3).size());
    }

    public static List<String> getmazPath(int sr,int sc,int dr,int dc)
    {
         if(sr==dr && sc==dc)
         {
             List<String> recPath=new ArrayList<>();
             recPath.add("");
             return recPath;
         }

        List<String> vPath= new ArrayList<>();
        List<String> hPath= new ArrayList<>();

        if(sc<dc)
        {
            hPath=getmazPath(sr,sc+1,dr,dc);
        }
        if(sr<dr)
        {
            vPath=getmazPath(sr+1,sc,dr,dc);
        }

        List<String> allPath= new ArrayList<>();

        for(String hpathone: hPath)
        {
            allPath.add("h"+hpathone);
        }

        for(String vpathone: vPath)
        {
            allPath.add("v"+vpathone);
        }

        return allPath;


    }
}
