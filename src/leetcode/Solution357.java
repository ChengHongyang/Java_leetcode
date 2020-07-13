package leetcode;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/5/11
 */
public class Solution357 {
    public int countNumbersWithUniqueDigits(int n) {
        double count = 1;
        int dig = 10;
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 10;
        } else if (n <= 10) {
            for (int i = 0; i < n; i++) {
                count = count * (dig - i);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                count = count * (dig - i);
            }
        }
        return (int) count + 1;
    }

}
