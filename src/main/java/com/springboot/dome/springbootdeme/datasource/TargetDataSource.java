package com.springboot.dome.springbootdeme.datasource;

import java.lang.annotation.*;

/**
 * @author liyinfan
 * @Title: ${FILE_NAME}
 * @Package com.springboot.dome.springbootdeme.datasource
 * @Description:  在方法上使用，用于指定使用哪个数据源
 * @date 2018-06-0817:43
 */

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String name();
}
