package com.wanxp.basic.sort;

public class ShellSort implements Sorter{

    @Override
    public long sort(int[] arr) {
		int seq = arr.length;
		long start = System.currentTimeMillis();
		if(seq <= 1) {
			return 0;
		}
		do {
			seq = seq / 2;
			shellSort(arr, seq);
		}while(seq != 1);
		return System.currentTimeMillis() - start;
	}

	public void shellSort(int[] arr, int seq) {
		for(int i = 0;i < seq;i++) {
			insertSort(arr, i, seq);
		}
	} 

	public void insertSort(int[] arr, int start, int step) {
		for(int i = start + step;i < arr.length;i+= step) {
			int temp = arr[i];
            int index = i - step;
			for(int j = i - step;j > start && temp < arr[j];j -= step) {
				arr[j + step] = arr[j]; 
                index = j;
			}
			arr[index] = temp;
		}
	}
}
