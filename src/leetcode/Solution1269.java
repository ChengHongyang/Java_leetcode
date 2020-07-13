package leetcode;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/6/2
 */
/*
有一个长度为 arrLen 的数组，开始有一个指针在索引 0 处。

每一步操作中，你可以将指针向左或向右移动 1 步，或者停在原地（指针不能被移动到数组范围外）。

给你两个整数 steps 和 arrLen ，请你计算并返回：在恰好执行 steps 次操作以后，指针仍然指向索引 0 处的方案数。

由于答案可能会很大，请返回方案数 模 10^9 + 7 后的结果。

 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution1269 {
    public static long numWays(int steps, int arrLen) {
        Long count = 0L;
        numWaysrecursion(arrLen, steps, 0, count);
        return count;
    }

    private static Long numWaysrecursion(int arrLen, int curentStemp, int curentPoint, Long count) {
        if (curentStemp == 0) {
            if (curentStemp == 0 && curentPoint == 0) {
                //当当前步数为0且指针为0 则计数加一
               return 1L;
            }

            //当前步数为0时 则退出
            return 0L;
        }
        if (curentPoint == -1) {
            return 0L;
        }
        if (curentPoint == arrLen) {
            return 0L;
        }
        numWaysrecursion(arrLen, curentStemp - 1, curentPoint - 1, count);

        numWaysrecursion(arrLen, curentStemp - 1, curentPoint + 1, count);
        numWaysrecursion(arrLen, curentStemp -1, curentPoint , count);

        return count;

    }

    public static void main(String[] args) {
        System.out.println(numWays(3, 2));


    }
}
