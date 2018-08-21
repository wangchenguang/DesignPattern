package com.wangchg.study.design.pattern.c02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NvWa {
    private static final Logger LOGGER = LoggerFactory.getLogger(NvWa.class);

    public static void main(String[] args) {
        AbstractHumanFactory yinYangLu = new HumanFactory();
        //女娲第一次造人，火候不足，于是白人产生了
        LOGGER.info("--造出的第一批人是白色人种--");
        Human whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        //女娲第二次造人，火候过足，于是黑人产生了
        LOGGER.info("--造出第二批人是黑色人种--");
        Human blackHuman = yinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        //女娲第三次造人，火候刚刚好，于是黄色人种产生了
        LOGGER.info("--造出的第三批人是黄色人种--");
        Human yellowHuman = yinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
