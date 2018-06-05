package com.springboot.dome.springbootdeme.controller;

import com.springboot.dome.springbootdeme.dao.IScoreDao;
import com.springboot.dome.springbootdeme.entity.Score;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: liyinfan
 * Date: 2018-06-05
 * Time: 14:47
 */

@RestController
@RequestMapping("/score")
public class ScoreController {

    private static final Logger logger = LoggerFactory.getLogger(ScoreController.class);

    @Autowired
    private IScoreDao scoreService;

    @RequestMapping("/scoreList")
    public List<Score> getScoreList(){
        System.out.println("123123123123132");
        logger.info("从数据库读取Score集合"+scoreService.getList());
        // 测试更新数据库
        logger.info("更新的行数：" + scoreService.updateScoreById(99.8f, 2));
        //scoreService.deleteById(3);

        return scoreService.getList();
    }
}
