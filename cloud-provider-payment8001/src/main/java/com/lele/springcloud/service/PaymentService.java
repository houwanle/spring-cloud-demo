package com.lele.springcloud.service;

import com.lele.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: lele
 * @date: 2021/2/28 22:01
 * @description:
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
