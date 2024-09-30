package org.example;

public class LC_206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode ln=new ListNode();
            ln.val=current.val;
            ln.next=prev;
            prev=ln;
            current=current.next;
        }

        return prev;
    }
}
