package com.wanxp.nowcoder.linkedList;

import java.util.ArrayList;

/**
 * 递归输出
 */
public class LinkedListTailToHeadToArrayListSolution {


    public ArrayList<Integer> printListFromTailToHead(LinkedListTailToHeadToArrayListQuestion.ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        returnTailToHead(listNode, arrayList);
        return arrayList;
    }

    public void returnTailToHead(LinkedListTailToHeadToArrayListQuestion.ListNode listNode, ArrayList<Integer> arrayList) {
        if (listNode.next == null) {
            arrayList.add(listNode.val);
            return;
        }
        returnTailToHead(listNode.next, arrayList);
        arrayList.add(listNode.val);
    }

}
