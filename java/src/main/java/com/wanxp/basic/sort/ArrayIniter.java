package com.wanxp.basic.sort;
public class ArrayIniter {
    private int length;
    
    private int[] arr;

    public ArrayIniter(int length) {
        if(length > 0) {
            this.length = length;
            arr = new int[length];
            for(int i = 0;i < length;i++) {
                arr[i] = i;
            }
        }else{
            this.length = length;
            arr = new int[0];
        }
    }

    public void sort(Sorter sorter) {
        System.out.println(String.format("sorter:" + sorter.getClass().getSimpleName() +", time:" + sorter.sort(this.arr)));
    }
}
