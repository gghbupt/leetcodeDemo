package two;

import utils.ListNode;

public class le142 {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode l0 = head;
        ListNode l1 = head;
        boolean isCycle = false;
        while (l1.next != null) {
            l0 = l0.next;
            l1 = l1.next;
            if (l1.next == null) {
                break;
            }
            l1 = l1.next;
            if (l1 == l0) {
                isCycle = true;
                break;
            }
        }
        if (!isCycle) {
            return null;
        }
        l0 = head;
        while (l0 != l1) {
            l0 = l0.next;
            l1 = l1.next;
        }
        return l0;
    }
}
