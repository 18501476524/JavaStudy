package top.zjf.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-39-28-20:39
 **/
@Slf4j
public class RelationOperatorDemo {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        log.info( "x == y = " +(x == y ));
        log.info( "x !=y =" +(x !=y ));
        log.info( "x > y =" +(x > y ));
        log.info( "x < y = " +(x< y ));
        log.info( "x >= y =" +(x >= y ));
        log.info( "x<=y =" +(x <=y ));
    }
}
