package leetcode;

import java.util.HashMap;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/4/30
 */
public class Solution_01_01 {
    public static boolean isUnique(String astr) {
        Boolean isu = true;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < astr.length(); i++) {
            if (map.containsKey(astr.charAt(i))){
                isu=false;
                break;
            }
            else{
                map.put(astr.charAt(i),1);
            }
        }
        return isu;
    }
    public static void main(String[] args) {
         String s="ltcode";
         System.out.println(isUnique(s));

    }
}
