package top.zjf.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-42-07-18:42
 **/
@Slf4j
public class TargetObject {
    private final String value;

    public TargetObject(){
        this.value = "default";

    }
    public void publicMethod(String s){
        log.info("I love" + s);

    }

    private void privateMethod(){
        log.info("value is" + value);
    }

}
