package com.lele.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lele.springcloud.entities.CommonResult;

/**
 * @author: lele
 * @date: 2021/4/10 21:55
 * @description:
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");

    }
}
