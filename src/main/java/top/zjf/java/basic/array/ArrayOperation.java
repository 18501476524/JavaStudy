package top.zjf.java.basic.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-25-09-21:25
 **/
public class ArrayOperation {
    private static final int Max_SIZE = 10;


    public static int[] initialize(){
        int[] data = new int[Max_SIZE];
        Random random = new Random();
        for (int i = 0;i<Max_SIZE;i++){
            int num = random.nextInt(100);
       data[i] = num;
        }
        return data;
    }


    public static void printArray(int[] arr){
        System.out.println("\n当前元素为：");
        for(int n:arr){
            System.out.printf("%-4d",n);
        }
    }


    public static int binarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length-1;
        int middle;
        if(key < arr[low] || key>arr[high]){
            return  -1;
        }
        while (low <= high){
            middle = (low+high)/2;
            if(arr[middle]>key){
                high= middle-1;

            }else if (arr[middle]<key){
                low = middle+1;
            }else {
                return middle;
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        System.out.println(PackageConst.INFO);
        int[] arr = ArrayOperation.initialize();
        Arrays.sort(arr);
        printArray(arr);

        System.out.println("\n请输入待查元素：");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        while (key != -1){
            int index = binarySearch(arr,key);
            System.out.printf("\n%d查找定位结果 ：%d",key,index);
            System.out.println("\n请输入待查元素");
            key = scanner.nextInt();

        }
        System.out.println("查找结束！");

    }
}

