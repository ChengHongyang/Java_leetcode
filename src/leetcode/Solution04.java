package leetcode;

/**
 * @description:
给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。

请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。

你可以假设 nums1 和 nums2 不会同时为空。

 

示例 1:

nums1 = [1, 3]
nums2 = [2]

则中位数是 2.0

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/7/13
 */
class Solution04 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return Midian(nums2);
        } else if (nums2.length == 0) {
            return Midian(nums1);
        }
        else {
            int[] sum=new int[nums1.length+nums2.length];
            int pointA=0;
            int pointB=0;
            for (int i=0;i<nums1.length+nums2.length;i++){
                if (pointA>=nums1.length||(pointA<nums1.length&&pointB<nums2.length&&nums1[pointA]>nums2[pointB]))
                {
                    sum[i]=nums2[pointB];pointB++;
                    continue;
                }
                if (pointB>=nums2.length||(pointA<nums1.length&&pointB<nums2.length&&nums1[pointA]<=nums2[pointB])){
                    sum[i]=nums1[pointA];pointA++;
                }
            }
            return Midian(sum);
        }
    }

    public  static double Midian(int[] nums) {
        if (nums.length % 2 == 0) {
           int c= nums[nums.length / 2];
           int c1=nums[nums.length / 2 - 1];
            return (double) (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2;
        } else {
            return (double)nums[nums.length / 2];
        }
    }

    public  static  void main(String[] args){
        int[] a=new int[]{1,2};
        int[] b=new int[]{3,4};
        double as=findMedianSortedArrays(a,b);
        System.out.println(as);

    }
}

