package top.zjf.java.basic.dataype;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: IntelliJ IDEA
 * @description: Integer判断
 * @author:zhangjianfeng
 * @create:2021-21-27-19:21
 **/
@Slf4j
public class IntegerEquals {
    public static void main(String[] args) {
        Integer a =  127;
        Integer b =  127;
        log.info("a == b ? {}", a == b);

        Integer c =  128;
        Integer d =  128;
        log.info("c == d ? {}", c == d);

        Integer e =  127;
        Integer f =  new Integer(127);
        log.info("e == f ? {}", e== f);

        Integer g = new Integer(127) ;
        Integer h =  new Integer(127);
        log.info("g == h ? {}", g == h);

        Integer l =  128;
        int j =  128;
        log.info("l == j ? {}", l== j);
    }
}
