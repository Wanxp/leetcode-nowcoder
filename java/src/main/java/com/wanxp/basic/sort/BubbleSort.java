package com.wanxp.basic.sort;
import com.wanxp.basic.sort.*;
public class BubbleSort implements Sorter{
    public long sort(int[] arr) {
        long start = System.currentTimeMillis();
        for(int i = arr.length - 1;i > 0;i--) {
            for(int j = 0;j < i - 1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return System.currentTimeMillis() - start;
    }
}
