package com.springboot.dome.springbootdeme.config;

import com.springboot.dome.springbootdeme.beandefinition.Shanhy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liyinfan
 * @date 2018-07-04 14:53
 * @Description:测试参数注入
 */

@Configuration
public class MyConfiguration {

//    @Bean
//    public FilterRegistrationBean filterRegistrationBean(@Qualifier("shanhyB") Shanhy shanhy) {
//        FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
//        shanhy.display();
//        // 省略代码
//        return filterRegistration;
//    }

}
