package com.wanxp.leetcode.leetcode88;

import java.util.Random;

public class LeetCode88Data {

    public int[] dataInit(int max) {
        int[] resultArr = new int[max];
        int result = 0;
        Random r = new Random();
        for (int i = 0;i < max;i++) {
            result = r.nextInt( 3) + result + 1;
            resultArr[i] = result;
        }
        return resultArr;
    }
}
