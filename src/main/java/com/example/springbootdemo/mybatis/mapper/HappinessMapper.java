package com.example.springbootdemo.mybatis.mapper;

import com.example.springbootdemo.mybatis.domain.Happiness;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * TODO:请添加描述
 *
 * @author TYF
 * @date 2018/12/27
 * @since 1.0.0
 */
@Mapper
public interface HappinessMapper {

    List<Happiness> findHappinessByCityXml(@Param("city") String city);
}
