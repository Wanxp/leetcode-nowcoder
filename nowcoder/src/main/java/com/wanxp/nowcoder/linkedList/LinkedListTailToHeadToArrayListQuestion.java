package com.wanxp.nowcoder.linkedList;

import java.util.ArrayList;

/**
 * 描述:输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * 示例1
 * 输入：{67,0,24,58}
 * 返回值：[58,24,0,67]
 */
public class LinkedListTailToHeadToArrayListQuestion {



    public static void main(String[] args) {
        int[] array = new int[]{67, 0, 24, 58, 11,33,44,55,66,77,88,99,00,112,231};
        ListNode linkNode = intArrayToLinkNode(array);
        LinkedListTailToHeadToArrayListSolution solution = new LinkedListTailToHeadToArrayListSolution();
        ArrayList<Integer> arrayList = solution.printListFromTailToHead(linkNode);
        boolean flag = true;
        for (int i = 0;i < array.length;i++) {
            if (array[i] != arrayList.get(array.length - i - 1)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "成功" : "失败");

    }

    static ListNode intArrayToLinkNode(int[] array) {
        ListNode node = null;
        ListNode headNode = null;

        for (int i = 0;i < array.length;i++) {
            if (i == 0) {
                node = new ListNode(array[i]);
                headNode = node;
            } else {
                node = node.next = new ListNode(array[i]);
            }
        }
        return headNode;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }


}
