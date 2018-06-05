package com.springboot.dome.springbootdeme.controller;

import com.springboot.dome.springbootdeme.entity.Student;
import com.springboot.dome.springbootdeme.mapper.StudentMapper;
import com.springboot.dome.springbootdeme.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: liyinfan
 * Date: 2018-06-05
 * Time: 13:38
 */

@RestController
@RequestMapping("/stu")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/list")
    public List<Student> getStus(){
        logger.info("从数据库读取Student集合");
        return studentService.getList();
    }

    @RequestMapping("/likeName")
    public List<Student> likeName(@RequestParam String name){
        return studentMapper.likeName(name);
    }

    @RequestMapping("/byid")
    public Student getId(@RequestParam int id){
        return studentMapper.getById(id);
    }


}
