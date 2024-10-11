package com.qf.ex;
// 演示异常API
public class Demo5 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (Exception e){
            String message = e.getMessage();
            System.out.println("message==> "+message);
            String string = e.toString();
            System.out.println("string==> "+string);
            System.out.println("----------------------");
            e.printStackTrace(); // 将错误信息打印到控制台
        }
    }
}
