package top.zjf.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-10-06-21:10
 **/
@Slf4j
public class ClassDemo {
    public static void main(String[] args) {
        Class clazz1 = null;
        try {
            clazz1 = Class.forName("top.zjf.java.basic.reflect.User");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }


        Class clazz2 = User.class;

        User user = new User();
        Class clazz3 = user.getClass();

        log.info("clazz1-clazz2-clazz3:{},{},{}",clazz1,clazz2,clazz3);
        log.info(String.valueOf(clazz1 == clazz2));
        log.info(String.valueOf(clazz3 == clazz2));
    }
}
