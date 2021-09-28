package top.zjf.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-50-28-20:50
 **/
@Slf4j
public class CanditionalOperatorDemo {
    public static void main(String[] args) {
        int a,b;a = 10;
        b = ( a == 1) ? 20 : 30;
        log.info( "Value of b is : " + b );
        b = (a == 10)? 20 :30;
        log.info( "Value of b is : " + b );

    }
}
