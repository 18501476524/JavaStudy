package top.zjf.java.basic.variable;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

/**
 * @program: IntelliJ IDEA
 * @description: 值类型使用示例
 * @author:zhangjianfeng
 * @create:2021-53-26-18:53
 **/
@Slf4j
public class ValveTypeDemo {
    public static void demo1(){
        //compile error
    //int num =9999999999999999999999;

    }
    public static void demo10(){
        float f = 30.3f;
        int x = (int) f;
        log.info("x = {}",x);
        log.info("10 / 3 = {}",((float)  10 / 3));

    }

    public static void demo2(){
       int max = Integer.MAX_VALUE;
       log.info("整形的最大值：{）", max);
       log.info("整形的最大值 + 1：{）", (max + 1));
       log.info("整形的最大值 + 2：{）", (max + 2));
       log.info("整形的最大值 + 2：{）", ((long)max + 2));

    }
    public static void demo3(){
        char ch1 = 'a';
        char ch2 = 97;
        log.info("ch1 = {}",ch1);
        log.info("ch2 = {}",ch2);
    }

    public static void demo4(){
        char ch1 = '\"';
        char ch2 = '\\';
        log.info("ch1 = {}",ch1);
        log.info("ch2 = {}",ch2);
        log.info("\"Hello World!\"");
    }

    public static void demo5(){
        float num = 3.0f;
        log.info("两个小数相乘：{}",num * num);

    }

    public static void demo6(){
        boolean flag = true;
        log.info("flag = {}",flag);
    }

    public static void demo7(){
        int x = 30;
        float y = 22.19f;
        log.info("x / y = {}",(x / y));
        log.info("10 / 3.5 = {}",(10/ 3.5));
        log.info("10 / 3 = {}",(10 / 3));
    }

    public static void demo8(){
       String str = "Super Man";
       int x = 30;
       str = str + x;
       log.info("str = {}",str);
    }

    public static void demo9(){
        int i = 1;
        int j = 2;
        log.info("i+2 = {}",1 +2);
        log.info("j+2 = {}", (1 + 2));
    }

    public static void main(String[] args) throws Exception {
        for (int i= 1;i <= 10 ;i++){
            Method method = ValveTypeDemo.class.getMethod("demo" + i);
            method.invoke(null);
        }
    }
}
