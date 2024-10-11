package com.qf.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo4 {


    public class Super{
        public void eat(){

        }
    }

    class Sub extends Super{
        @Override
        public void eat() {
            try {
                new SimpleDateFormat("").parse("");
            }catch (Exception ex){

            }
        }
    }
}
