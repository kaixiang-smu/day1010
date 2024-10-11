package com.qf.ex;
// 捕获异常
public class Demo3 {
    public static void main(String[] args) {
        try {// try里面写的是想要被捕获异常的代码
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
        }catch (ArithmeticException ae){ // 准备要捕获的异常类名
            // catch内写的是抓住之后要做的事情
            // 发短信，记录日志，记录数据库
            // 或者最简单的操作：将错误信息再输出
        }
    }
}
