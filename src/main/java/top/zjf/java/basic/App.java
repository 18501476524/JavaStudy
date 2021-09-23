package top.zjf.java.basic;

import top.zjf.java.basic.array.Arraydemo;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-9-23-18:41
 **/
public class App {
    public static void main(String[] args){
        System.out.println("app launch");
        int[] arr = {1,2,3,4,5};
        Arraydemo ad = new Arraydemo();
        int sum = ad.getSum(arr);
        System.out.println("sum = " + sum);
    }
}
