package com.wanxp.basic.sort;

import java.util.Arrays;
import java.util.Random;
import java.lang.Character;

public class ArrayStringIniter {
    
    private String[] arr;

    private static Random random = new Random();

    private boolean display = false;
        
    private int strLength;


    
    public ArrayStringIniter(int length, int strLength, int minStrLength, boolean display) {
        if(length > 0) {
            arr = new String[length];

            for(int i = 0;i < length;i++) {
                StringBuilder sb = new StringBuilder();
                
                int lengthForStr = i == 0 ? strLength : random.nextInt(strLength - minStrLength) + minStrLength;
                for(int j = 0;j < lengthForStr;j++) {
                    sb.append(Character.toString((char)(random.nextInt(25) + 'a')));
                }
                arr[i] = sb.toString();
            }
        }else{
            arr = new String[0];
        }
        this.display = display;
        this.strLength = strLength;
    }

    public ArrayStringIniter(int length, int strLength, boolean display) {
        if(length > 0) {
            arr = new String[length];
            for(int i = 0;i < length;i++) {
                StringBuilder sb = new StringBuilder();
                for(int j = 0;j < strLength;j++) {
                    sb.append(Character.toString((char)(random.nextInt(25) + 'a')));
                }
                arr[i] = sb.toString();
            }
        }else{
            arr = new String[0];
        }
        this.display = display;
        this.strLength = strLength;
    }


    public void sort(StringSorter sorter) {
        System.out.println("==========================");
        System.out.println("sorter:" + sorter.getClass().getSimpleName());
        if(display) {
            System.out.println("begin:" + Arrays.toString(arr));
        }
        long time = sorter.sort(this.arr, strLength);
        if(display) {
            System.out.println("result:" + Arrays.toString(arr));
        }
        System.out.println("time:" + time);
    }

}
