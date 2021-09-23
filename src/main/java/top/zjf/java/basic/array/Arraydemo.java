package top.zjf.java.basic.array;

/**
 * @program: IntelliJ IDEA
 * @description: 数组练习
 * @author:zhangjianfeng
 * @create:2021-33-23-19:33
 **/
public class Arraydemo {
    /**
     * 求数组元素和
     *
     * @param array 整形形参数组
     * @return int: 元素之和
     */
    public int getSum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length;i++){
           sum +=i;
        }
        return sum;
    }

}
