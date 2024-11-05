package com.example.leetcode.explore.recursion;

public class SwapNodesInPair {

    public static void main(String[] args) {
        var application = new SwapNodesInPair();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode result = application.swapPairs(head);
        while (null != result) {
            System.out.println("Value: " + result.val);
            result = result.next;
        }
    }

    private ListNode swapPairs(ListNode head) {
        return this.swap(head);
    }
    
    private ListNode swap(ListNode head) {
        if (null != head && null != head.next) {
            ListNode newHead = head.next;
            ListNode temp = this.swap(head.next.next);
            newHead.next = head;
            head.next = temp;
            return newHead;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
