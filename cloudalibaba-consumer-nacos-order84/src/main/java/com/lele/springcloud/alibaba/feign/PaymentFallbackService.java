package com.lele.springcloud.alibaba.feign;

import com.lele.springcloud.alibaba.service.PaymentService;
import com.lele.springcloud.entities.CommonResult;
import com.lele.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author: lele
 * @date: 2021/4/11 7:16
 * @description:
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }

}
