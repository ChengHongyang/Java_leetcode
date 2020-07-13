package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/4/30
 */
public class Solution1443 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] a = new int[s1.length()];
        int[] b=new int[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            int ac = s1.charAt(i);
            int ac2 = s2.charAt(i);
            a[i]=ac;
            //b[]
        }
        Arrays.sort(a);
        return true;
    }
}
