package org.example;

//https://leetcode.com/problems/add-two-numbers/description/

  //Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        int sum=0;
        ListNode root = new ListNode();
        ListNode n=new ListNode();
        root = n;
        while(l1!=null||l2!=null){
            ListNode n1 = new ListNode();
            if(l1!=null&&l2==null){
                sum = l1.val+carry;
                l1=l1.next;
            }
            else if(l1==null&&l2!=null){
                sum = l2.val+carry;
                l2=l2.next;
            }
            else{
                sum = l1.val+l2.val+carry;
                l1=l1.next;
                l2=l2.next;
            }
            carry =sum/10;
            n1.val=sum%10;
            n.next=n1;
            n = n1;
        }

        if(carry>0){
            ListNode n1 = new ListNode(1);
            n.next=n1;
        }


        return root.next;
    }
}
