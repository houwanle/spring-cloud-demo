package com.lele.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: lele
 * @date: 2021/4/5 19:09
 * @description:
 */
@Configuration
@MapperScan({"com.lele.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
