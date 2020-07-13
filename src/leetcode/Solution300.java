package leetcode;

import java.util.Arrays;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/5/29
 */
/*
 给定一个无序的整数数组，找到其中最长上升子序列的长度。

示例:

输入: [10,9,2,5,3,7,101,18]
输出: 4
解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-increasing-subsequence
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution300 {
    public static int lengthOfLIS(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return length;
        }
        int dep[] = new int[length];
        Arrays.fill(dep, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dep[i] = Math.max(dep[j] + 1, dep[i]);
                }
            }
        }
        int count=1;
        for(int i=0;i<dep.length;i++){
            count=Math.max(count,dep[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 4};
        System.out.println(lengthOfLIS(nums));

    }
}
