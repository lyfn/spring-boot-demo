package com.springboot.dome.springbootdeme.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Auther: Administrator
 * @Date: 2018/6/4 0004 22:21
 * @Description:服务启动执行
 */

@Component
public class MyStartupRunner implements CommandLineRunner{
    private static final Logger logger = LoggerFactory.getLogger(MyStartupRunner.class);

    @Override
    public void run(String... args) throws Exception {

        logger.debug("slf4j ???? 莫名其妙哦******************************************************************");
        logger.error("slf4j ???? 错误%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        logger.info("slf4j INFO @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
    }
}
