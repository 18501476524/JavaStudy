package top.zjf.java.basic.array;

import lombok.extern.slf4j.Slf4j;

import java.nio.channels.Selector;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-23-04-20:23
 **/
@Slf4j
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,66};
        SelectSort(arr);

    }
    public static void SelectSort(int[] arr){
        for(int i = 0,j = arr.length -1;i<j;i++){
            for (int m = i +1,n= arr.length;m<n;m++){
                if(arr[i]>arr[m]){
                    int tmp = arr[i];
                    arr[i] =arr[m];
                    arr[m]=tmp;
                }
            }
        }
        for(int j:arr){
            log.info(j+"");
        }
    }
}
