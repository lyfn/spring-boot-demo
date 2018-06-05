package com.springboot.dome.springbootdeme.mapper;

import com.springboot.dome.springbootdeme.config.mybatis.MyMapper;
import com.springboot.dome.springbootdeme.entity.Student;

import java.util.List;

/**
 * User: liyinfan
 * Date: 2018-06-05
 * Time: 15:21
 * StudentMapper，映射SQL语句的接口，无逻辑实现
 */
public interface StudentMapper extends MyMapper<Student>{

    List<Student> likeName(String name);

    Student getById(int id);

    String getNameById(int id);
}
