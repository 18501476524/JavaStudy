package top.zjf.java.basic.param;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-07-12-22:07
 **/
@Slf4j
public class VariableLenParam {
    public static int func(int... args){
        int result = 1;
        for(int i :args){
            result +=1;

        }
        return result;
    }

    public static void main(String[] args) {
        log.info("1*2*3 = {}",func(1,2,3));
        log.info("2*2*2*2*2={}",func(2,2,2,2,2));
        log.info("100*1000 = {}",func(100,1000));
    }
}
