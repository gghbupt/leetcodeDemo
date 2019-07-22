package first100;

import utils.ListNode;

public class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end = head;
        for (int i = 0; i < n; i++) {
            if (end.next != null) {
                end = end.next;
            } else {
                return head.next;
            }
        }
        ListNode bef = head;
        while (end.next != null) {
            end = end.next;
            bef = bef.next;
        }
        bef.next = bef.next.next;
        return head;
    }
}
