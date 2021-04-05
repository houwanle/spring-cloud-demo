package com.lele.springcloud.alibaba.service.impl;

import com.lele.springcloud.alibaba.dao.AccountDao;
import com.lele.springcloud.alibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author: lele
 * @date: 2021/4/5 21:03
 * @description:
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------>account-service中扣减账户余额开始");

        // 模拟超时异常，全局事务回滚
//        try {
//            TimeUnit.SECONDS.sleep(20);
//        } catch(InterruptedException e) {
//            e.printStackTrace();
//        }

        accountDao.decrease(userId, money);
        LOGGER.info("------>account-service中扣减账户余额结束");
    }
}
