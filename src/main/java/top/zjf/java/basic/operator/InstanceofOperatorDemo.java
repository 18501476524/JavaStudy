package top.zjf.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

import javax.xml.catalog.Catalog;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-59-28-20:59
 **/
@Slf4j
public class InstanceofOperatorDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        boolean result = animal instanceof Cat;
        log.info(String.valueOf(result));
    }
    static class Animal{

    }

    static class Cat extends Animal{

    }
}
