package two;

import utils.ListNode;

public class le148 {

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        int length = 0;
        while (null != first) {
            length++;
            first = first.next;
        }

        ListNode res = sort(head, length);

        return res;
    }

    public static ListNode sort(ListNode head, int length) {
        if (length < 2) {
            return head;
        }

        ListNode first = head;

        int half = length/2;
        first = head;
        ListNode n1= head;
        ListNode n2 = null;
        for(int i = 0; i < half - 1; i++) {
            first = first.next;
        }
        n2 = first.next;
        first.next = null;

        n1 = sort(n1, half);
        n2 = sort(n2, length - half);
        ListNode res = merge(n1, n2);

        return res;
    }

    public static ListNode merge(ListNode n1, ListNode n2) {
        ListNode pre = new ListNode(0);
        ListNode index = pre;
        while (n1 != null || n2 != null) {
            if (n1 != null && n2 != null) {
                if (n1.val <= n2.val) {
                    index.next = n1;
                    n1 = n1.next;
                } else {
                    index.next = n2;
                    n2 = n2.next;
                }
                index = index.next;
            } else if (n1 == null) {
                index.next = n2;
                break;
            } else {
                index.next = n1;
                break;
            }
        }


        return pre.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        sortList(l1);


    }
}
