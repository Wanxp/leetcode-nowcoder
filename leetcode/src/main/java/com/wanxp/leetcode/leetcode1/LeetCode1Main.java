package com.wanxp.leetcode.leetcode1;

public class LeetCode1Main {

    private final static int max_result = 1_000_000;

    public static void main(String[] args) {
        LeetCode1Solutation1 solutation = new LeetCode1Solutation1();
        LeetCode1Data leetCode1Data = new LeetCode1Data();

        int[] arr = leetCode1Data.dataInit(max_result);
        int target = Double.valueOf(max_result * 4-2).intValue();
        long start = System.currentTimeMillis();
        //暴力解法：

//        BUILD SUCCESSFUL in 3m 17s
        int[] result = solutation.twoSum(arr, target);

        //Map 做法 7s
//        LeetCode1Solutation2 solutation2 = new LeetCode1Solutation2();
//        int[] result = solutation2.twoSum(arr, target);

        System.out.printf("========\ncomplete time:%s\n==========", (System.currentTimeMillis() - start));
        if (result == null) {
            System.out.println("结果不存在");
        }else {
            int a = arr[result[0]];
            int b = arr[result[1]];
            System.out.printf("lIndex:%s,val:%s;rIndex:%s,val:%s, target:%s", result[0],a,result[1],b,target);
        }
    }




}
