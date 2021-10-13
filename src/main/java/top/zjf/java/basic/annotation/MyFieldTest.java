package top.zjf.java.basic.annotation;

import lombok.extern.slf4j.Slf4j;


import java.lang.reflect.Field;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-24-10-23:24
 **/
@Slf4j
public class MyFieldTest {
    private static MyField annotation;
    @MyField(description = "学习之路", length =12)
    private  String username;

    public static void main(String[] args) {
        Class<MyFieldTest> c = MyFieldTest.class;
        for(Field f :c.getDeclaredFields()){
            if (f.isAnnotationPresent(MyField.class)) {

               MyField annotation = f.getAnnotation(MyField.class);
                log.info("字段：{},描述：{}，长度{}",f.getName(),annotation.description(),annotation.length());
            }
        }
    }
}
