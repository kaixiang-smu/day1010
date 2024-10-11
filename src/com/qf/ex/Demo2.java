package com.qf.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 演示异常层层向上抛出
 * 主方法是入口
 * 从上至下依此逐行执行
 * 遇到方法调用方法执行，方法执行完继续向下
 */
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        m1();
    }
    public static void m1() throws ParseException {
        System.out.println("m1前");
        m2();
        System.out.println("m1后");
    }
    public static void m2() throws ParseException {
        System.out.println("m2前");
        m3();
        System.out.println("m2后");
    }
    public static void m3() throws ParseException {
        System.out.println("m3前");
        SimpleDateFormat sdf = new SimpleDateFormat("");
        sdf.parse("");
        System.out.println("m3后");
    }
}
