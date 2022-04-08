package com.wanxp.leetcode.leetcode21;

import com.wanxp.base.model.ListNode;

import java.util.Random;

public class LeetCode21Data {

    public ListNode dataInit(int max) {
        ListNode head = new ListNode(-1);
        ListNode movNode = head;

        int result = 0;
        Random r = new Random();
        for (int i = 0;i < max;i++) {
            result = r.nextInt( 3) + result + 1;
            movNode.next = new ListNode(result);
            movNode = movNode.next;
        }
        return head.next;
    }
}
