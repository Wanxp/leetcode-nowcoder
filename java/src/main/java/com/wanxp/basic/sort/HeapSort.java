package com.wanxp.basic.sort;

import java.util.PriorityQueue;
import java.util.Queue;

public class HeapSort implements Sorter {

    @Override
    public long sort(int[] arr) {
        long start = System.currentTimeMillis();
        Queue<Integer> queue = new PriorityQueue<>(arr.length);
        for(int i : arr) {
            queue.offer(i);
        }
        for(int i = 0;i < arr.length;i++) {
            arr[i] = queue.poll();
        }
        return System.currentTimeMillis() - start;
    }
    
}
