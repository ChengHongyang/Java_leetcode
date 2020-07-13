package leetcode;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/6/28
 */
/*
给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。

示例:

输入: 38
输出: 2
解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-digits
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution258 {
    public static int addDigits(int num) {
        while (true) {
            String numStr = String.valueOf(num);
            if (numStr.length() <= 1) {
                break;
            } else {
                num = 0;
                for (int i = 0; i < numStr.length(); i++) {
                    num += Integer.parseInt(String.valueOf(numStr.charAt(i)));
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {

       int a=3456;
        System.out.println(addDigits(a));
        //System.out.println(Integer.parseInt(str1));
    }
}
