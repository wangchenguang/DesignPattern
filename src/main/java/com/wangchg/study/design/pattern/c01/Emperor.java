package com.wangchg.study.design.pattern.c01;

public class Emperor {
    private static final Emperor EMPEROR = new Emperor();

    private Emperor() {
    }

    public static Emperor getInstance() {
        return EMPEROR;
    }

    public void say() {
        System.out.println("我就是皇帝某某某.....");
    }
}
