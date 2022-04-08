package com.wanxp.leetcode.leetcode88;

/**
 * 双指针 倒序
 */
public class LeetCode88Solutation3 {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int leftIndex = m - 1;
        int rightIndex = n - 1;
        int j = m + n;
        while(j-- > 0) {
            if(arr1[leftIndex] < arr2[rightIndex]) {
                arr1[j] = arr2[rightIndex--];
            }else {
                arr1[j] = arr1[leftIndex--];
            }
            if(rightIndex < 0) {
                rightIndex = 0;
            }
            if(leftIndex < 0) {
                leftIndex = 0;
            }
        }
    }
}
