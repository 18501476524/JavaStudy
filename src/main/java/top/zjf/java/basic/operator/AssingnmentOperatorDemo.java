package top.zjf.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-31-28-20:31
 **/
@Slf4j
public class AssingnmentOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        log.info( "c = a + b =" +c);

        c += a;
        log.info( "c += a=" +c);

        c -= a;
        log.info( "c -= a =" +c);
        c*= a;
        log.info("c *= a =" +c);
        a = 10;
        c = 15;c /= a;
        log.info( "c /= a =" +c);
        a = 10;
        c = 15;c=a;
        log.info( "c = a = " +c);
        c <<= 2;
        log.info( "c <<= 2 =" +c);
        c >>= 2;
        log.info( "c >>= 2 =" +c);
        c >>= 2;
        log.info( "c >>= 2=" +c);
        c &= a;
        log.info("c &= a = " +c);
        c ^= a;
        log.info( "c ^= a = " +c);
        c |=a;
        log.info( "c l= a-" +c);

    }
}
