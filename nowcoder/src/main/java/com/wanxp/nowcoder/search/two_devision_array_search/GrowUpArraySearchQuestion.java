package com.wanxp.nowcoder.search.two_devision_array_search;


/**
 * 描述
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * [
 *   [1,2,8,9],
 *   [2,4,9,12],
 *   [4,7,10,13],
 *   [6,8,11,15]
 * ]
 * 给定 target = 7，返回 true。
 * 给定 target = 3，返回 false。
 * 示例1
 * 输入：7,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
 * 返回值：true
 * 说明：存在7，返回true
 * 示例2
 * 输入：3,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
 * 返回值：false
 * 说明：不存在3，返回false
 */
public class GrowUpArraySearchQuestion {
    private static int target = 7;

    private static int[][] exist_array ={{1,2,8,9},{2,4,9,12},{4,target,10,13},{6,8,11,15}};
    private static int[][] not_exist_array ={{1,2,8,9},{2,4,9,12},{4,6,10,13},{6,8,11,15}};

    public static void main(String[] args) {
         GrowUpArraySearchSolution solution = new GrowUpArraySearchSolution();
        if (!solution.find(target, exist_array)) {
            throw new RuntimeException("结果错误");
        }
        if (solution.find(target, not_exist_array)) {
            throw new RuntimeException("结果错误");
        }
        System.out.println("结果正确");
    }
}
