package com.wanxp.basic.sort;


public class HeapSort2 implements Sorter {
	    public long sort(int[] arr) {
	       long start = System.currentTimeMillis();
	       sortArr(arr);
	       return System.currentTimeMillis() - start;
	    }
	    /**
	     * 这里实现堆的两个方法保证两个性质
	     * insert
	     * deleteMin
	     * 两个性质
	     * 结构性
	     * 层序性
	     */
		public void sortArr(int[] arr) {
			int[] heap = new int[arr.length];
			for(int i = 0;i < arr.length;i++) {
				insertHeap(heap, arr[i], i);
			}
			for(int i = 0;i < arr.length;i++) {
				int value = deleteMin(heap, arr.length - i - 1);
				arr[i] = value;
			}
		}

		public void insertHeap(int[] heap, int value, int i) {
			int hole = i;
			int parent = (hole - 1)/2;
			while(hole > 0 && heap[parent] > value) {
				heap[hole] = heap[parent];
				hole = parent;
				parent = (hole - 1)/2;
			}
			heap[hole] = value;
		}

		public int deleteMin(int[] heap, int lastIndex) {
			int value = heap[0];
			int lastValue = heap[lastIndex];
			int leftIndex = 1;
			int rightIndex = 2;
            int hole = 0;
			while(leftIndex <= lastIndex && rightIndex <= lastIndex) {
				int parent = (leftIndex - 1) / 2;
				if(heap[leftIndex] > heap[rightIndex]) {
                    hole = rightIndex;
				}else {
                    hole = leftIndex;
				}
                heap[parent] = heap[hole];
                leftIndex = 2 * hole + 1;
                rightIndex = 2* hole + 2;
				
			}
            heap[hole] = lastValue;
			return value;
		}
	}
