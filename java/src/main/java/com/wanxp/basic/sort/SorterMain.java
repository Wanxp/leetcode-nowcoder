package com.wanxp.basic.sort;

import com.wanxp.basic.sort.ArrayIniter.Type;

public class SorterMain {

    static int length = 1000000;
    public static void main(String[] args) {
        boolean display = length < 100;
        

        // new ArrayIniter(length, Type.RANDOM, display).sort(new BubbleSort());
        // new ArrayIniter(length, Type.RANDOM, display).sort(new SelectSort());
        // new ArrayIniter(length, Type.RANDOM, display).sort(new InsertSort());
        new ArrayIniter(length, Type.RANDOM, display).sort(new QuickSort());
        new ArrayIniter(length, Type.RANDOM, display).sort(new ShellSort());
        new ArrayIniter(length, Type.RANDOM, display).sort(new MergeSort());
        new ArrayIniter(length, Type.RANDOM, display).sort(new HeapSort());
        new ArrayIniter(length, Type.RANDOM, display).sort(new HeapSort2());
        // new HeapSort2().sort(new int[]{4,3,2,1});
    }
}
