package com.ordinaryyzh.javase.jvm.demo1;

/**
 * @author OrdinaryYZH
 * @date 2018/3/19 14:03
 */
public class NotInitialization {

    static {
        System.out.println("NotInitialization static init");
    }

    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
