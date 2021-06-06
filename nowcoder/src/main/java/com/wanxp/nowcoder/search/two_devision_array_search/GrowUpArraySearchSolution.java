package com.wanxp.nowcoder.search.two_devision_array_search;

/**
 * 解法一:左下法
 * 先判定是否在其内部，
 */
public class GrowUpArraySearchSolution {
    public boolean find(int target, int [][] array) {
        if(array.length == 0 ||
                array[0].length ==0 ||
                array[0][0] > target ||
                array[array.length - 1][array[0].length - 1] < target) {
            return false;
        }

        int x = 0;
        int y = array[0].length - 1;
        for(;x < array.length;x++) {
            for(;y >= 0;y--) {
                if(array[x][y] == target) {
                    return true;
                }
                if(array[x][y] < target) {
                    break;
                }
            }
        }
        return false;
    }
}
