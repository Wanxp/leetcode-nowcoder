package com.wanxp.leetcode.leetcode21;

import com.wanxp.base.model.ListNode;
import com.wanxp.leetcode.leetcode448.LeetCode448Data;
import com.wanxp.leetcode.leetcode448.LeetCode448Solutation1;
import com.wanxp.leetcode.leetcode448.LeetCode448Solutation2;

import java.util.Arrays;
import java.util.List;

public class LeetCode21Main {

    private final static int max_result = 3;

    public static void main(String[] args) {
        ListNode listNode1 = new LeetCode21Data().dataInit(max_result);
        ListNode listNode2 = new LeetCode21Data().dataInit(max_result);
        ListNode listNode = new LeetCode21Solutation1().mergeTwoLists(listNode1, listNode2);
        System.out.println(listNode);

        ListNode listNode3 = new LeetCode21Data().dataInit(max_result);
        ListNode listNode4 = new LeetCode21Data().dataInit(max_result);
        ListNode listNode_1 = new LeetCode21Solutation2().mergeTwoLists(listNode3, listNode4);
        System.out.println(listNode_1);
    }




}
