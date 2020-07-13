package leetcode;

import java.util.HashMap;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/5/9
 */
public class Solution56 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int singNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                count.put(nums[i], count.get(nums[i]) + 1);
            } else {
                count.put(nums[i], 1);
            }

        }
        for (int key : count.keySet()) {
            if (count.get(key) == 1) {
                singNum = key;
            }
        }
        return singNum;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 10, 10, 10, 5, 5};
        singleNumber(nums);

    }
}
