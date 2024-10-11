package com.qf.ex;

public class AgeOutOfBoundsException extends Exception{
    public AgeOutOfBoundsException(int age) {
        super(String.valueOf(age));
    }
}
