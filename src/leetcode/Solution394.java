package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/6/22
 * <p>
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 * <p>
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 * <p>
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 * <p>
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "3[a]2[bc]"
 * 输出："aaabcbc"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decode-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution394 {
    public static String decodeString(String s) {
        String respStr = s;
        List<Integer> stack = new ArrayList<>();
        int i=0;
        while(i<s.length()) {
            if (String.valueOf(s.charAt(i)).equals("[")) {
                stack.add(i);
                i++;
            }else if (String.valueOf(s.charAt(i)).equals("]")) {
                int top = stack.size() - 1;
                int count=stack.get(top) - 1;
                while(count>=0){
                    if((s.charAt(count)>=65&&s.charAt(count)<=90)||(s.charAt(count)>=97&&s.charAt(count)<=122)){
                        break;
                    }else {
                        count--;
                    }
                }
                int num = Integer.parseInt(s.substring(count + 1,stack.get(top)));
                String str = s.substring(stack.get(top) + 1, i);
                StringBuilder str1 = new StringBuilder();
                for (int j = 0; j < num; j++) {
                    str1.append(str);
                }
                String sr = s.substring(0,stack.get(top) - 1);
                sr=s.substring(i + 1,s.length());
                s=s.substring(0,count+1)+str1+s.substring(i + 1,s.length());
                stack.remove(top);
                //中括号内的字符串大小
                int numsize = str.length();
                //重置i
                i = i - 3 - numsize + num * numsize;
                System.out.println(i);
            }else{
                i++;
            }
        }
        return s;

    }

    public static void main(String[] args) {

       String string="10[as20[h]]";
        System.out.println(decodeString(string));
        //System.out.println(Integer.parseInt(str1));
    }


}
