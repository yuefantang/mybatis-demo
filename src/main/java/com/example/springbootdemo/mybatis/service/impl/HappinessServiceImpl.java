package com.example.springbootdemo.mybatis.service.impl;

import com.example.springbootdemo.mybatis.dao.HappinessMapper;
import com.example.springbootdemo.mybatis.dao.UserMapper;
import com.example.springbootdemo.mybatis.domain.Happiness;
import com.example.springbootdemo.mybatis.domain.User;
import com.example.springbootdemo.mybatis.service.HappinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service实现类
 *
 * @author TYF
 * @date 2018/12/24
 * @since 1.0.0
 */
@Service
@Slf4j
public class HappinessServiceImpl implements HappinessService {
    @Autowired
    private HappinessMapper happinessMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public void findHappinessByCity(String city) {
        log.info("findHappinessByCity start-------");
        Happiness happiness = happinessMapper.findHappinessByCity(city);
        String city1 = happiness.getCity();
        Integer num = happiness.getNum();
        System.out.println("cityName:" + city1);
        System.out.println("num:" + num);
        log.info("findHappinessByCity end-------");
    }

    @Override
    public int insertHappiness(String city, Integer num) {
        log.info("insertHappiness start-------");
        int i = happinessMapper.insertHappiness(city, num);
        System.out.println("insert:" + i);
        log.info("insertHappiness end-------");
        return i;
    }

    @Override
    public int updateByCity(String city, Long id) {
        log.info("updateByCity start-------");
        int i = happinessMapper.updateByCity(city, id);
        System.out.println("update:" + i);
        log.info("updateByCity end-------");
        return i;
    }

    @Override
    public int deleteByCity(String city) {
        log.info("deleteByCity start-------");
        int i = happinessMapper.deleteByCity(city);
        System.out.println("delete:" + i);
        log.info("deleteByCity end-------");
        return i;
    }

    @Override
    public void findHappinessByCityXml(String city) {
        log.info("findHappinessByCityXml start-------");
        List<Happiness> happinessByCity = happinessMapper.findHappinessByCityXml(city);
        happinessByCity.forEach(happiness -> {
            System.out.println("cityName:" + happiness.getCity());
            System.out.println("num:" + happiness.getNum());
        });
        log.info("findHappinessByCityXml end-------");
    }

    @Override
    public void selectByPrimaryKey(Long id) {
        log.info("selectByPrimaryKey start-------");
        User user = userMapper.selectByPrimaryKey(id);
        System.out.println("cityName:" + user.getUserName());
        System.out.println("num:" + user.getId());
        log.info("selectByPrimaryKey end-------");
    }
}
