package leetcode;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/4/28
 */
public class Solution {
    public int[] singleNumbers(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                count.put(nums[i], 2);
            } else {
                count.put(nums[i], 1);
            }
        }
        int[] rsult = new int[2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                rsult[i] = entry.getKey();
                i++;
            }
        }
        return rsult;
    }

    public static int[] pondSizes(int[][] a) {
        //深度优先算法
        int[] ress = new int[a.length * a[0].length];
        int k = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0) {
                    int count = dfs(a, i, j);
                    ress[k] = count;
                    k++;
                }
            }
        }
        for (int i = 1; i < k; i++) {
            for (int j = 0; j < i; j++) {
                if (ress[j] > ress[i]) {
                    int tep = ress[i];
                    ress[i] = ress[j];
                    ress[j] = tep;
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = ress[i];
        }
        return result;
    }

    public static int dfs(int[][] a, int i, int j) {
        if (i < 0 || i >= a.length || j < 0 || j >= a[i].length || a[i][j] != 0) {
            return 0;
        }
        int count = 1;
        a[i][j] = -1;
        count += dfs(a, i - 1, j);
        count += dfs(a, i + 1, j);
        count += dfs(a, i - 1, j + 1);
        count += dfs(a, i + 1, j + 1);
        count += dfs(a, i - 1, j - 1);
        count += dfs(a, i + 1, j - 1);
        count += dfs(a, i, j + 1);
        count += dfs(a, i, j - 1);
        return count;

    }

    public static void main(String[] args) {
        int[][] a = {{0, 2, 1, 0}, {0, 1, 0, 1}, {1, 1, 0, 1}, {0, 1, 0, 1}};
       // int[] c = poolSize(a);
       /* for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }*/
    }
}

