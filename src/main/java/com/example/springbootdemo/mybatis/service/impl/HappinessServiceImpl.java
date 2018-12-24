package com.example.springbootdemo.mybatis.service.impl;

import com.example.springbootdemo.mybatis.dao.HappinessDao;
import com.example.springbootdemo.mybatis.domain.Happiness;
import com.example.springbootdemo.mybatis.service.HappinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    private HappinessDao happinessDao;

    @Override
    public void findHappinessByCity(String city) {
        log.info("findHappinessByCity start-------");
        Happiness happiness = happinessDao.findHappinessByCity(city);
        String city1 = happiness.getCity();
        Integer num = happiness.getNum();
        System.out.println("cityName:" + city1);
        System.out.println("num:" + num);
        log.info("findHappinessByCity end-------");
    }
}
