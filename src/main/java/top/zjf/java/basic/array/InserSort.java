package top.zjf.java.basic.array;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-09-05-20:09
 **/
@Slf4j
public class InserSort {
    public static void main(String[] args) {
        int[] arr = {6,85,78,10,8,12,65,9,88};
        log.info("排序之前：{}", Arrays.toString(arr));
        inserSort(arr);
        log.info("排序之后 ：{}",Arrays.toString(arr));



    }
    private static void inserSort(int[] arr){
        int j;
        int t;
        for (int i= 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                t= arr[i];
                for(j=i-1;j>=0&&arr[j]>t;j--){
                    arr[j+1] = arr[j];
                }
                arr[j+1]=t;
            }

        }
    }
}
