package first100;

import utils.ListNode;

public class Le002_Add_Two_Numbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int plus = 0;
        while (l1 != null || l2 != null || plus == 1) {
            int sum = ((l1 == null)?0:l1.val) + ((l2 == null)?0:l2.val) + plus;
            plus = sum > 9 ? 1:0;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            l1 = l1 == null?null:l1.next;
            l2 = l2 == null?null:l2.next;
        }
        return pre.next;
    }

    public ListNode reverse(ListNode l) {
        if (l == null) {
            return null;
        }
        ListNode cur = l;
        ListNode back = null;
        while ( cur != null) {
            ListNode temp = cur.next;
            cur.next = back;
            back = cur;
            cur = temp;
        }
        return back;
    }

}
