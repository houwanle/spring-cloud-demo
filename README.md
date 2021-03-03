## spring-cloud-demo
> spring cloud 学习笔记

### 1. 环境
约定 > 配置 > 编码

- spring cloud：Hoxton.SR1
- spring boot：2.2.2.RELEASE
- spring cloud Alibaba：2.1.0.RELEASE
- jdk：1.8
- maven：3.5及以上（阿里云仓库）
- mysql：5.7及以上
- lombok：idea 插件

### 2. 模块划分
- cloud-provider-payment8001：服务提供者-----支付模块
- cloud-consumer-order80：服务消费者-----订单模块
- cloud-api-commons：自定义jar包-----公共模块
- cloud-eureka-server7001：服务注册中心------Eureka模块
