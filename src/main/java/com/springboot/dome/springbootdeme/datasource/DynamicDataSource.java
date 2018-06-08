package com.springboot.dome.springbootdeme.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.lang.Nullable;

/**
 * @author liyinfan
 * @Title: ${FILE_NAME}
 * @Package com.springboot.dome.springbootdeme.datasource
 * @Description: 动态数据源
 * @date 2018-06-0817:33
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

    @Nullable
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}
