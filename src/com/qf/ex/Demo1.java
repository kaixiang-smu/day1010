package com.qf.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException, ArithmeticException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2024-10-10");
        System.out.println(parse);

        System.out.println(1/0);

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
}
