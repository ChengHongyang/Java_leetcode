package com.chy;

import java.util.Scanner;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/4/25
 */
public class KuaiPai {
    public static void main(String[] args) {
       int[] a = {10,7,2,4,11,62,32,4,24,1,8,9,19};

        quickSort(0,a.length-1,a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
/*
   low: 左哨兵
   high 右哨兵
   a[]
 */
    public static void quickSort(int low, int high, int a[]) {
        if (low > high) {
            //左哨兵大于右哨兵，退出递归
            return;
        }
        int temp = a[low];//以左哨兵为基准，左哨兵和右哨兵从两边出发
        int l = low;
        int h = high;
        while (l < h) {
            while (a[h] >= temp && h > l) {
                //右哨兵从右向左，寻找比基准数小的数
                h--;
            }
            while (a[l] <= temp && l < h) {
                //右哨兵从左向右，寻找比基准数大的数
                l++;
            }
            if (a[h] < a[l]) {
                //左右哨兵互换
                int x = a[h];
                a[h] = a[l];
                a[l] = x;
            }
        }
        //直到左右哨兵相遇，基准数与相遇节点数互换
        a[low] = a[l];
        a[l] = temp;
        quickSort(low, l-1, a);
        quickSort(l + 1, high, a);
    }
}
