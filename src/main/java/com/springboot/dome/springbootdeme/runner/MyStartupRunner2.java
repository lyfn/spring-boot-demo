package com.springboot.dome.springbootdeme.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Auther: Administrator
 * @Date: 2018/6/4 0004 22:24
 * @Description:服务启动执行
 */

@Component
@Order(2)
public class MyStartupRunner2 implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 ORDER 22222 <<<<<<<<<<<<<");
    }
}
