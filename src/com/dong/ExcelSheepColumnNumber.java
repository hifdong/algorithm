package com.dong;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 *For example:
 *  A -> 1
 *  B -> 2
 *  C -> 3
 *   ...
 *  Z -> 26
 *  AA -> 27
 *  AB -> 28
 *
 *
 * */
public class ExcelSheepColumnNumber {
    public int titleToNumber(String s) {
     Map<String, Integer> map = new HashMap<String, Integer>();
     map.put("A", 1);
     map.put("B", 2);
     map.put("C", 3);
     map.put("D", 4);
     map.put("E", 5);
     map.put("F", 6);
     map.put("G", 7);
     map.put("H", 8);
     map.put("I", 9);
     map.put("J", 10);
     map.put("K", 11);
     map.put("L", 12);
     map.put("M", 13);
     map.put("N", 14);
     map.put("O", 15);
     map.put("P", 16);
     map.put("Q", 17);
     map.put("R", 18);
     map.put("S", 19);
     map.put("T", 20);
     map.put("U", 21);
     map.put("V", 22);
     map.put("W", 23);
     map.put("X", 24);
     map.put("Y", 25);
     map.put("Z", 26);
        int retNum = 0;
        if (s == null || s.length() <= 0 ) {
           return 0;
        }
       
        for (int i = 0; i < s.length(); i++) {
          String temp = String. valueOf(s.charAt(i));
          retNum = retNum * 26 + map.get(temp);
        }
       
        return retNum;
       
    }
}
