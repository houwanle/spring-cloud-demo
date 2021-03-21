package com.lele.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: lele
 * @date: 2021/3/21 8:44
 * @description:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_OK------";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_TimeOut------";
    }
}
