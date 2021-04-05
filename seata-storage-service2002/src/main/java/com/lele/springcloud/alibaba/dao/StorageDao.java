package com.lele.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: lele
 * @date: 2021/4/5 19:39
 * @description:
 */
@Mapper
public interface StorageDao {
    // 扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
