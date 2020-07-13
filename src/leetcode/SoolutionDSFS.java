package leetcode;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/7/1
 */
public class SoolutionDSFS {

    public int getindexFirstAt(String strA, String strB) {
        int index = -1;
        if (strA.length() > strB.length()) {
            return index;
        } else {
            for (int i = 0; i <= strB.length() - strA.length(); i++) {
                if (strB.substring(i, i + strA.length()).equals(strA)) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}
