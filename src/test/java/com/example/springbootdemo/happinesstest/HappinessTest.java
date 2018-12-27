package com.example.springbootdemo.happinesstest;

import com.example.springbootdemo.SpringbootDemoApplicationTests;
import com.example.springbootdemo.mybatis.service.HappinessService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * TODO:请添加描述
 *
 * @author TYF
 * @date 2018/12/24
 * @since 1.0.0
 */
public class HappinessTest extends SpringbootDemoApplicationTests {

    @Autowired
    private HappinessService happinessService;

    @Test
    public void findHappinessByCity() {
        happinessService.findHappinessByCity("上海");
    }

    @Test
    public void insertHappiness() {
        happinessService.insertHappiness("北京", 1);
    }

    @Test
    public void updateByCity() {
        happinessService.updateByCity("南京", 1l);
    }

    @Test
    public void deleteByCity() {
        happinessService.deleteByCity("北京");
    }

    @Test
    public void findHappinessByCityXml() {
        happinessService.findHappinessByCityXml("南京");
    }

}
