package com.wangchg.study.design.pattern.c02;

public abstract class AbstractHumanFactory {
    /**
     * 产生一个人类
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> c);
}
