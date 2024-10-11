package com.qf.ex;

public class Demo6 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally {
            System.out.println("最终执行的...");
        }
    }
}
