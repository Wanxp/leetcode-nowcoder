package com.wanxp.leetcode.leetcode448;

import com.wanxp.leetcode.leetcode283.LeetCode283Solutation1;
import com.wanxp.leetcode.leetcode283.LeetCode283Solutation2;

import java.util.Arrays;
import java.util.List;

public class LeetCode448Main {

    private final static int max_result = 10;

    public static void main(String[] args) {
        int[] ints = new LeetCode448Data().dataInit(max_result);
        List<Integer> disappearedNumbers = new LeetCode448Solutation1().findDisappearedNumbers(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(disappearedNumbers);
        int[] ints2 = new LeetCode448Data().dataInit(max_result);
        List<Integer> disappearedNumbers2 = new LeetCode448Solutation2().findDisappearedNumbers(ints2);
        System.out.println(Arrays.toString(ints2));
        System.out.println(disappearedNumbers2);
    }




}
