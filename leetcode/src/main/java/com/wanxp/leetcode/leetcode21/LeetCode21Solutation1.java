package com.wanxp.leetcode.leetcode21;

import com.wanxp.base.model.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 双指针
 */
public class LeetCode21Solutation1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(1);
        ListNode movNode = head;
        ListNode leftNode = list1;
        ListNode rightNode = list2;
        while (leftNode != null && rightNode != null) {
            if (leftNode.val < rightNode.val) {
                movNode.next = leftNode;
                leftNode = leftNode.next;
            }else {
                movNode.next = rightNode;
                rightNode = rightNode.next;
            }
            movNode = movNode.next;
        }
        if (leftNode != null) {
            movNode.next = leftNode;
        }
        if (rightNode != null) {
            movNode.next = rightNode;
        }
        return head.next;
    }
}
