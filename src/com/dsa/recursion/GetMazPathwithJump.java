package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class GetMazPathwithJump {


    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8, 9, 12};
        int sum = calculateSum(arr, 0);

        System.out.println(sum);
    }

    private static int calculateSum(int arr[], int idx) {

        //base or terminating condition
        if (idx>=arr.length) {
            return 0;
        }

        int sum=arr[idx];
        System.out.println("n value" + sum);
        //Calling method recursively
        return calculateSum(arr, idx+1 ) + sum;
    }








    public static List<String> getmazPathwithJump(int sr, int sc, int dr, int dc) {


        if(sr==dr&&sc==dc)
        {
            List<String> dotpath=new ArrayList<>();
            dotpath.add("");
            return dotpath;
        }

        List<String> allPaths = new ArrayList<>();

        //horizontal move
        for (int ms = 1; ms <= dc - sc; ms++) {
            List<String> hpaths = getmazPathwithJump(sr, sc + ms, dr, dc);
            for (String hpath : hpaths) {
                 allPaths.add("h" + ms+hpath);

            }
        }

        //vertical move
        for (int ms = 1; ms <= dr - sr; ms++) {
            List<String> vpaths = getmazPathwithJump(sr+ms, sc, dr, dc);
            for (String vpath : vpaths) {
                allPaths.add("v" + ms+vpath);

            }
        }


        //diagonal move
        for (int ms = 1; ms <= dr - sr && ms <=dc-sc; ms++) {
            List<String> dpaths = getmazPathwithJump(sr+ms, sc+ms, dr, dc);
            for (String dpath : dpaths) {
                allPaths.add("d" + ms+dpath);

            }
        }

        return allPaths;
    }

}



