package com.lele.springcloud.alibaba.service;

import com.lele.springcloud.alibaba.feign.PaymentFallbackService;
import com.lele.springcloud.entities.CommonResult;
import com.lele.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: lele
 * @date: 2021/4/11 7:14
 * @description:
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
