package leetcode;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/5/28
 */
public class Solution1507 {
    public int pathSum(TreeNode root, int sum) {
        TreeNode temp=root;
        while (temp!=null){
            int count=countSum(temp);
           temp=temp.left;
          // temp=0;
        }
    return 0;
    }     
    private int countSum(TreeNode root){
        return 0;
    }
}
