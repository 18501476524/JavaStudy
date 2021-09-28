package top.zjf.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-35-28-20:35
 **/
@Slf4j
public class LogicalOperatorDemo {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        log.info( "a && b = " +( a && b));
        log.info( "a ll b = " +( a || b ));
        log.info( " ! (a && b) = " + !(a && b ));
    }
}
