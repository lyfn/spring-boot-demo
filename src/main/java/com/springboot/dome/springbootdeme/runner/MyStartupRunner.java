package com.springboot.dome.springbootdeme.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Auther: Administrator
 * @Date: 2018/6/4 0004 22:21
 * @Description:服务启动执行
 */

@Component
public class MyStartupRunner implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
    }
}
