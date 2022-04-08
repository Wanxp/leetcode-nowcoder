package com.wanxp.leetcode.leetcode88;

import com.wanxp.leetcode.leetcode1.LeetCode1Solutation2;

import java.util.Arrays;

public class LeetCode88Main {

    private final static int max_result = 10_000_000;

    public static void main(String[] args) {
        LeetCode88Solutation1 solutation = new LeetCode88Solutation1();
        LeetCode88Data leetCode1Data = new LeetCode88Data();

        int[] arr1_1 = leetCode1Data.dataInit(max_result);
        int[] arr2 = leetCode1Data.dataInit(max_result);
//        int[] arr2 = new int[]{1,4,7,8};
        int[] arr1 = Arrays.copyOf(arr1_1, arr1_1.length + arr2.length);
//        int[] arr1 = {2,5,7,9,0,0,0,0};
        long start = System.currentTimeMillis();
        //java工具解法：

//        BUILD SUCCESSFUL in 3m 17s
        solutation.merge(arr1,arr1_1.length, arr2, arr2.length);

        // 做法 7s
        LeetCode88Solutation2 solutation2 = new LeetCode88Solutation2();
//        solutation2.merge(arr1,arr1_1.length, arr2, arr2.length);

        System.out.printf("\n========\ncomplete time:%s\n==========\n", (System.currentTimeMillis() - start));
        boolean resultFlag = false;
        for (int i = 0;i < arr1.length-1; i++) {
            if (arr1[i] > arr1[i+1]) {
                resultFlag = true;
            }
        }

        if (resultFlag == true) {
            System.out.println("结果错误");
        }else {
            System.out.printf("结果正确");
        }
    }




}
