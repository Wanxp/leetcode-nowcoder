package com.wanxp.basic.sort;

import java.util.Arrays;

public class MergeSort implements Sorter{

    @Override
    public long sort(int[] arr) {
        long start = System.currentTimeMillis();
        int[] temp = sort(arr, 0, arr.length - 1);
        Arrays.compareUnsigned(temp, arr);
        return System.currentTimeMillis() - start;
    }

    public int[] sort(int[] arr, int start, int end) {
        if(end - start < 1) {
            return new int[]{arr[start]};
        }
        int mid = start + (end - start) / 2;
        
        int[] tempLeft = sort(arr, start, mid);
        int[] tempRight = sort(arr, mid + 1, end);
        int[] result = appendSort(tempLeft, tempRight);
        return result;
    }

   public int[] appendSort(int[] tempLeft, int[] tempRight) {

       int left = 0;
       int right = 0;
       int index = left;
       int leftEnd = tempLeft.length - 1;
       int rightEnd = tempRight.length - 1;
       int[] result = new int[tempLeft.length + tempRight.length];
       while(right <= rightEnd && left <= leftEnd) {
           if(tempLeft[left] > tempRight[right]) {
                result[index] = tempRight[right];
               right++;
               index++;
               if(right > rightEnd) {
                   copyToTemp(result, tempLeft, left,  index);
                   break;
               }
           }else {
                result[index] = tempLeft[left];
               left++;
               index++;
               if(left > leftEnd) {
                   copyToTemp(result, tempRight, right, index);
                   break; 
               }
           }
       }
       return result;
   }

   public void copyToTemp(int[] result, int[] temp, int start, int index) {
        int tempIndex = index;
        for(int i = start;i < temp.length; i++) {
            result[tempIndex++] = temp[i];
        }
   }


    
}
