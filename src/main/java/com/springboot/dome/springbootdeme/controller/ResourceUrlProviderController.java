package com.springboot.dome.springbootdeme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

/**
 * 处理静态资源URL
 * @Auther: Administrator
 * @Date: 2018/6/4 0004 21:51
 * @Description:静态资源版本管理
 */

@ControllerAdvice
public class ResourceUrlProviderController {

    @Autowired
    private ResourceUrlProvider resourceUrlProvider;

    @ModelAttribute("urls")
    public ResourceUrlProvider urls(){
        return this.resourceUrlProvider;
    }

}
