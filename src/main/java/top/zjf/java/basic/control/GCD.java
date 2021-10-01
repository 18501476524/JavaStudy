package top.zjf.java.basic.control;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: IntelliJ IDEA
 * @description:最大公约数
 * @author:zhangjianfeng
 * @create:2021-47-01-19:47
 **/@Slf4j
public class GCD {
    public static void main(String[] args) {
        int resultByLoop = getGCDByLoop(12, 36);
        log.info("12和36的最大公约数是:{}", resultByLoop);
        int resultByRecursion = getGCDByRecursion(35, 21);
        log.info("35和21的最大公约数是:{}", resultByRecursion);

    }

    private static int getGCDByLoop(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        while (a%b!=0){
            int temp = a%b;
            a = b;
            b= temp;
        }
        return b;
    }

    public static int getGCDByRecursion(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return a % b == 0 ? b : getGCDByRecursion(b, a % b);
    }
}
