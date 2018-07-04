package com.springboot.dome.springbootdeme.controller;

import com.springboot.dome.springbootdeme.beandefinition.Shanhy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: liyinfan
 * Date: 2018-06-04
 * Time: 9:33
 */

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

//    @Resource(name="shanhyA")
//    private Shanhy shanhyA;
//
//    @Autowired
//    @Qualifier("shanhyB")
//    private Shanhy shanhyB;

    @RequestMapping
    public String hello() {
        return "Hello Spring-Boot";
    }

    @RequestMapping("/info")
    public Map<String, String> getInfo(@RequestParam String name) {
        Map<String, String> map = new HashMap<>(16);
        map.put("name", name);
        return map;
    }

    @RequestMapping("/list")
    public List<Map<String, String>> getList() {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map;
        for (int i = 1; i <= 5; i++) {
            map = new HashMap<>();
            map.put("name", "Shanhy-" + i);
            list.add(map);
        }
        return list;
    }


}
