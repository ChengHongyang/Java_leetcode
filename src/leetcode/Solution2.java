package leetcode;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/4/30
 */
public class Solution2 {

    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode result1 = null;
        int singleCnt = 0;
        if (l1 == null) {
            l1 = new ListNode(0);
        }
        if (l2 == null) {
            l2 = new ListNode(0);
        }
        if (l1.val + l2.val >= 10) {
            singleCnt = l1.val + l2.val - 10;
            ListNode lnext = l1.next;
            if (l1.next == null) {
                lnext = new ListNode(1);
            } else {
                lnext.val= lnext.val + 1;
            }
            l1.next = lnext;
        } else {
            singleCnt = l1.val + l2.val;
        }
        result1 = new ListNode(singleCnt);
        if (l1.next != null || l2.next != null) {
            result1.next = addTwoNumbers(l1.next, l2.next);
        }

        return result1;
    }


    public static void main(String[] args) {
    /*    ListNode li = new ListNode(9);
        ListNode li1 = new ListNode(9);
        li1.next = li;
        ListNode l1 = new ListNode(8);
        l1.next = li1;
   ListNode l2=new ListNode(2);
   ListNode res=addTwoNumbers(l1,l2);*/

    }
}
