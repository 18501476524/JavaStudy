package top.zjf.java.basic.dataype;

import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.math.BigInteger;

/**
 * @program: IntelliJ IDEA
 * @description: 数值溢出
 * @author:zhangjianfeng
 * @create:2021-42-27-07:42
 **/
@Slf4j
public class ValueOverflow {
    public static void main(String[] args) {
        log.info("=============== wrong1 ==============");
        wrong();
        log.info("=============== right1 ==============");
        right1();
        log.info("=============== right2 ==============");
        right2();

    }

    private static  void wrong(){
        long l = Long.MAX_VALUE;
        log.info(String.valueOf(l + 1));
        log.info(String.valueOf(l +1 == Long.MIN_VALUE));
    }

    private static void right1(){
        try {
            long l = Long.MAX_VALUE;
            System.out.println(Math.addExact(l,1));
        } catch (Exception ex){
            log.error(ex.toString());
        }

    }

    private static void right2(){
        BigInteger i = new BigInteger(String.valueOf(Long.MAX_VALUE));
        log.info(i.add(BigInteger.ONE).toString());
        try {
            long longValue = i.add(BigInteger.ONE).longValueExact();
            log.info(String.valueOf(longValue));
        } catch (Exception ex){
            log.error(ex.toString());
        }
    }
}
