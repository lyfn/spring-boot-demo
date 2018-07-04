package com.springboot.dome.springbootdeme.datasource;

import java.lang.annotation.*;

/**
 * @author liyinfan
 * @date 2018-07-04 15:43
 * @Description:
 */

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String name();
}
