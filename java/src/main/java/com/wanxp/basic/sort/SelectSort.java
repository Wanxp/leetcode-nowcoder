package com.wanxp.basic.sort;
public class SelectSort implements Sorter {
	public long sort(int[] arr) {
		long start = System.currentTimeMillis();
		int minIndex;
		for(int i = 0;i < arr.length;i++) {
			minIndex = i;
			for(int j = i;j < arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				swap(arr, i, minIndex);	
			}
		}
		return System.currentTimeMillis() - start;
	}

	public void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}