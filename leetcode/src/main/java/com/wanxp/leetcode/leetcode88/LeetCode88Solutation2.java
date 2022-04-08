package com.wanxp.leetcode.leetcode88;

import java.util.Arrays;

/**
 * 双指针
 */
public class LeetCode88Solutation2 {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int[] temp = new int[arr1.length];

        int leftIndex = 0;
        int rightIndex = 0;
        int j = -1;
        while(++j < temp.length) {
            if(arr1[leftIndex] < arr2[rightIndex]) {
                temp[j] = arr1[leftIndex];
                leftIndex++;
            }else {
                temp[j] = arr2[rightIndex];
                rightIndex++;
            }
            if (leftIndex >= m) {
                while(rightIndex < n) {
                    temp[++j]= arr2[rightIndex++];
                }
                break;
            }else  if (rightIndex >= n){
                while(leftIndex < m) {
                    temp[++j]= arr1[leftIndex++];
                }
                break;
            }
        }
        for(int i = 0; i < temp.length; i++) {
            arr1[i] = temp[i];
        }
    }
}
