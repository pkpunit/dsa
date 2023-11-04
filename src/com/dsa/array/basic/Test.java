package com.dsa.array.basic;

import java.util.Optional;

public class Test {

    public int value;

    public int hashCode(){

        System.out.println(value);
        return value^5;
    }

    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.hashCode());

        Optional GOT = Optional.of("GOT");

        String[] str = new String[10];

        Optional strOpt = Optional.ofNullable(str[9]);

        System.out.println(GOT.isPresent());
        System.out.println(strOpt.isPresent());
    }
}


