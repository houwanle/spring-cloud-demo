package com.lele.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: lele
 * @date: 2021/3/18 21:59
 * @description:
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLever() {
        return Logger.Level.FULL;
    }
}
