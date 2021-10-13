package top.zjf.java.basic.control;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author:zhangjianfeng
 * @create:2021-58-01-20:58
 **/
public class ClimbStairs {

    public int climbStairs(int n) {
        int i = 1;
        if(n <= 0) {
            return 0;
        }
        if (n == 1) {
            return i;
        }
        if (n == 2) {
            i++;
            return i;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }


    public static void main(String[] args) {
        ClimbStairs cs = new ClimbStairs();
        int a = cs.climbStairs(4);
        System.out.println(a);
    }
}

