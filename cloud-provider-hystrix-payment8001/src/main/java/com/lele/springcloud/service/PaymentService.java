package com.lele.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author: lele
 * @date: 2021/3/20 13:53
 * @description:
 */
@Service
public class PaymentService {

    /**
     * 正常访问：肯定OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName()+"  paymentInfo_OK,id:" + id+"\t"+"哈哈~";
    }

    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+ Thread.currentThread().getName()+"  paymentInfo_OK,id" + id+"\t"+"~~"+"耗时（秒）"+timeNumber;
    }
}
