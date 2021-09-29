package top.zjf.java.basic.enumeration;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: IntelliJ IDEA
 * @description: 利用枚举实例单例
 * @author:zhangjianfeng
 * @create:2021-38-29-19:38
 **/
@Slf4j
public class SingletonEnumDemo {
    private enum singletonEnum{
        INSTANCE;
        private String name;

        public String getName(){
            return name;
        }
        public  void setName(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        singletonEnum.INSTANCE.setName("soft");
        log.info(singletonEnum.INSTANCE.getName());
    }
}
