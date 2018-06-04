//package com.springboot.dome.springbootdeme;
//
//import com.springboot.dome.springbootdeme.servletregister.MyServlet;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.servlet.ServletComponentScan;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.DispatcherServlet;
//
///**
// * User: liyinfan
// * Date: 2018-06-04
// * Time: 11:16
// */
//
//@SpringBootApplication
//public class SpringBootSampleApplication {
//
//    /**
//     * 使用代码注册Servlet（不需要@ServletComponentScan注解）
//     *
//     * @return
//     */
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean() {
//        // ServletName默认值为首字母小写，即myServlet
//        return new ServletRegistrationBean(new MyServlet(), "/xs/*");
//    }
//
//
//    /**
//     * 修改DispatcherServlet默认配置
//     *
//     * @param dispatcherServlet
//     * @return
//     * @author
//     * @create
//     */
//    @Bean
//    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
//        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
//        registration.getUrlMappings().clear();
//        registration.addUrlMappings("*.do");
//        registration.addUrlMappings("*.json");
//        return registration;
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringBootSampleApplication.class, args);
//    }
//}
