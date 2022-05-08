package com.wanxp.basic.sort;

import java.util.ArrayList;
import java.util.List;
/**
 * 不定长字符串排序
 */
public class RadixSort3 implements StringSorter{

    public long sort(String[] arr, int strLength) {
        long start = System.currentTimeMillis();
		final int BUCKETS = 256;
		//初始化两个桶
		//字符串桶，长度桶
		//这里好奇为啥要+1,这里+1的目的是后面能直接用stringLeng做index,不用每次使用的时候+1
		ArrayList<String>[] lengthList = new ArrayList[strLength + 1];
		ArrayList<String>[] buckets = new ArrayList[BUCKETS];
		for(int i = 0;i < lengthList.length ;i++) {
			lengthList[i] = new ArrayList<String>();
		}
		for(int i = 0;i < BUCKETS;i++) {
			buckets[i] = new ArrayList<String>();
		}
		for(String s : arr) {
			lengthList[s.length()].add(s);
		} 
		int index = 0;
		for(List<String> b : lengthList) {
			for(String bs : b) {
				arr[index++] = bs;
			}
		}
		int startIndex = arr.length;
		for(int pos = strLength - 1; pos >= 0;pos--) {
			startIndex -= lengthList[pos + 1].size();
			for(int i = startIndex;i < arr.length;i++) {
				buckets[arr[i].charAt(pos)].add(arr[i]);
			}
			index = startIndex;
			for(List<String> bs : buckets) {
				for(String b : bs) {
					arr[index++] = b;
				}
				bs.clear();
			}
		}		

		return System.currentTimeMillis() - start;
    }

}
