package com.example.springbootdemo.mybatis.service;

/**
 * Service类
 *
 * @author TYF
 * @date 2018/12/24
 * @since 1.0.0
 */
public interface HappinessService {

    //查询
    void findHappinessByCity(String city);

    //插入
    int insertHappiness(String city, Integer num);

    //更新
    int updateByCity(String city, Long id);

    //删除
    int deleteByCity(String city);
}
