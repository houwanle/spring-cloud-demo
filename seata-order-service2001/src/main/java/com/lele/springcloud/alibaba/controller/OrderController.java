package com.lele.springcloud.alibaba.controller;

import com.lele.springcloud.alibaba.domain.CommonResult;
import com.lele.springcloud.alibaba.domain.Order;
import com.lele.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: lele
 * @date: 2021/4/5 19:04
 * @description:
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

}
