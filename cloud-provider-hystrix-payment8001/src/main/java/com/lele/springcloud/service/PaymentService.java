package com.lele.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="5000")
    })
    public String paymentInfo_TimeOut(Integer id) {
//        int timeNumber = 5;
//         int age = 10/0;
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
//        return "线程池："+ Thread.currentThread().getName()+"  paymentInfo_OK,id" + id+"\t"+"~~"+"耗时（秒）"+timeNumber;
        return "线程池："+ Thread.currentThread().getName()+"  paymentInfo_OK,id" + id+"\t"+"哈哈~~"+"耗时（秒）";
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池："+Thread.currentThread().getName()+"  8001系统繁忙或者运行报错，请稍候再试,id: "+id+"\t"+"(╥╯^╰╥)";
    }
}
