package top.zjf.java.basic.variable;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
/**
 * @program: IntelliJ IDEA
 * @description: 变量demo
 * @author:zhangjianfeng
 * @create:2021-12-26-10:12
 **/
@Slf4j
public class VariableDemo {
    /**
     * 实例变量
     */
    private  static int staticVar = 1024;
    private String instanceVar = "hello";

    /**
     *实例方法
     */

    public void method(){
        //局部变量
        int localVar = 666;

        log.info("localVar before:{}",localVar);
        localVar = 888;
        log.info("localVar after ：{}",localVar);
    }

    /**
     * 静态方法
     *
     * @param args args
     */

    public static void main(String[] args) {
        //访问类变量 （静态变量），无需实例化对象

        log.info("staticVar before:{}",staticVar);
        staticVar = 2048;
        log.info("staticVar after ：{}",staticVar);
        VariableDemo vd = new VariableDemo();
        log.info("staticVar before:{}",vd.instanceVar);
        vd.instanceVar = "world";
        log.info("staticVar after:{}",vd.instanceVar);
        vd.method();
    }

}
