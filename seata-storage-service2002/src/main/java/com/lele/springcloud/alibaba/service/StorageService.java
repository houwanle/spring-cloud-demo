package com.lele.springcloud.alibaba.service;

/**
 * @author: lele
 * @date: 2021/4/5 19:50
 * @description:
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}
