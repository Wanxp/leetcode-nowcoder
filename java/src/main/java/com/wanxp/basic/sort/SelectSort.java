package com.wanxp.basic.sort;
import com.wanxp.basic.sort.*;
public class SelectSort implements Sorter{
    public long sort(int[] arr) {
        long start = System.currentTimeMillis();
        for(int i = arr.length - 1;i > 0;i--) {
            for(int j = 0;j < i - 1;j++) {
                if(arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return System.currentTimeMillis() - start;
    }
}
