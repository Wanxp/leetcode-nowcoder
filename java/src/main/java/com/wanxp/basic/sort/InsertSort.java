package com.wanxp.basic.sort;

public class InsertSort implements Sorter{

    @Override
    public long sort(int[] arr) {
        long start = System.currentTimeMillis();
        for(int i = 1;i < arr.length;i++) {
            for(int j = 0;j < i;j++) {
               if(arr[j] > arr[i]) {
                    int temp = arr[i];
                    for(int h = i - 1;h >= j;h--) {
                        arr[h+1] = arr[h];
                    }
                    arr[j] = temp;
                     break;
                }
            }
         }
         return System.currentTimeMillis() - start;
   }


}