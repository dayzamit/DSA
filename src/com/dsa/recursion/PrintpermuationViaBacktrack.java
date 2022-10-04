package com.dsa.recursion;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

public class PrintpermuationViaBacktrack {


    public static void main(String[] args) {

        int[] boxes = new int[]{0, 0, 0, 0};
        int rTotalitems = 2;
        printBoxPermViaBack(boxes, 1, rTotalitems);

      /*  String ipStr="aabb";
        Character[] spots= new Character[ipStr.length()];

        Map<Character,Integer> map=new HashMap<>();
        for(Character ch: ipStr.toCharArray())
        {
            map.put(ch,-1);
        }
        generatewords(0,ipStr,spots,map);*/
    }

    //item put on level

    public static void generatewords(int cc, String str, Character[] spots, Map<Character, Integer> lastoccurence) {

        if (cc == str.length()) {
            for (int i = 0; i < spots.length; i++) {
                System.out.print(spots[i]);
            }
            System.out.println();
            return;
        }

        char ch = str.charAt(cc);
        int lo = lastoccurence.get(ch);

        for (int i = lo + 1; i < spots.length; i++) {
            if (spots[i] == null) {
                spots[i] = ch;
                lastoccurence.put(ch, i);
                generatewords(cc + 1, str, spots, lastoccurence);
                lastoccurence.put(ch, -1);
                spots[i] = null;

            }
        }
    }


    //box put on level
    public static void printStringperm(int cs, int ti, HashMap<Character, Integer> fmap, String asf) {
        if (cs > ti) {
            System.out.println(asf);
            return;
        }

        for (Character ch : fmap.keySet()) {
            if (fmap.get(ch) > 0) {
                fmap.put(ch, fmap.get(ch) - 1);
                printStringperm(cs + 1, ti, fmap, asf + ch);
                //this statment when base condtion over
                fmap.put(ch, fmap.get(ch) + 1);
            }
        }

    }


    //items put on level
    //options are boxes
    static int count = 0;

    public static void printBoxPermViaBack(int[] boxes, int ci, int ti) {


        if (ci > ti) {
            for (int i = 0; i < boxes.length; i++) {

                System.out.print(boxes[i]);

            }
            count++;
            System.out.println(" >> base call >>" +count );
            return;
        }


        for (int i = 0; i < boxes.length; i++) {

            if (boxes[i] == 0) {
                boxes[i] = ci;
                printBoxPermViaBack(boxes, ci + 1, ti);
                boxes[i] = 0;
            }
        }
    }
}
