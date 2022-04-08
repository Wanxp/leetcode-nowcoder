package com.wanxp.leetcode.leetcode88;

import java.util.Arrays;

/**
 * java工具类
 */
public class LeetCode88Solutation1 {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        for(int i = 0;i < n - 1;i++) {
            arr1[m + i] = arr2[i];
        }
        Arrays.sort(arr1);
    }
}
