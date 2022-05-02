package com.wanxp.basic.sort;

import java.util.Arrays;
import java.util.Random;

public class ArrayIniter {
    
    private int[] arr;

    private static Random random = new Random();

    private boolean display = false;
        

    public ArrayIniter(int length, Type type, boolean display) {
        if(length > 0) {
            arr = new int[length];
            for(int i = 0;i < length;i++) {
                arr[i] = type.getVallue(length, i);
            }
        }else{
            arr = new int[0];
        }
        this.display = display;
    }

    public ArrayIniter(int length, Type type) {
        if(length > 0) {
            arr = new int[length];
            for(int i = 0;i < length;i++) {
                arr[i] = type.getVallue(length, i);
            }
        }else{
            arr = new int[0];
        }
    }

    public ArrayIniter(int length) {
        this(length, Type.ASC);
    }

    public void sort(Sorter sorter) {
        System.out.println("==========================");
        System.out.println("sorter:" + sorter.getClass().getSimpleName());
        if(display) {
            System.out.println("begin:" + Arrays.toString(arr));
        }
        long time = sorter.sort(this.arr);
        if(display) {
            System.out.println("result:" + Arrays.toString(arr));
        }
        System.out.println("time:" + time);
    }

    public enum Type implements ValueGen{
        RANDOM((max, current) -> random.nextInt(max)),
        ASC((max, current) -> current),
        DESC((max, current) -> max - current),
        ;
        private ValueGen valueFun;

        private Type(ValueGen valueFun) {
            this.valueFun = valueFun;
        }


        @Override
        public int getVallue(int max, int current) {
            return this.valueFun.getVallue(max, current);
        }

    }


    public interface ValueGen {

        public int getVallue(int max, int current);

    }



}
