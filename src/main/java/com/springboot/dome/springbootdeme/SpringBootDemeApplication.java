package com.springboot.dome.springbootdeme;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.springboot.dome.springbootdeme.mapper")
public class SpringBootDemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemeApplication.class, args);
	}


//	@Bean
//    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
//
//        return  new ServletRegistrationBean(dispatcherServlet,"/*");
//    }
}
