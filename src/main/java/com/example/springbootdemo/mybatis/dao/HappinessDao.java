package com.example.springbootdemo.mybatis.dao;

import com.example.springbootdemo.mybatis.domain.Happiness;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 查询表的dao
 *
 * @author TYF
 * @date 2018/12/24
 * @since 1.0.0
 */
@Mapper
public interface HappinessDao {

    @Select("SELECT * FROM happiness WHERE city = #{city}")
    Happiness findHappinessByCity(@Param("city") String city);

    @Insert("INSERT INTO happiness(city, num) VALUES(#{city}, #{num})")
    int insertHappiness(@Param("city") String city, @Param("num") Integer num);
}
