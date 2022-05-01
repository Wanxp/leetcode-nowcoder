package com.wanxp.basic.sort;

public class SorterMain {

    static int length = 100000;
    public static void main(String[] args) {
        new ArrayIniter(length).sort(new BubbleSort());
        new ArrayIniter(length).sort(new SelectSort());
    }
}
