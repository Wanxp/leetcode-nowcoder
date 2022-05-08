package com.wanxp.basic.sort;

import java.util.Arrays;

public class CountSort implements Sorter{

    @Override
    public long sort(int[] arr) {
        long start = System.currentTimeMillis();
		int max = arr[0];
		int min = arr[0];
		for(int i : arr) {
			if(i > max) {
				max = i;
			}
			if(i < min) {
				min = i;
			}
		}
		int[] count = new int[max - min + 1];
		for(int i : arr) {
			count[i - min] += 1;
		}
		int index = 0;
		for(int i = 0;i < count.length;i++) {
			for(int j = 0;j < count[i];j++) {
				arr[index++] = i; 
			}
		}
        System.out.println(Arrays.toString(count));
        return System.currentTimeMillis() - start;
    }
    
}
