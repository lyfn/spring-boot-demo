package com.springboot.dome.springbootdeme.dao;

import com.springboot.dome.springbootdeme.entity.Score;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * User: liyinfan
 * Date: 2018-06-05
 * Time: 14:30
 */
public interface IScoreDao extends CrudRepository<Score,Integer> {

    @Transactional
    @Modifying
    @Query("update Score t set t.score = :score where t.id = :id")
    int updateScoreById(@Param("score") float score, @Param("id") int id);

    @Query("select t from Score t ")
    List<Score> getList();
}
