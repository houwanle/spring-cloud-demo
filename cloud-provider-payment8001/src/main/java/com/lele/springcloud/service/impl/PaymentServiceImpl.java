package com.lele.springcloud.service.impl;

import com.lele.springcloud.dao.PaymentDao;
import com.lele.springcloud.entities.Payment;
import com.lele.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: lele
 * @date: 2021/2/28 22:02
 * @description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
