package com.example.springbootdemo.mybatis.common;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;

/**
 * TODO:请添加描述
 *
 * @author TYF
 * @date 2018/12/27
 * @since 1.0.0
 */
public class HappinessDeleteProvider {

    public String deleteByCity(@Param("city") String city) {
        // return "delete from happiness where city=#{city}";
        return new SQL() {
            {
                DELETE_FROM("happiness");
                WHERE(" city=#{city}");
            }
        }.toString();
    }
}
