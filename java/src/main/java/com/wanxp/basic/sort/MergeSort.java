package com.wanxp.basic.sort;

import java.util.Arrays;

public class MergeSort implements Sorter{

    @Override
    public long sort(int[] arr) {
        long start = System.currentTimeMillis();
        int[] temp = sort(arr, 0, arr.length - 1);
        System.arraycopy(temp, 0, arr, 0, temp.length);
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
                   System.arraycopy(tempLeft, left, result, index, tempLeft.length - left);
                   break;
               }
           }else {
                result[index] = tempLeft[left];
               left++;
               index++;
               if(left > leftEnd) {
                System.arraycopy(tempRight, right, result, index, tempRight.length - right);
                   break; 
               }
           }
       }
       return result;
   }



    
}
