package com.springboot.dome.springbootdeme.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Auther: Administrator
 * @Date: 2018/6/4 0004 22:25
 * @Description:服务启动执行
 * /*@Order 注解的执行优先级是按value值从小到大顺序。
 */


@Component
@Order(1)
public class MyStartupRunner1 implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 ORDER 111111 <<<<<<<<<<<<<");
    }
}
