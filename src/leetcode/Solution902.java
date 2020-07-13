package leetcode;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/6/28
 */
public class Solution902 {
    public static  int atMostNGivenDigitSet(String[] D, int N) {
        String digit = String.valueOf(N);
        int count = 0;
        if (N < 10) {
            return count(D, N);
        }
        int digitSum = 1;
        for (int i = 1; i <= digit.length(); i++) {
            int ase = (int) Math.pow(10, i);
            digitSum = digitSum * count(D, N % ase);
            if (i < digit.length()) {
                count += Math.pow(D.length, i);
            } else {
                count=count*2;
                count += digitSum;
            }
        }

        return count;
    }

    static int  count(String[] D, int num) {
        int count1 = 0;
        for (int j = 0; j <= D.length; j++) {
            if (Integer.parseInt(D[j]) > num) {
                count1 = j;
                break;
            }
            count1 = D.length;
        }
        return count1;
    }
    public static void main(String[] args) {
        String[] D={"3","5","7","9"};
        System.out.println(atMostNGivenDigitSet(D, 834));


    }
}
