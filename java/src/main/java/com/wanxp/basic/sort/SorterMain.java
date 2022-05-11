package com.wanxp.basic.sort;

import com.wanxp.basic.sort.ArrayIniter.Type;

public class SorterMain {


    static int length = 4;
    static int strLength = 4;
    public static void main(String[] args) {
        boolean display = length < 100;
        

        // new ArrayIniter(length, Type.RANDOM, display).sort(new BubbleSort());
        new ArrayIniter(length, Type.RANDOM, display).sort(new SelectSort());
        // new ArrayIniter(length, Type.RANDOM, display).sort(new InsertSort());
        // new ArrayIniter(length, Type.RANDOM, display).sort(new QuickSort());
        // new ArrayIniter(length, Type.RANDOM, display).sort(new ShellSort());
        // new ArrayIniter(length, Type.RANDOM, display).sort(new MergeSort());
        // new ArrayIniter(length, Type.RANDOM, display).sort(new CountSort());
        // new ArrayStringIniter(length, strLength, display).sort(new RadixSort());
        // new ArrayStringIniter(length, strLength,  display).sort(new RadixSort2());
        // new ArrayStringIniter(length, strLength, 1, display).sort(new RadixSort3());


    }
}
