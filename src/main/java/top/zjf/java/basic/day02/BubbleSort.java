package top.zjf.java.basic.day02;

import com.sun.jdi.event.StepEvent;

/**
 * @program: IntelliJ IDEA
 * @description: 排序
 * @author:zhangjianfeng
 * @create:2021-31-25-13:31
 **/
public class BubbleSort {

    public static void bubbleSort1(int[] a, int n){
        int i,j;
        for (i=0;i < n; i++){
            for(j= 1 ;j < n-i; j++){
                if (a[j-1] > a[j]){
                    int temp;
                    temp =a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,4,56,67,44,78,89,54,23,90};
        BubbleSort.bubbleSort1(arr,arr.length);
        for (int i : arr){
            System.out.print(i + ",");
        }
    }
}
