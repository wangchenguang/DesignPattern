package com.wangchg.study.design.pattern.c01;

public class Minister {
    public static final int DAYS = 3;

    public static void main(String[] args) {
        for (int day = 0; day < DAYS; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
