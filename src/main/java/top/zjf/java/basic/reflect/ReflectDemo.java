package top.zjf.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-46-07-18:46
 **/@Slf4j
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchMethodException,IllegalAccessException,InstantiationException,
            InvocationTargetException,NoSuchFieldException {
        Class<?> targetClass = Class.forName("top.zjf.java.basic.reflect.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.getDeclaredConstructor().newInstance();
        Method[] methods = targetClass.getDeclaredMethods();
        for (Method method : methods){
            log.info("all methods:{}", method.getName());
        }
        Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject,"Java");

        Field field = targetClass.getDeclaredField("value");
        field.setAccessible(true);
        field.set(targetObject,"JavaStudy");

        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);

    }
}
