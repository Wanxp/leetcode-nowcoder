package com.wanxp.basic.sort;
public class QuickSort implements Sorter{
    public long sort(int[] arr) {
	    long start = System.currentTimeMillis();
		quickSort(arr, 0, arr.length - 1);	
		return System.currentTimeMillis() - start;
	}

	public void quickSort(int[] arr, int start, int end) {
		if(start == end || start > end) return;
		 int spiltIndex = start - 1;
		 int check = arr[end];
		 for(int i = start;i < end;i++) {
			 if(arr[i] < check) {
				 spiltIndex++;
				 if(arr[spiltIndex] > check) {
					 swap(arr, spiltIndex, i);
				 }
			 }
		 }
		 spiltIndex++;
		 if(spiltIndex != end) {
			swap(arr, spiltIndex, end);
		 }
         quickSort(arr, start, spiltIndex - 1);
         quickSort(arr, spiltIndex + 1, end);
	}

	public void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}