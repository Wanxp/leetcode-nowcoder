package com.wanxp.leetcode.leetcode283;

import com.wanxp.leetcode.leetcode88.LeetCode88Solutation2;

import java.util.Arrays;

public class LeetCode283Main {

    private final static int max_result = 10_000_000;

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0,4,5,6,0,1,5,9,0};
        LeetCode283Solutation1 solution = new LeetCode283Solutation1();
        solution.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1,2,3,0,0,0,4,5,6,0,1,5,9,0};
        LeetCode283Solutation2 solution2 = new LeetCode283Solutation2();
        solution2.moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));
    }




}
