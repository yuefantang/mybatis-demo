package com.example.springbootdemo.mybatis.dao;

import com.example.springbootdemo.mybatis.common.HappinessDeleteProvider;
import com.example.springbootdemo.mybatis.domain.Happiness;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 查询表的dao
 *
 * @author TYF
 * @date 2018/12/24
 * @since 1.0.0
 */
@Mapper
public interface HappinessDao {

    @Results({
            @Result(property = "id", column = "id", id = true),
            @Result(property = "city", column = "city")
    })
    @Select("SELECT * FROM happiness WHERE city = #{city}")
    Happiness findHappinessByCity(@Param("city") String city);

    @Insert("INSERT INTO happiness(city, num) VALUES(#{city}, #{num})")
    int insertHappiness(@Param("city") String city, @Param("num") Integer num);

    @Update("update happiness set city=#{city} where id=#{id}")
    int updateByCity(@Param("city") String city, @Param("id") Long id);

    @DeleteProvider(type = HappinessDeleteProvider.class, method = "deleteByCity")
   // @Delete("delete from happiness where city=#{city}")
    int deleteByCity(@Param("city") String city);
}
