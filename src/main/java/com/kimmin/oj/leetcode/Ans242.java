package com.kimmin.oj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kimmin on 5/3/16.
 */
public class Ans242 {
    public class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()) return false;
            Map<Character, Integer> map1 = new HashMap<Character, Integer>();
            Map<Character, Integer> map2 = new HashMap<Character, Integer>();
            for(int i=0; i<s.length(); i++){
                if(!map1.containsKey(s.charAt(i))){
                    map1.put(s.charAt(i), 1);
                }else{
                    int val = map1.get(s.charAt(i));
                    map1.put(s.charAt(i), val + 1);
                }

                if(!map2.containsKey(t.charAt(i))){
                    map2.put(t.charAt(i), 1);
                }else{
                    int val = map2.get(t.charAt(i));
                    map2.put(t.charAt(i), val + 1);
                }
            }

            for(Character c: map1.keySet()){
                Integer i1 = map1.get(c);
                Integer i2 = map2.get(c);
                if(i1 == null || i2 == null) return false;
                if(i1.intValue() != i2.intValue()) return false;
            }
            for(Character c: map2.keySet()){
                Integer i1 = map1.get(c);
                Integer i2 = map2.get(c);
                if(i1 == null || i2 == null) return false;
                if(i1.intValue() != i2.intValue()) return false;
            }
            return true;
            
        }
    }
}
