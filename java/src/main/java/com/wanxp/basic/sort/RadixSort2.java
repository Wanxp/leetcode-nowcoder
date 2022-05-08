package com.wanxp.basic.sort;

import java.util.ArrayList;
import java.util.List;
/**
 * 定长字符串排序, 并且使用两个数组进行基数排序
 */
public class RadixSort2 implements StringSorter{

    public long sort(String[] arr, int strLength) {
        long start = System.currentTimeMillis();
        final int BUCKET = 256;
        int N = arr.length;
        String[] buffer = new String[N];
        String[] in = arr;
        String[] out = buffer;
        for(int pos = strLength - 1;pos >= 0;pos--) {
            int[] count = new int[BUCKET + 1];
            for(int i = 0;i < N;i++) {
                int index = in[i].charAt(pos) + 1;
                count[index]++;
            }

            for(int b = 1;b < BUCKET;b++) {
                int countValue = count[b - 1];
                count[b] += countValue;
            }

            for(int i = 0;i < N;i++) {
                int index = in[i].charAt(pos);
                int countValue = count[index];
                out[countValue] = in[i];
                countValue++;
                count[index] = countValue;
            }
            String [] temp = in;
            in = out;
            out = temp;
        }
        if(strLength % 2 == 1) {
            for(int i = 0;i < arr.length;i++) {
                out[i] = in[i];
            }
        }
        return System.currentTimeMillis() - start;
    }

}
