package com.example.springbootdemo.mybatis.domain;

import lombok.Data;

/**
 * 表实体类
 *
 * @author TYF
 * @date 2018/12/24
 * @since 1.0.0
 */
@Data
public class Happiness {
    private Long id;
    private String city;
    private Integer num;
}
