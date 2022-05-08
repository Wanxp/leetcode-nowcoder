package com.wanxp.basic.sort;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 */
public class RadixSort implements StringSorter{

    public long sort(String[] arr, int strLength) {
        long start = System.currentTimeMillis();
        List<String>[] charList = new ArrayList[256];
        for(int i = 0;i < charList.length;i++) {
            charList[i] = new ArrayList<String>();
        }
        for(int i = strLength - 1;i >= 0;i--) {
            for(String s : arr) {
                charList[s.charAt(i)].add(s);
            }
            int index = 0;
            for(List<String> list : charList) {
                for(String v : list) {
                    arr[index++] = v;
                }
                list.clear();
            }
        }
        return System.currentTimeMillis() - start;
    }

}
